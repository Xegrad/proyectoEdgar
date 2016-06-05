-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-06-2016 a las 00:35:04
-- Versión del servidor: 5.7.12-log
-- Versión de PHP: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prodb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `Producto` varchar(40) NOT NULL,
  `Codigo` varchar(10) NOT NULL,
  `Cantidad` varchar(10) NOT NULL,
  `PrecioC` varchar(10) NOT NULL,
  `PrecioV` varchar(10) NOT NULL,
  `Proveedor` varchar(20) NOT NULL,
  `Fecha` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`Producto`, `Codigo`, `Cantidad`, `PrecioC`, `PrecioV`, `Proveedor`, `Fecha`) VALUES
('Macbook pro 13', '0001', '2', '13000', '16000', 'MAC', '05/06/2016'),
('HP 430 Notebook', '0002', '2', '3500', '5500', 'HP', '05/06/2016'),
('Toshiba Satellite ', '0003', '2', '6000', '8500', 'TOSHIBA', '05/06/2016'),
('Laptop Razer Blade', '0004', '2', '16000', '19000', 'RAZER', '05/06/2016'),
('Procesador A8-7410', '0010', '2', '5500', '6500', 'AMD', '05/06/2016'),
('Procesador i5-4210', '0011', '2', '4500', '5500', 'INTEL', '05/06/2016'),
('Memoria RAM HyperX 8GB', '0012', '2', '1200', '1500', 'KINGSTON', '05/06/2016'),
('Teclado Blackwidow Chroma', '0018', '2', '1300', '1600', 'RAZER', '05/06/2016'),
('Tarjeta grafica GTX950', '0020', '2', '3400', '4000', 'NVIDIA', '04/06/2016'),
('Mouse Razer Naga Chroma', '0030', '6', '800', '1200', 'RAZER', '04/06/2016');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`Codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
