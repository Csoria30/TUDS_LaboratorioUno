-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-06-2023 a las 00:16:35
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_universidad_g11`
--
CREATE DATABASE IF NOT EXISTS `db_universidad_g11` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `db_universidad_g11`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `id_alumno` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`id_alumno`, `dni`, `apellido`, `nombre`, `fecha_nacimiento`, `estado`) VALUES
(1, 32412345, 'Godoy', 'Rodrigo', '1998-05-23', 1),
(2, 42384394, 'Rosales', 'Camila Fatima', '2004-06-01', 1),
(3, 45382543, 'Soloa Villegas', 'Marcos Tiziano', '2004-01-13', 1),
(6, 32412325, 'Ignes', 'Francisco Rafael', '1998-05-23', 1),
(7, 29426181, 'Vilchez', 'Marina', '1992-05-23', 1),
(8, 32038743, 'Di Gennaro', 'Sergio', '1993-08-15', 1),
(9, 31542877, 'Claveles', 'Isabel', '1988-04-15', 1),
(10, 27135603, 'Valle', 'Jose Luis', '1975-12-30', 1),
(11, 41721617, 'Suarez', 'Agustina', '1990-10-13', 1),
(12, 37505332, 'Lezcano', 'Ruben', '1988-07-08', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `id_inscripcion` int(11) NOT NULL,
  `nota` double NOT NULL,
  `id_alumno` int(11) NOT NULL,
  `id_materia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`id_inscripcion`, `nota`, `id_alumno`, `id_materia`) VALUES
(1, 7, 1, 1),
(2, 8.5, 1, 5),
(3, 8, 2, 1),
(4, 8, 2, 3),
(5, 6, 3, 3),
(10, 7, 3, 2),
(11, 7.5, 9, 7),
(12, 9, 8, 7),
(13, 10, 6, 8),
(14, 9.5, 7, 4),
(15, 7, 6, 4),
(16, 7, 8, 6),
(17, 4, 7, 9),
(18, 9.5, 9, 9),
(19, 7, 10, 15),
(20, 9, 8, 20),
(21, 10, 11, 19),
(22, 7.5, 10, 20),
(23, 10, 1, 18),
(24, 8.5, 12, 19),
(25, 3, 12, 17),
(26, 7, 11, 16),
(27, 8, 12, 16);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `anio` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id_materia`, `nombre`, `anio`, `estado`) VALUES
(1, 'Programacion 1', 1, 1),
(2, 'Taller de Lecto-escritura', 1, 1),
(3, 'Programacion 2', 1, 1),
(4, 'Laboratorio de Programacion 1', 1, 1),
(5, 'Estructura de Datos y Algoritmos', 1, 1),
(6, 'Administracion de Bases de Datos', 2, 1),
(7, 'Programacion Web', 2, 1),
(8, 'Matematica 1', 2, 1),
(9, 'Ingles Tecnico 1', 2, 1),
(10, 'Ingenieria en Software', 2, 1),
(11, 'Laboratorio de programacion 2', 2, 1),
(12, 'Programacion para dispositivos Moviles', 2, 1),
(13, 'Programacion en entorno .NET', 2, 1),
(14, 'Matematica 2', 2, 1),
(15, 'Ingles Tecnico 2', 2, 1),
(16, 'Metodologia de desarrollo', 2, 1),
(17, 'Laboratorio de programacion 3', 2, 1),
(18, 'Ingles Tecnico 3', 3, 1),
(19, 'Redes', 3, 1),
(20, 'Seguridad Informatica', 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `contrasenia` varchar(50) NOT NULL,
  `rol` varchar(20) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `contrasenia`, `rol`, `estado`) VALUES
(1, 'cristians', '1234', 'docente', 1),
(2, 'alumno', '1111', 'alumno', 1),
(3, 'lrojas', '0000', 'docente', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`id_alumno`),
  ADD UNIQUE KEY `dni_UNIQUE` (`dni`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`id_inscripcion`),
  ADD KEY `id_alumno_idx` (`id_alumno`),
  ADD KEY `id_materia_idx` (`id_materia`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`id_materia`),
  ADD UNIQUE KEY `nombre_UNIQUE` (`nombre`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `id_alumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `id_inscripcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `id_materia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `id_alumno` FOREIGN KEY (`id_alumno`) REFERENCES `alumno` (`id_alumno`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_materia` FOREIGN KEY (`id_materia`) REFERENCES `materia` (`id_materia`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
