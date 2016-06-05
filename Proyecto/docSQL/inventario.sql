-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-06-2016 a las 00:39:14
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
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `Producto` varchar(40) NOT NULL,
  `Codigo` varchar(10) NOT NULL,
  `Cantidad` varchar(10) DEFAULT NULL,
  `Precio` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`Producto`, `Codigo`, `Cantidad`, `Precio`) VALUES
('Macbook pro 13', '0001', '2', '16000'),
('HP 430 Notebook', '0002', '1', '5500'),
('Toshiba Satellite ', '0003', '2', '8500'),
('Laptop Razer Blade', '0004', '2', '19000'),
('Procesador A8-7410', '0010', '2', '6500'),
('Procesador i5-4210', '0011', '2', '5500'),
('Memoria RAM HyperX 8GB', '0012', '2', '1500'),
('Teclado Blackwidow Chroma', '0018', '2', '1600'),
('Tarjeta grafica GTX950', '0020', '2', '4000'),
('Mouse Razer Naga Chroma', '0030', '3', '1200');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`Codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
