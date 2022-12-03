-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 23-11-2022 a las 21:33:18
-- Versión del servidor: 10.5.12-MariaDB-cll-lve
-- Versión de PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `u456266784_mysqltest`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `correo` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `apellido` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `comentario1` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `comentario2` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_machine` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `correo`, `nombre`, `apellido`, `comentario1`, `comentario2`, `id_machine`, `estado`) VALUES
(121, 'emirmatos@hotmail.com', 'emir', 'matos', 'posible cambio id ', '', '90BC89116839FA8A9C582480A58092CD', 0),
(122, 'so307755@gmail.com', 'jose antonio', 'bernal', '', '', '77D822BF0DCC35DA5A08148909DD9E00', 0),
(123, 'netillodiaz@hotmail.com', 'ernesto', 'diaz', '', '43B1DF9355CD06F947DB0F2B444B4022,43B1DF9355CD06F947DB0F2B444B4022,43B1DF9355CD06F947DB0F2B444B4022,43B1DF9355CD06F947DB0F2B444B4022', 'BFAFB41B24528F056E1BB5451970BEF3', 0),
(124, 'xpareja@yahoo.com', 'xavier', 'pareja', '', '', '7EA48AEACC5DB59F18C223AB9E0B7B40', 0),
(125, 'maurocasado.mmo@gmail.com', 'mauro ', 'casado', '', '', 'FD00EF7DEFD0B81BA16D4744FC86F239', 0),
(126, 'hugo_laraz@yahoo.com.mx', 'hector hugo', 'lara', '', '', '3ADCEBCC2D8A6A916875683A0C80071B', 0),
(127, 'christian_barrie@hotmail.com', 'christian', 'barrientos', '', '', '35AB64C66F081FA21B5F867E2D23FCA3', 0),
(128, 'ixos82@gmail.com', 'ivan', 'oliveira', '', '', '79C4A2DE1220C0C82A57B630FE051BA5', 0),
(129, 'gonzalezifm@hotmail.com', 'jose', 'gonzales', '', '', '68F87B4BB55C07B122DF2B3C18F1AE15', 0),
(130, 'yotubendo@gmail.com', 'miguel', 'baez', 'paypal de delma rubio', '', '44B9512A39DBD6A1F56F209269346F30', 0),
(131, 'aldanavelajuanjavier@gmail.com', 'juan javier', 'aldana', '', '', 'AF0B11E4A01F1F46014E63FDFCBEA694', 0),
(132, 'emwng@shaw.ca', 'eduard', 'ng', 'canadiense', '', '7243A76BFF3FDFFC5648BF3CA3D47AC1', 0),
(133, 'prokkieinvest@gmail.com', 'Jacques', 'Oosthuizen', '', '', 'C857ED7B85CF0C6332EC8CEB46FAF1D5', 0),
(134, 'Karloslevit@gmail.com', 'carlos ', 'abreu', '', '', 'D5013A906C1DE5835AECD0BCA51024C3', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `id` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precio_compra` double NOT NULL,
  `producto_id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `factura_id` int(11) NOT NULL,
  `precio_final` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`id`, `cantidad`, `precio_compra`, `producto_id`, `cliente_id`, `factura_id`, `precio_final`) VALUES
(149, 1, 497, 1, 121, 119, 497),
(150, 1, 497, 1, 122, 120, 397.6),
(151, 1, 497, 1, 123, 121, 497),
(152, 1, 497, 1, 124, 122, 384.181),
(153, 1, 288, 15, 125, 123, 288),
(154, 1, 288, 15, 126, 124, 288),
(155, 1, 197, 40, 127, 125, 150.70499999999998),
(156, 1, 97, 50, 127, 125, 97),
(157, 1, 192, 25, 128, 126, 192),
(158, 1, 497, 1, 129, 127, 347.9),
(159, 1, 397, 35, 129, 127, 397),
(160, 1, 197, 40, 130, 128, 197),
(161, 1, 197, 40, 131, 129, 151.69),
(162, 1, 97, 50, 131, 129, 97),
(163, 1, 497, 1, 130, 130, 497),
(164, 1, 497, 1, 132, 131, 497),
(165, 1, 497, 1, 133, 132, 497),
(166, 1, 497, 1, 134, 133, 497);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `id` int(11) NOT NULL,
  `compra_activa` int(1) NOT NULL,
  `fecha_compra` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `valor_compra` double NOT NULL,
  `medio_pago_id` int(11) NOT NULL,
  `tipo_pago_id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`id`, `compra_activa`, `fecha_compra`, `valor_compra`, `medio_pago_id`, `tipo_pago_id`, `cliente_id`) VALUES
(119, 0, '2021-11-17', 497, 1, 3, 121),
(120, 0, '2021-11-28', 397.6, 1, 3, 122),
(121, 0, '2021-12-17', 497, 1, 3, 123),
(122, 0, '2021-12-20', 384.181, 1, 3, 124),
(123, 0, '2022-01-24', 288, 1, 3, 125),
(124, 0, '2022-03-31', 288, 1, 3, 126),
(125, 0, '2022-05-26', 247.70499999999998, 1, 3, 127),
(126, 0, '2022-05-30', 192, 1, 3, 128),
(127, 0, '2022-07-17', 744.9, 1, 3, 129),
(128, 0, '2022-08-15', 197, 1, 3, 130),
(129, 0, '2022-09-04', 248.69, 1, 3, 131),
(130, 0, '2022-09-08', 497, 1, 3, 130),
(131, 0, '2022-09-29', 497, 1, 3, 132),
(132, 0, '2022-09-30', 497, 1, 3, 133),
(133, 0, '2022-10-13', 497, 1, 3, 134);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medio_pago`
--

CREATE TABLE `medio_pago` (
  `id` int(11) NOT NULL,
  `medio_pago` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `medio_pago`
--

INSERT INTO `medio_pago` (`id`, `medio_pago`) VALUES
(1, 'paypal OTM'),
(2, 'Paypal cristian'),
(3, 'teachable'),
(4, 'nequi y otros'),
(8, 'nequi');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `id` int(11) NOT NULL,
  `fecha_pago` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `valor_pago` double NOT NULL,
  `valor_pago_neto` double NOT NULL,
  `factura_id` int(11) NOT NULL,
  `fecha_desembolso` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `pago`
--

INSERT INTO `pago` (`id`, `fecha_pago`, `valor_pago`, `valor_pago_neto`, `factura_id`, `fecha_desembolso`, `estado`) VALUES
(179, '2021-11-17', 497, 469.86199999999997, 119, '2021-11-17', 0),
(180, '2021-11-28', 397.6, 375.8296, 120, '2021-11-28', 0),
(181, '2021-12-17', 497, 469.86199999999997, 121, '2021-12-17', 0),
(182, '2021-12-20', 384.181, 363.135226, 122, '2021-12-20', 0),
(183, '2022-01-24', 288, 272.14799999999997, 123, '2022-01-24', 0),
(184, '2022-03-31', 288, 272.14799999999997, 124, '2022-03-31', 0),
(185, '2022-05-26', 247.70499999999998, 234.02892999999997, 125, '2022-05-26', 0),
(186, '2022-05-30', 192, 181.332, 126, '2022-05-30', 0),
(187, '2022-07-17', 744.9, 704.3754, 127, '2022-07-17', 0),
(188, '2022-08-15', 197, 186.06199999999998, 128, '2022-08-15', 0),
(189, '2022-09-04', 248.69, 234.96074, 129, '2022-09-04', 0),
(190, '2022-09-08', 497, 469.86199999999997, 130, '2022-09-08', 0),
(191, '2022-09-29', 497, 469.86199999999997, 131, '2022-09-29', 0),
(192, '2022-09-30', 497, 469.86199999999997, 132, '2022-09-30', 0),
(193, '2022-10-13', 497, 469.86199999999997, 133, '2022-10-13', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `nombre`, `precio`) VALUES
(1, 'OTM pack unico', 497),
(3, 'OTM Pack cuotas', 500),
(15, 'OTM Swing', 288),
(20, 'OTM profile', 288),
(25, 'OTM micro', 192),
(30, 'OTM cumulated', 192),
(35, 'Logic pack', 397),
(40, 'Logic Order flow', 197),
(45, 'Logic profile', 197),
(50, 'Logic analytics', 97);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_pago`
--

CREATE TABLE `tipo_pago` (
  `id` int(11) NOT NULL,
  `tipo_pago` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `tipo_pago`
--

INSERT INTO `tipo_pago` (`id`, `tipo_pago`) VALUES
(3, 'unico'),
(4, 'cuotas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `rol` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `password`, `rol`, `user`) VALUES
(14, '$argon2id$v=19$m=1024,t=1,p=1$8xszoRqAvonCOHc488Dxxg$h1y62DymcUyr00ajUpIdvAwIRQzywXexBeLZhoAUQuA', 'USER', 'pepe'),
(15, '$argon2id$v=19$m=1024,t=1,p=1$G8EY65wQvsBotcAA+QnH2Q$PtuSWcheaWzLxcSfpIBjfpPQAuQokx/tcFatbg7KwmA', 'USER', 'homero'),
(19, '$argon2id$v=19$m=1024,t=1,p=1$KOTG08lAZt52RI4vPRhdIQ$jSXWW6IrgOh+Y2ShwoIop9bYuMpbOMlT68/QhZl4sPU', 'USER', 'cristianccuellar@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK97ou9971advpgw6qt45twenms` (`producto_id`),
  ADD KEY `FKni21w35sfgo033m8l93ki11ab` (`cliente_id`),
  ADD KEY `FKqd1uksgoyea7f41ynj9a55e73` (`factura_id`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK1055c4lgd1coowjtnxpvp4iih` (`medio_pago_id`),
  ADD KEY `FKdgknf2vdj6r2fftyhtdjbw0sf` (`tipo_pago_id`),
  ADD KEY `FK2602efsrpmevi8yxg464stfn5` (`cliente_id`);

--
-- Indices de la tabla `medio_pago`
--
ALTER TABLE `medio_pago`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKrtu0je6xnvrvwuflslyslq2eo` (`factura_id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo_pago`
--
ALTER TABLE `tipo_pago`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=135;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=167;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=134;

--
-- AUTO_INCREMENT de la tabla `medio_pago`
--
ALTER TABLE `medio_pago`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `pago`
--
ALTER TABLE `pago`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=194;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `tipo_pago`
--
ALTER TABLE `tipo_pago`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `FK97ou9971advpgw6qt45twenms` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`),
  ADD CONSTRAINT `FKni21w35sfgo033m8l93ki11ab` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `FKqd1uksgoyea7f41ynj9a55e73` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `FK1055c4lgd1coowjtnxpvp4iih` FOREIGN KEY (`medio_pago_id`) REFERENCES `medio_pago` (`id`),
  ADD CONSTRAINT `FK2602efsrpmevi8yxg464stfn5` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `FKdgknf2vdj6r2fftyhtdjbw0sf` FOREIGN KEY (`tipo_pago_id`) REFERENCES `tipo_pago` (`id`);

--
-- Filtros para la tabla `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `FKrtu0je6xnvrvwuflslyslq2eo` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
