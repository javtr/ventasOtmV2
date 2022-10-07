package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.*;
import com.example.ventasOtmV2.repository.ClienteRepository;
import com.example.ventasOtmV2.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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



    @Override
    public void saveRegistro(Registro registro) {

        System.out.println(registro);

        //Cliente
        Cliente regCliente = new Cliente(registro.getNombre(),registro.getApellido(), registro.getCorreo());
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

        //compras

        for (int i = 0; i < registro.getProductoComprado().size(); i++) {

            double precioProducto = 0;

            if ( registro.getProductoComprado().get(i).isDescuento()){
                precioProducto = registro.getProductoComprado().get(i).getPrecioFinal();
            }else{
                precioProducto = registro.getProductoComprado().get(i).getPrecio();
            }


            Integer idProductoIt =(registro.getProductoComprado().get(i).getProducto()-1);
            Integer idProductoSr =productoService.getAll().get(idProductoIt).getId();

            System.out.println("precioProducto: "+ precioProducto);
            System.out.println("idProductoIt: "+ idProductoIt);
            System.out.println("getCantidad: "+  registro.getProductoComprado().get(i).getCantidad());
            System.out.println("idProductoIt: "+  idProductoIt);
            System.out.println("idProductoSr: "+  idProductoSr);

            System.out.println("ProductoIt: "+  productoService.get(idProductoSr));
            System.out.println("clienteService: "+  clienteService.getCliente(idCliente));
            System.out.println(idFactura);
            System.out.println("facturaService: "+  facturaRepository.existsById(idFactura));
            System.out.println("facturaService: "+  facturaRepository.findById(14).get());



            //Compra compra = new Compra(precioProducto,registro.getProductoComprado().get(i).getCantidad(),productoService.get(idProductoSr),clienteService.getCliente(idCliente),facturaService.get(idFactura));
            //System.out.println(compra);

        }




    }
}