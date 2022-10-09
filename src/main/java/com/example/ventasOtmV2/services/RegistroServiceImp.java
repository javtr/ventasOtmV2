package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.*;
import com.example.ventasOtmV2.repository.ClienteRepository;
import com.example.ventasOtmV2.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class RegistroServiceImp implements RegistroService{


    @Autowired
    private ClienteService clienteService;

    @Autowired
    private MedioPagoService medioPagoService;

    @Autowired
    private TipoPagoService tipoPagoService;

    @Autowired
    private FacturaService facturaService;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private CompraService compraService;

    @Autowired
    private PagoService pagoService;



    @Override
    public void saveRegistro(Registro registro) throws ParseException {

        System.out.println(registro);

        //Cliente
        Cliente regCliente = new Cliente(registro.getNombre(),registro.getApellido(), registro.getCorreo(), registro.getIdMachine(), registro.getComentario1(), registro.getComentario2());
        Integer idCliente = (clienteService.saveCliente(regCliente)).getId();

        //medio pago
        List<MedioPago> listaPagos =  medioPagoService.getAll();
        Integer idMedioPago = null;

        for (int i = 0; i < listaPagos.size(); i++) {
            if ( listaPagos.get(i).getMedioPago().equals(registro.getMedioPago())){
                idMedioPago = listaPagos.get(i).getId();
            }
        }

        //tipo pago
        List<TipoPago> listaTipos =  tipoPagoService.getAll();
        Integer idTipoPago = null;

        for (int i = 0; i < listaTipos.size(); i++) {
            if ( listaTipos.get(i).getTipoPago().equals(registro.getTipoPago())){
                idTipoPago = listaTipos.get(i).getId();
            }
        }

        //total compra

        List<ProductoComprado> pruductosCompra = registro.getProductoComprado();
        double totalCompra = 0;

        for (int i = 0; i < pruductosCompra.size(); i++) {
            if ( pruductosCompra.get(i).isDescuento()){
                totalCompra = totalCompra + pruductosCompra.get(i).getPrecioFinal();
            }else{
                totalCompra = totalCompra + pruductosCompra.get(i).getPrecio();
            }
        }

        //factura
        Factura factura = new Factura(registro.getFecha(),totalCompra,true,medioPagoService.get(idMedioPago),tipoPagoService.get(idTipoPago),clienteService.getCliente(idCliente));
        Integer idFactura = (facturaService.save(factura)).getId();
        Factura facturaSend = new Factura(idFactura);

        //compras

        double totalTodasCompras = 0;
        double precioOriginal = 0;

        for (int i = 0; i < registro.getProductoComprado().size(); i++) {

            double precioProducto = 0;

            precioOriginal = registro.getProductoComprado().get(i).getPrecio();

            if ( registro.getProductoComprado().get(i).isDescuento()){
                precioProducto = registro.getProductoComprado().get(i).getPrecioFinal();
                totalTodasCompras = totalTodasCompras +precioProducto;
            }else{
                precioProducto = registro.getProductoComprado().get(i).getPrecio();
                totalTodasCompras = totalTodasCompras +precioProducto;
            }


            Integer idProductoIt =(registro.getProductoComprado().get(i).getProducto()-1);
            Integer idProductoSr =productoService.getAll().get(idProductoIt).getId();

            Producto productoSend = new Producto(idProductoSr);
            Cliente clienteSend = new Cliente(idCliente);

            Compra compra = new Compra(precioOriginal,precioProducto,registro.getProductoComprado().get(i).getCantidad(),productoSend,clienteSend,facturaSend);
            compraService.save(compra);
        }

        //pagos
        String tipoPagoReg = registro.getTipoPago();
        Integer numeroCuotas = registro.getCuotas();
        double feeCuota = 0.9;

        if (tipoPagoReg.equals("cuotas") && numeroCuotas>1){

            String fechaPago = registro.getFecha();
            Date fechaPagoDate =new SimpleDateFormat("yyyy-MM-dd").parse(fechaPago);
            double pagoCuota = totalTodasCompras / numeroCuotas;


            //por cada cuota
            for (int i = 0; i < numeroCuotas; i++) {

                //obtener calendario, darle la fecha de pago y aumentar un mes por cuota
                Calendar cal = Calendar.getInstance();
                cal.setTime(fechaPagoDate);
                cal.add(Calendar.MONTH, i);

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dateCuota = sdf.format(cal.getTime());

                //calcular fecha de desembolso
                //aumentar un mes y setear el dia del mes a primero

                Calendar fechaDesembolso = cal;
                fechaDesembolso.add(Calendar.MONTH, 1);
                fechaDesembolso.set(Calendar.DAY_OF_MONTH, 1);

                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                String dateCuotaDes = sdf2.format(fechaDesembolso.getTime());


                //guardar cada pago
                Pago pago = new Pago(dateCuota,dateCuotaDes,pagoCuota,(pagoCuota*feeCuota),facturaSend);
                System.out.println(pagoService.save(pago));



            }

        } else if (tipoPagoReg.equals("unico")) {


            //guardar el pago unico
            Pago pago = new Pago(registro.getFecha(),registro.getFecha(),totalTodasCompras,(totalTodasCompras*feeCuota),facturaSend);
            System.out.println(pagoService.save(pago));




        }


    }
}