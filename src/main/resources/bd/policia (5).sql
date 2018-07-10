-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-07-2018 a las 00:35:58
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `policia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arma`
--

CREATE TABLE `arma` (
  `id_arma` int(11) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `descripcion` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `arma`
--

INSERT INTO `arma` (`id_arma`, `marca`, `descripcion`) VALUES
(1, 'K8', '9 ml'),
(2, 'K10', '28 ml');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arma_incautada`
--

CREATE TABLE `arma_incautada` (
  `id_armaincau` int(11) NOT NULL,
  `id_opera` int(11) DEFAULT NULL,
  `id_arma` int(11) NOT NULL,
  `serie` varchar(50) NOT NULL,
  `descripcion` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `arma_incautada`
--

INSERT INTO `arma_incautada` (`id_armaincau`, `id_opera`, `id_arma`, `serie`, `descripcion`) VALUES
(5, 5, 1, '123', '9 ml'),
(6, 6, 2, '9698', '28 ml');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `delito`
--

CREATE TABLE `delito` (
  `id_deli` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `delito`
--

INSERT INTO `delito` (`id_deli`, `nombre`) VALUES
(1, 'C.V.C.S.'),
(2, 'CONTRA EL HONOR'),
(3, 'CONTRA LA FAMILIA'),
(4, 'C. LA LIBERTAD'),
(5, 'CONTRA EL PATRIMONIO'),
(6, 'C. LA CONFIANZA Y LA BUENA FE EN LOS NEGOCIOS'),
(7, 'C. LOS DERECHOS INTELECTUALES'),
(8, 'C. EL ORDEN ECONOMICO'),
(9, 'C. EL ORDEN FINANCIERO Y MONETARIO'),
(10, 'TRIBUTARIO'),
(11, 'CONTRA LA SEGURIDAD PUBLICA'),
(12, 'CONTRA LA TRANQUILIDAD PUBLICA'),
(13, 'CONTRA  LA HUMANIDAD'),
(14, 'CONT. LA ADM. PUBLICA'),
(15, 'CONTRA LA FÉ PÚBLICA'),
(16, 'CONTRA EL PATRIMONIO CULTURAL'),
(17, 'AMBIENTALES'),
(18, 'CONTRA EL ESTADO Y LA DEFENSA NACIONAL'),
(19, 'CONTRA LOS PODERES DEL ESTADO Y EL ORDEN CONSTITUCIONAL'),
(20, 'CONTRA LA VOLUNTAD POPULAR'),
(21, 'DELITOS INFORMATICOS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `denuncia`
--

CREATE TABLE `denuncia` (
  `id_denun` int(11) NOT NULL,
  `id_deli` int(11) NOT NULL,
  `id_tdelito` int(11) DEFAULT NULL,
  `id_stdelito` int(11) DEFAULT NULL,
  `id_sddelito` int(11) DEFAULT NULL,
  `id_moda` int(11) DEFAULT NULL,
  `fech_regis` date NOT NULL,
  `hora_regis` varchar(20) NOT NULL,
  `fech_hecho` date NOT NULL,
  `hora_hecho` varchar(20) NOT NULL,
  `afectado` varchar(50) NOT NULL,
  `direccion` varchar(250) NOT NULL,
  `descripcion` varchar(2000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `denuncia`
--

INSERT INTO `denuncia` (`id_denun`, `id_deli`, `id_tdelito`, `id_stdelito`, `id_sddelito`, `id_moda`, `fech_regis`, `hora_regis`, `fech_hecho`, `hora_hecho`, `afectado`, `direccion`, `descripcion`) VALUES
(2, 1, 2, 14, NULL, 2, '2018-07-08', '20:55', '2018-07-12', '03:19', 'CAMBISTAS', 'Jr Zavala', 'Descripcionsssss'),
(3, 2, 6, NULL, NULL, NULL, '2018-07-10', '20:50', '2018-07-13', '04:03', '--Seleccione--', 'Av Aviacion', 'Difamacion etc'),
(4, 2, 5, NULL, NULL, NULL, '2018-07-10', '20:50', '2018-07-13', '04:04', '--Seleccione--', 'direc', 'desc'),
(5, 2, 5, NULL, NULL, NULL, '2018-07-10', '20:50', '2018-07-14', '04:03', '--Seleccione--', 'direc', 'desc'),
(6, 2, 5, NULL, NULL, NULL, '2018-07-10', '20:50', '2018-07-14', '04:02', '--Seleccione--', 'direc', 'desc'),
(7, 9, 46, 130, NULL, NULL, '2018-07-10', '20:50', '2018-07-04', '04:01', '--Seleccione--', 'Castilla', 'roborvsdcd'),
(8, 1, 2, 13, NULL, 1, '2018-07-10', '20:50', '2018-07-11', '04:03', '--Seleccione--', 'dedcs', 'dsfsdfsdf');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `droga`
--

CREATE TABLE `droga` (
  `id_droga` int(11) NOT NULL,
  `id_opera` int(11) DEFAULT NULL,
  `tipo_droga` varchar(100) NOT NULL,
  `kg_droga` int(11) NOT NULL,
  `quetes_droga` int(11) NOT NULL,
  `descripcion` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `droga`
--

INSERT INTO `droga` (`id_droga`, `id_opera`, `tipo_droga`, `kg_droga`, `quetes_droga`, `descripcion`) VALUES
(7, 5, 'COCAÍNA', 23, 3, 'desc'),
(8, 6, 'COCAÍNA', 2, 5, 'edwsdasd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modalidad`
--

CREATE TABLE `modalidad` (
  `id_moda` int(11) NOT NULL,
  `id_stdelito` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `modalidad`
--

INSERT INTO `modalidad` (`id_moda`, `id_stdelito`, `nombre`) VALUES
(1, 1, 'POR ARMA DE FUEGO'),
(2, 1, 'ARMA BLANCA'),
(3, 1, 'OBJETO CONTUNDENTE'),
(4, 1, 'AGRESION'),
(5, 1, 'EXPLOSION'),
(6, 1, 'OTROS'),
(7, 2, 'POR ARMA DE FUEGO'),
(8, 2, 'ARMA BLANCA'),
(9, 2, 'OBJETO CONTUNDENTE'),
(10, 2, 'AGRESION'),
(11, 2, 'EXPLOSION'),
(12, 2, 'OTROS'),
(13, 23, 'ESCALAMIENTO'),
(14, 23, 'PATINAJE'),
(15, 23, 'LANZA'),
(16, 23, 'BOLERO'),
(17, 23, 'TENDEO'),
(18, 23, 'SISTEMATICO'),
(19, 23, 'GAMBUSINA'),
(20, 23, 'ARREBATO'),
(21, 23, 'ESCAPE'),
(22, 23, 'ESCAPE A DOMICILIO'),
(23, 23, 'MONRA'),
(24, 23, 'FORADO'),
(25, 23, 'OTROS'),
(26, 24, 'ARREBATO'),
(27, 24, 'ATRACO'),
(28, 24, 'COGOTE'),
(29, 24, 'PILLAJE O RAPINA'),
(30, 24, 'PEPAZO'),
(31, 24, 'MARCA'),
(32, 24, 'RAQUETEO'),
(33, 24, 'VITROCA'),
(34, 24, 'OTROS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municion`
--

CREATE TABLE `municion` (
  `id_munic` int(11) NOT NULL,
  `id_opera` int(11) DEFAULT NULL,
  `marca` varchar(100) NOT NULL,
  `calibre` varchar(100) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `descripcion` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `municion`
--

INSERT INTO `municion` (`id_munic`, `id_opera`, `marca`, `calibre`, `cantidad`, `descripcion`) VALUES
(2, 5, 'sad', '34', 34, 'dsf');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operativo`
--

CREATE TABLE `operativo` (
  `id_opera` int(11) NOT NULL,
  `tipo_opera` varchar(100) NOT NULL,
  `direccion` varchar(250) NOT NULL,
  `descripcion` varchar(2000) DEFAULT NULL,
  `fech_regis` date NOT NULL,
  `hora_regis` varchar(20) NOT NULL,
  `fech_hecho` date NOT NULL,
  `hora_hecho` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `operativo`
--

INSERT INTO `operativo` (`id_opera`, `tipo_opera`, `direccion`, `descripcion`, `fech_regis`, `hora_regis`, `fech_hecho`, `hora_hecho`) VALUES
(5, 'BLOQUEO DE VIAS', 'direc', 'desc', '2018-07-10', '05:00', '2018-07-06', '05:05'),
(6, 'PANDILLAJE', 'Grau', 'muchachos peleandose', '2018-07-10', '05:00', '2018-07-04', '18:22');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `otro`
--

CREATE TABLE `otro` (
  `id_otro` int(11) NOT NULL,
  `id_opera` int(11) DEFAULT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `otro`
--

INSERT INTO `otro` (`id_otro`, `id_opera`, `nombre`, `descripcion`) VALUES
(1, 5, 'Dinero Soles', '500 soles');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `papeleta`
--

CREATE TABLE `papeleta` (
  `id_pape` int(11) NOT NULL,
  `id_vehincau` int(11) DEFAULT NULL,
  `tipo_pape` varchar(100) NOT NULL,
  `stipo_pape` varchar(100) NOT NULL,
  `monto` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `papeleta`
--

INSERT INTO `papeleta` (`id_pape`, `id_vehincau`, `tipo_pape`, `stipo_pape`, `monto`) VALUES
(5, 8, 'Muy Grave', 'M05', '2075');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil`
--

CREATE TABLE `perfil` (
  `id_perfil` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `perfil`
--

INSERT INTO `perfil` (`id_perfil`, `nombre`) VALUES
(1, 'POLICIA'),
(2, 'ESTADISTICO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id_perso` int(11) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `apel_nomb` varchar(250) NOT NULL,
  `celular` varchar(9) NOT NULL,
  `direccion` varchar(250) NOT NULL,
  `nivel_grado` varchar(250) DEFAULT NULL,
  `ocupacion` varchar(250) NOT NULL,
  `fech_naci` date NOT NULL,
  `edad` int(11) NOT NULL,
  `tipo_perso` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id_perso`, `dni`, `apel_nomb`, `celular`, `direccion`, `nivel_grado`, `ocupacion`, `fech_naci`, `edad`, `tipo_perso`) VALUES
(1, '77229104', 'Yoel Patricio', '980797726', 'Av. Aviacion', '', 'Inf', '2018-06-27', 23, 'CIUDADANO'),
(3, '12345678', 'Javier Poli', '987456123', 'Av. Grau', 'TENIENTE', 'POLI', '2018-06-27', 23, 'POLICIA'),
(4, '02545678', 'Jose Delin', '987456123', 'Av. Grau', NULL, 'Taxi', '2018-06-27', 23, 'CIUDADANO'),
(5, '34242', '23DSFS SDFSDFSDF', 'D324234', 'DSFSDF', 'PRIMARIA INCOMPLETO', 'R23R23R', '2018-07-12', 32, 'CIUDADANO'),
(6, '14785236', 'lopex loped jose jose', '980797726', 'grau', 'PRIMARIA INCOMPLETO', 'estudiante', '2018-07-12', 25, 'CIUDADANO'),
(7, '12345711', 'lopex loped jose jose', '980797726', 'grau', 'PRIMARIA INCOMPLETO', 'estudiante', '2018-07-12', 25, 'CIUDADANO'),
(8, '12345711', 'lopex loped jose jose', '980797726', 'grau', 'PRIMARIA INCOMPLETO', 'estudiante', '2018-07-12', 25, 'CIUDADANO'),
(9, '3423', 'sdf sdf', '233', 'sdf', 'SECUNDARIA COMPLETO', 'sdfsdf', '2018-07-19', 32, 'CIUDADANO'),
(10, '3423', 'sdf sdf', '233', 'sdf', 'SECUNDARIA COMPLETO', 'sdfsdf', '2018-07-19', 32, 'CIUDADANO'),
(11, '342423', 'sdfsdf sdfsdf', 'sdf', 'sdfsd', 'SECUNDARIA INCOMPLETO', 'sdfsdfsdf', '2018-07-18', 23, 'CIUDADANO'),
(12, '12312323', 'sfsfsd ddddddd', '3423423', 'dddd', 'PRIMARIA INCOMPLETO', 'sdfsdf', '2018-07-19', 23, 'CIUDADANO'),
(13, '32423423', 'dfsdf sdfsdf', '32234', 'sdsdf', 'PRIMARIA INCOMPLETO', 'sdfsdf', '2018-07-12', 34, 'CIUDADANO'),
(14, '342342', 'dddd sdfsdf', '324234', 'ddd', 'SECUNDARIA INCOMPLETO', 'sdfsdfsdf', '2018-07-19', 23, 'CIUDADANO'),
(15, '324234', 'sdfsdf sdfsdf', 'sdfsdf', 'sdfsfsdf', 'SECUNDARIA COMPLETO', 'sdfsdfs', '2018-07-12', 23, 'CIUDADANO'),
(16, '23423', 'dfsdfsdf sdf', '2342', 'sdfsdf', 'SECUNDARIA COMPLETO', 'sdfsdf', '2018-07-19', 23, 'CIUDADANO'),
(17, '3435325', 'sdfsdf sdfsdf', '245234', 'sdfsdf', 'SECUNDARIA COMPLETO', 'sdfsdf', '2018-07-13', 4, 'CIUDADANO'),
(18, '1234', 'sdfsdfsdf sfsdfsdf', '234234', 'sdfsdfsf', 'SECUNDARIA COMPLETO', 'sdfsdfsf', '2018-07-12', 34, 'CIUDADANO'),
(19, '123', 'sdfsdf sdfsdf', '454353', 'sdfsd', 'SECUNDARIA COMPLETO', 'sdfsdfsdf', '2018-07-19', 34, 'CIUDADANO'),
(20, '11111', 'sdfsdfsdf dsfsdfsdf', '343242', 'dsfsdfsdf', 'PRIMARIA COMPLETO', 'general', '2018-07-12', 23, 'POLICIA'),
(21, '342342', 'sdfsf fffffffff', '32423', 'ffffffff', 'PRIMARIA INCOMPLETO', 'dsfsdf', '2018-07-19', 34, 'POLICIA'),
(22, '5664654', 'torres claudia', '98794654', '', 'SUPERIOR COMPLETO', 'estudiante', '2018-07-04', 21, 'CIUDADANO'),
(23, '3242342', 'dsfsdf sdfsdf', '32423', 'sdfsdf', 'SECUNDARIA COMPLETO', 'teneniente', '2018-07-13', 45, 'POLICIA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_denuncia`
--

CREATE TABLE `persona_denuncia` (
  `id_perden` int(11) NOT NULL,
  `id_denun` int(11) DEFAULT NULL,
  `id_opera` int(11) DEFAULT NULL,
  `id_perso` int(11) NOT NULL,
  `situacion` varchar(50) DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona_denuncia`
--

INSERT INTO `persona_denuncia` (`id_perden`, `id_denun`, `id_opera`, `id_perso`, `situacion`, `estado`) VALUES
(12, NULL, 5, 19, NULL, 'DETENIDO'),
(13, NULL, 5, 1, NULL, 'DETENIDO'),
(14, 3, NULL, 1, 'DENUN. Y VICT.', 'CITADO'),
(15, 3, NULL, 19, 'DENUNCIADO', 'DETENIDO'),
(16, 4, NULL, 1, 'DENUN. Y VICT.', 'CITADO'),
(17, 4, NULL, 19, 'DENUNCIADO', 'DETENIDO'),
(18, 5, NULL, 1, 'DENUN. Y VICT.', 'CITADO'),
(19, 5, NULL, 19, 'DENUNCIADO', 'DETENIDO'),
(20, 6, NULL, 1, 'DENUN. Y VICT.', 'CITADO'),
(21, 6, NULL, 19, 'DENUNCIADO', 'DETENIDO'),
(22, 7, NULL, 22, 'DENUN. Y VICT.', 'CITADO'),
(23, 7, NULL, 1, 'DENUNCIADO', 'DETENIDO'),
(24, NULL, 6, 1, NULL, 'DETENIDO'),
(25, 8, NULL, 1, 'DENUNCIANTE', 'NO HABIDO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_proceso`
--

CREATE TABLE `persona_proceso` (
  `id_perpro` int(11) NOT NULL,
  `id_perden` int(11) NOT NULL,
  `fiscal` varchar(200) NOT NULL,
  `sentencia` varchar(100) NOT NULL,
  `tiempo` varchar(100) NOT NULL,
  `n_tiempo` int(11) NOT NULL,
  `fech_pro` date NOT NULL,
  `hora_pro` varchar(20) NOT NULL,
  `fecha_libe` date NOT NULL,
  `hora_libe` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona_proceso`
--

INSERT INTO `persona_proceso` (`id_perpro`, `id_perden`, `fiscal`, `sentencia`, `tiempo`, `n_tiempo`, `fech_pro`, `hora_pro`, `fecha_libe`, `hora_libe`) VALUES
(1, 17, 'yoel', 'INOCENTE', 'MES', 12, '2018-07-10', '-', '2018-07-12', '-'),
(2, 23, 'chavarria', 'CULPABLE', 'AÑO', 10, '2018-07-10', '-', '2018-07-21', '-');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio_policial`
--

CREATE TABLE `servicio_policial` (
  `id_serpo` int(11) NOT NULL,
  `id_denun` int(11) NOT NULL,
  `id_perso` int(11) NOT NULL,
  `id_usua` int(11) NOT NULL,
  `condicion` varchar(50) NOT NULL,
  `costo` decimal(10,0) NOT NULL,
  `num_boucher` varchar(50) NOT NULL,
  `fech_soli` date NOT NULL,
  `hora_soli` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `servicio_policial`
--

INSERT INTO `servicio_policial` (`id_serpo`, `id_denun`, `id_perso`, `id_usua`, `condicion`, `costo`, `num_boucher`, `fech_soli`, `hora_soli`) VALUES
(5, 2, 1, 1, 'PAGADO', '34', '5345435', '2018-07-09', NULL),
(6, 2, 18, 1, 'GRATIS', '32', '123', '2018-07-09', NULL),
(7, 2, 1, 1, 'GRATIS', '23', '45679', '2018-07-09', NULL),
(8, 2, 1, 1, 'PAGADO', '56', '567576', '2018-07-10', NULL),
(9, 2, 1, 1, 'GRATIS', '34', '32423', '2018-07-10', NULL),
(10, 7, 1, 1, 'PAGADO', '54', '8598', '2018-07-10', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subdetalle_delito`
--

CREATE TABLE `subdetalle_delito` (
  `id_sddelito` int(11) NOT NULL,
  `id_stdelito` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `subdetalle_delito`
--

INSERT INTO `subdetalle_delito` (`id_sddelito`, `id_stdelito`, `nombre`) VALUES
(1, 164, 'CONT. O ADULTERACIÓN DE BIENES O INSUMOS DESTINADOS AL USO O CONSUMO HUMANO'),
(2, 164, 'CONT. O ADULTERACIÓN DE ALIMENTOS O BEBIDAS Y ALTERACIÓN DE LA FECHA DE VENCIMIENTO'),
(3, 164, 'PRODUCCIÓN, COMERCIALIZACIÓN O TRÁFICO ILÍCITO DE ALIMENTOS Y OTROS PRODUCTOS'),
(4, 164, 'USO DE PRODUCTOS TÓXICOS O PELIGROSOS'),
(5, 164, 'PRODUCCIÓN O COMERCIALIZACIÓN DE BEBIDAS ALCOHÓLICAS ILEGALES'),
(6, 164, 'PROPAGACIÓN DE ENFERMEDAD PELIGROSA O CONTAGIOSA'),
(7, 164, 'EJERCICIO ILEGAL DE LA MEDICINA'),
(8, 164, 'VIOLACIÓN DE MEDICINAS SANITARIAS'),
(9, 164, 'VENTA DE ANIMALES DE CONSUMO PELIGROSO'),
(10, 164, 'SUMINISTRO INFIEL DE PRODUCTOS FARMACÉUTICOS, DISPOSITIVOS MÉDICOS O PRODUCTOS SANITARIOS'),
(11, 164, 'FALSIFICACIÓN, CONTAMINACIÓN O ADULTERACIÓN DE PRODUCTOS FARMACÉUTICOS, DISPOSITIVOS MÉDICOS O PRODU'),
(12, 164, 'COMERCIALIZACIÓN DE PRODUCTOS FARMACÉUTICOS, DISPOSITIVOS MÉDICOS O PRODUCTOS SANITARIOS SIN GARANTÍ'),
(13, 165, 'PROMOCION O FAVORECIMIENTO AL TRAFICO ILICITO DE DROGAS'),
(14, 165, 'COMERCIALIZACION Y CULTIVO DE AMAPOLA Y MARIHUANA Y SUS SIEMBRAS COMPULSIVA'),
(15, 165, 'TRAFICO ILICITO DE INSUMOS QUIMICOS Y PRODUCTOS FISCALIZADOS'),
(16, 165, 'MICROCOMERCIALIZACION O MICROPRODUCCION'),
(17, 165, 'POSESION NO PUNIBLE'),
(18, 165, 'SUMINISTRO INDEBIDO DE DROGA'),
(19, 165, 'COACCION AL CONSUMO DE DROGA'),
(20, 165, 'INDUCCION O INSTIGACION AL CONSUMO DE DROGA'),
(34, 179, 'USURPACIÓN DE FUNCIÓN PÚBLICA'),
(35, 179, 'OSTENTACIÓN DE DISTINTIVOS DE FUNCIÓN O CARGOS QUE NO EJERCE'),
(36, 179, 'EJERCICIO ILEGAL DE PROFESIÓN'),
(37, 179, 'PARTICIPACIÓN EN EJERCICIO ILEGAL DE LA PROFESIÓN'),
(38, 180, 'VIOLENCIA CONTRA LA AUTORIDAD PARA OBLIGARLE A ALGO'),
(39, 180, 'VIOLENCIA CONTRA LA AUTORIDAD PARA IMPEDIR EL EJERCICIO DE SUS FUNCIONES'),
(40, 180, 'RESISTENCIA O DESOBEDIENCIA A LA AUTORIDAD'),
(41, 180, 'INGRESO INDEBIDO DE EQUIPOS O SISTEMA DE COMUNICACIÓN, FOTOGRAFÍA Y/O FILMACIÓN EN CENTROS DE DETENC'),
(42, 180, 'INGRESO INDEBIDO DE MATERIALES O COMPONENTES CON FINES DE ELABORACIÓN DE EQUIPOS DE COMUNICACIÓN EN '),
(43, 180, 'SABOTAJE DE LOS EQUIPOS DE SEGURIDAD Y DE COMUNICACIÓN EN ESTABLECIMIENTOS PENITENCIARIOS'),
(44, 180, 'POSESIÓN INDEBIDA DE TELÉFONOS CELULARES O, ARMAS, MUNICIONES O MATERIALES EXPLOSIVOS, INFLAMABLES, '),
(45, 180, 'INGRESO INDEBIDO DE ARMAS, MUNICIONES O MATERIALES EXPLOSIVOS, INFLAMABLES, ASFIXIANTES O TÓXICOS EN'),
(46, 180, 'VIOLENCIA CONTRA AUTORIDADES ELEGIDAS'),
(47, 180, 'ATENTADO CONTRA LA CONSERVACIÓN E IDENTIDAD DE OBJETO'),
(48, 180, 'NEGATIVA A COLABORAR CON LA ADMINISTRACIÓN DE JUSTICIA'),
(49, 180, 'ATENTADO CONTRA DOCUMENTOS QUE SIRVEN DE PRUEBA EN EL PROCESO'),
(50, 180, 'SUSTRACCIÓN DE OBJETOS REQUISADOS POR AUTORIDAD'),
(52, 182, 'ABUSO DE AUTORIDAD'),
(53, 182, 'ABUSO DE AUTORIDAD CONDICIONANDO ILEGALMENTE LA ENTREGA DE BIENES Y SERVICIOS'),
(54, 182, 'OTORGAMIENTO ILEGITIMO DE DERECHOS SOBRE INMUEBLES'),
(55, 182, 'OMISIÓN, REHUSAMIENTO O DEMORA DE ACTOS FUNCIONALES'),
(56, 182, 'DENEGACIÓN O DEFICIENTE APOYO POLICIAL'),
(57, 182, 'REQUERIMIENTO INDEBIDO DE LA FUERZA PÚBLICA'),
(58, 182, 'ABANDONO DE CARGO'),
(59, 182, 'NOMBRAMIENTO O ACEPTACIÓN ILEGAL'),
(60, 183, 'CONCUSIÓN'),
(61, 183, 'COBRO INDEBIDO'),
(62, 183, 'COLUSIÓN SIMPLE Y AGRAVADA'),
(63, 183, 'PATROCINIO ILEGAL'),
(64, 183, 'RESPONSABILIDAD DE PERITOS, ÁRBITROS Y CONTADORES PARTICULARES'),
(65, 184, 'PECULADO DOLOSO Y CULPOSO'),
(66, 184, 'PECULADO DE USO'),
(67, 184, 'MALVERSACIÓN'),
(68, 184, 'RETARDO INJUSTIFICADO DE PAGO'),
(69, 184, 'REHUSAMIENTO A ENTREGA DE BIENES DEPOSITADOS O PUESTOS EN CUSTODIA'),
(70, 184, 'EXTENSIÓN DEL TIPO'),
(71, 185, 'COHECHO PASIVO PROPIO'),
(72, 185, 'SOBORNO INTERNACIONAL PASIVO'),
(73, 185, 'COHECHO PASIVO IMPROPIO'),
(74, 185, 'COHECHO PASIVO ESPECÍFICO'),
(75, 185, 'CORRUPCIÓN PASIVA DE AUXILIARES JURISDICCIONALES'),
(76, 185, 'COHECHO ACTIVO GENÉRICO'),
(77, 185, 'COHECHO ACTIVO TRANSNACIONAL'),
(78, 185, 'COHECHO ACTIVO ESPECÍFICO'),
(79, 185, 'NEGOCIACIÓN INCOMPATIBLE O APROVECHAMIENTO INDEBIDO DE CARGO'),
(80, 185, 'TRÁFICO DE INFLUENCIAS'),
(81, 185, 'ENRIQUECIMIENTO ILÍCITO'),
(82, 186, 'DENUNCIA CALUMNIOSA'),
(83, 186, 'OCULTAMIENTO DE MENOR A LAS INVESTIGACIONES'),
(84, 186, 'ENCUBRIMIENTO PERSONAL'),
(85, 186, 'ENCUBRIMIENTO REAL'),
(86, 186, 'OMISIÓN DE DENUNCIA'),
(87, 186, 'FUGA DEL LUGAR DEL ACCIDENTE DE TRÁNSITO'),
(88, 186, 'FALSEDAD EN JUICIO'),
(89, 186, 'OBSTRUCCIÓN DE LA JUSTICIA'),
(90, 186, 'REVELACIÓN INDEBIDA DE IDENTIDAD'),
(91, 186, 'FALSA DECLARACIÓN EN PROCEDIMIENTO ADMINISTRATIVO'),
(92, 186, 'EXPEDICIÓN DE PRUEBA O INFORME FALSO EN PROCESO JUDICIAL'),
(93, 186, 'EVASIÓN MEDIANTE VIOLENCIA O AMENAZA'),
(94, 186, 'FAVORECIMIENTO A LA FUGA'),
(95, 186, 'AMOTINAMIENTO DE DETENIDO O INTERNO'),
(96, 186, 'FRAUDE PROCESAL'),
(97, 186, 'EJERCICIO ARBITRARIO DE DERECHO. JUSTICIA POR PROPIA MANO'),
(98, 186, 'INSOLVENCIA PROVOCADA'),
(99, 187, 'PREVARICATO'),
(100, 187, 'DETENCIÓN ILEGAL'),
(101, 187, 'PROHIBICIÓN DE CONOCER UN PROCESO QUE PATROCINÓ'),
(102, 187, 'PATROCINIO INDEBIDO DE ABOGADO O MANDATARIO JUDICIAL'),
(103, 188, 'NEGATIVA A ADMINISTRAR JUSTICIA'),
(104, 188, 'NEGATIVA AL CUMPLIMIENTO DE OBLIGACIONES DE NOTARIO Y AUXILIARES JURISDICCIONALES'),
(105, 188, 'OMISIÓN DE EJERCICIO DE LA ACCIÓN PENAL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subtipo_delito`
--

CREATE TABLE `subtipo_delito` (
  `id_stdelito` int(11) NOT NULL,
  `id_tdelito` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `subtipo_delito`
--

INSERT INTO `subtipo_delito` (`id_stdelito`, `id_tdelito`, `nombre`) VALUES
(1, 1, 'HOMICIDIO SIMPLE'),
(2, 1, 'PARRICIDIO'),
(3, 1, 'HOMICIDIO CALIFICADO (ASESINATO)'),
(4, 1, 'FEMINICIDIO'),
(5, 1, 'SICARIATO'),
(6, 1, 'LA CONSPIRACIÓN Y EL OFRECIMIENTO PARA EL DELITO DE SICARIATO'),
(7, 1, 'HOMICIDIO POR EMOCION VIOLENTA'),
(8, 1, 'INFANTICIDIO'),
(9, 1, 'HOMICIDIO CULPOSO'),
(10, 1, 'HOMICIDIO PIADOSO'),
(11, 1, 'INSTIGACIÓN O AYUDA AL SUICIDIO'),
(12, 1, 'TENTATIVA'),
(13, 2, 'LESIONES GRAVES'),
(14, 2, 'LESIONES LEVES'),
(15, 2, 'LESIONES PRETERINTENSIONALES CON RESULTADO FORTUITO'),
(16, 2, 'LESIONES CULPOSAS'),
(17, 2, 'DAÑOS AL CONCEBIDO'),
(18, 3, 'AUTOABORTO'),
(19, 3, 'ABORTO CONSENTIDO'),
(20, 3, 'ABORTO SIN CONSENTIMIENTO'),
(21, 3, 'ABORTO PRETERINTENCIONAL'),
(22, 3, 'ABORTO TERAPEUTICO'),
(23, 3, 'ABORTO SENTIMENTAL Y EUGENESICO'),
(24, 3, 'ABORTO CON MUERTE SUBITA'),
(25, 4, 'EXPOSICIÓN O ABANADONO PELIGROSOS'),
(26, 4, 'OMISION DE SOCORRO Y EXPOSICI0N A PELIGRO'),
(27, 4, 'OMISION DE AUXILIO O AVISO A AUTORIDAD'),
(28, 4, 'EXPOSICIÓN A PELIGRO DE PERSONA DEPENDIENTE'),
(32, 8, 'BIGAMIA'),
(33, 8, 'MATRIMONIO CON PERSONA CASADA'),
(34, 8, 'AUTORIZACIÓN ILEGAL DE MATRIMONIO'),
(35, 8, 'INOBSERVANCIA DE FORMALIDADES LEGALES'),
(36, 9, 'ALTERACION O SUPRESION DE ESTADO CIVIL'),
(37, 9, 'FINGIMIENTO DE EMBARAZO O PARTO'),
(38, 9, 'ALTERACIÓN O SUPRESIÓN DE FILIACIÓN DE MENOR'),
(39, 10, 'SUSTRACCION DE MENOR'),
(40, 10, 'INDUCCION A LA FUGA DE MENOR'),
(41, 10, 'INSTIGACION O PARTICIPACION DE MENOR EN PANDILLAJE PERNICIOSO'),
(42, 11, 'OMISION DE PRESTACION DE ALIMENTOS'),
(43, 11, 'ABANDONO DE MUJER GESTANTE Y EN SITUACION CRITICA'),
(44, 12, 'COACCION'),
(45, 12, 'SECUESTRO'),
(46, 12, 'TRATA DE PERSONAS'),
(47, 13, 'VIOLACION DE LA INTIMIDAD'),
(48, 13, 'REVELAR LA INTIMIDAD PERSONAL O FAMILIAR CONFIADA'),
(49, 13, 'USO INDEBIDO DE ARCHIVOS COMPUTARIZADOS'),
(50, 14, 'VIOLACION DE DOMICILIO'),
(51, 14, 'ALLANAMIENTO ILEGAL DE DOMICILIO'),
(52, 15, 'VIOLACION DE CORRESPONDENCIA'),
(53, 15, 'INTERFERENCIA TELEFONICA, ELECTRONICAS, DE MENSAJERIA INSTANTANEA O SIMILARES'),
(54, 15, 'SUPRESION O EXTRAVIO DE CORRESPONDENCIA'),
(55, 15, 'PUBLICACION INDEBIDA DE CORRESPONDENCIA'),
(57, 17, 'PERTURBACION DE REUNION PUBLICA'),
(58, 17, 'PROHIBICION DE REUNION PUBLICA LICITA POR FUNCIONARIO PUBLICO'),
(61, 20, 'VIOLACION SEXUAL A MAYORES DE 14 AÑOS'),
(62, 20, 'VIOLACION SEXUAL DE MENOR DE 14 AÑOS'),
(63, 20, 'SEDUCCION'),
(64, 20, 'ACTOS CONTRA EL PUDOR'),
(65, 20, 'ACTOS CONTRA EL PUDOR DE MENORES DE 14 AÑOS'),
(66, 20, 'TENTATIVA DE VIOLACION SEXUAL'),
(67, 21, 'FAVORECIMIENTO A LA PROSTITUCION'),
(68, 21, 'USUARIO CLIENTE'),
(69, 21, 'RUFIANISMO'),
(70, 21, 'PROXENETISMO'),
(71, 21, 'EXPLOTACION SEXUAL COMERCIAL INFANTIL Y ADOLESCENTE EN AMBITO DEL TURISMO '),
(72, 22, 'PROPOSICIONES SEXUALES A NIÑOS,NIÑAS Y ADOLESCENTES'),
(73, 22, 'EXHIBICIONES Y PUBLICACIONES OBSENAS'),
(74, 22, 'PORNOGRAFIA INFANTIL'),
(75, 22, 'PROPOSICIONES SEXUALES A NIÑOS,NIÑAS Y ADOLESCENTES'),
(76, 23, 'HURTO SIMPLE'),
(77, 23, 'HURTO AGRAVADO'),
(78, 23, 'DISPOSITIVOS PARA ASISTIR A LA DECODIFICACION DE SEÑALES DE SATELITE PORTADORA DE PROGRAMAS'),
(79, 23, 'HURTO DE USO'),
(80, 24, 'ROBO'),
(81, 24, 'ROBO AGRAVADO'),
(82, 25, 'HURTO DE GANADO'),
(83, 25, 'HURTO DE USO DE GANADO'),
(84, 25, 'ROBO DE GANADO'),
(85, 26, 'APROPIACION ILICITA COMUN'),
(86, 26, 'SUSTRACCION DE BIEN PROPIO'),
(87, 26, 'APROPIACION IRREGULAR'),
(88, 26, 'APROPIACION DE PRENDA'),
(89, 27, 'ESTAFA'),
(90, 27, 'ESTAFA AGRAVADA'),
(91, 27, 'DEFRAUDACION'),
(92, 28, 'ADMINISTRACION FRAUDULENTA'),
(93, 28, 'INFORMES DE AUDITORIA DISTORCIONADOS'),
(94, 28, 'CONTABILIDAD PARALELA'),
(95, 29, 'EXTORSION'),
(96, 29, 'CHANTAJE'),
(97, 30, 'USURPACION'),
(98, 30, 'DESVIO ILEGAL DEL CURSO DE LAS AGUAS'),
(99, 30, 'USURPACION AGRAVADA'),
(100, 31, 'DAÑO SIMPLE'),
(101, 31, 'DAÑO AGRAVADO'),
(102, 31, 'ABANDONO Y ACTOS DE CRUELDAD CONTRA ANIMALES DOMESTICOS Y SILVESTRES'),
(103, 31, 'PRODUCCION O VENTA DE ALIMENTOS EN MAL ESTADO PARA LOS ANIMALES'),
(107, 35, 'COPIA O REPRODUCCION  NO AUTORIZADA'),
(108, 35, 'REPROD., DIFUSION, DISTRIB. Y CIRCULACION DE LA OBRA SIN AUTORIZACION DEL AUTOR'),
(109, 35, 'PLAGIO'),
(110, 35, 'ELUSION DE MEDIDA TECNOLOGICA EFECTIVA'),
(111, 35, 'PRODUCTOS DESTINADOS A LA ELUSION DE MEDIDA TECNOLOGICAS'),
(112, 35, 'SERVICIOS DESTINADOS A LA ELUSION DE MEDIDA TECNOLOGICAS'),
(113, 35, 'DELITOS CONTRA LA INFORMACION SOBRE GESTION DE DERECHOS'),
(114, 35, 'ETIQUETAS, CARATULAS Y EMPAQUES'),
(115, 35, 'MANUALES, LICENCIAS, O EMPAQUES NO AUTENTICOS RELACIONADOS A PROGR. DE ORDENADOR'),
(116, 36, 'FABRICACION O USO NO AUTORIZADO DE PATENTE'),
(117, 36, 'PENALIZACIÓN DE LA CLONACIÓN O ADULTERACIÓN DE TERMINALES DE TELECOMUNICACIONES'),
(118, 36, 'USO O VENTA NO AUTORIZADA DE DISEÑO O MODELO INDUSTRIAL'),
(128, 46, 'CONCERTACION CREDITICIA'),
(129, 46, 'OCULTAMIENTO, OMISION O FALSEDAD DE INFORMACION'),
(130, 46, 'INSTITUCIONES FINANCIERAS ILEGALES'),
(131, 46, 'FINANCIAMIENTO POR MEDIO DE INFORMACION FRAUDULENTA'),
(132, 46, 'CONDICIONAMIENTO DE CREDITOS'),
(133, 46, 'PANICO FINANCIERO'),
(134, 46, 'OMISION DE PROVISIONES ESPECIFICAS'),
(135, 46, 'DESVIO FRAUDULENTO DE CREDITO PROMOCIONAL'),
(136, 46, 'USO INDEBIDO DE INFORMACION PRIVILEGIADA'),
(137, 46, 'MANIPULACIÓN DE PRECIOS EN EL MERCADO DE VALORES'),
(138, 47, 'FABRICACION Y FALSIFICACION DE MONEDA DE CURSO LEGAL'),
(139, 47, 'ALTERACION DEL VALOR DE LA MONEDA DE CURSO LEGAL'),
(140, 47, 'TRAFICO DE MONEDA FALSA'),
(141, 47, 'FABRICACION O INTRODUCCION DE INSTRUMENTOS PARA FALSIFICACION DE BILLETES O MONEDA'),
(142, 47, 'ALTERACION DE BILLETES Y MONEDAS'),
(143, 47, 'EMISION ILEGAL DE BILLETES Y OTROS '),
(144, 47, 'USO ILEGAL DE DIVISAS'),
(145, 47, 'RETENCION INDEBIDA DE DIVISAS'),
(148, 50, 'PELIGRO POR MEDIO DE INCENDIO O EXPLOSION'),
(149, 50, 'CONDUCCION EN ESTADO DE EBRIEDAD O DROGADICCION'),
(150, 50, 'ESTRAGOS ESPECIALES'),
(151, 50, 'DAÑOS DE OBRAS PARA LA DEFENSA COMUN'),
(152, 50, 'FABRICACION, SUMINISTRO O TENENCIA DE MATERIALES PELIGROSOS (ARMAS, EXPLOSIVOS)'),
(153, 50, 'PRODUCCION, DESARROLLO Y COMERCIALIZACION ILEGAL DE ARMAS QUIMICAS'),
(154, 50, 'SUSTRACCION O ARREBATO DE ARMAS DE FUEGO'),
(155, 50, 'TRÁFICO DE PRODUCTOS PIROTÉCNICOS'),
(156, 50, 'EMPLEO, PRODUCCION Y TRANSFERENCIA DE MINAS ANTIPERSONALES'),
(157, 50, 'ENSAMBLADO, COMERCIALIZACION Y UTILIZACION, EN SERVICIO PUBLICO, DE TRANSPORTE DE OMNIBUSES SOBRE CHASIS CAMION'),
(158, 50, 'USO DE ARMAS EN ESTADO DE EBRIEDAD O DROGADICCIÓN'),
(159, 51, 'ATENTADO CONTRA LOS MEDIOS DE TRANSPORTE COLECTIVO O DE COMUNICACION'),
(160, 51, 'ATENTADO SOBRE LA SEGURIDAD COMUN'),
(161, 51, 'ENTORPECIMIENTO AL FUNCIONAMIENTO DE SERVICIOS PUBLICOS'),
(162, 51, 'ABANDONO DE SERVICIO DE TRANSPORTE'),
(163, 51, 'SUSTITUCION O IMPEDIMENTO DE FUNCIONES EN MEDIO DE TRANSPORTE'),
(164, 52, '1. CONTAMINACIÓN Y PROPAGACIÓN'),
(165, 52, '2. TRAFICO ILICITO DE DROGAS'),
(179, 66, '1. USURPACIÓN DE AUTORIDAD, TÍTULOS Y HONORES'),
(180, 66, '2. VIOLENCIA Y RESISTENCIA A LA AUTORIDAD'),
(181, 66, '3. PERTURBACIÓN DEL ORDEN EN EL LUGAR DONDE LA AUTORIDAD EJERCE SU FUNCIÓN'),
(182, 67, '1. ABUSO DE AUTORIDAD'),
(183, 67, '2. CONCUSIÓN'),
(184, 67, '3. PECULADO'),
(185, 67, '4. CORRUPCIÓN DE FUNCIONARIOS'),
(186, 68, '1. DELITOS CONTRA LA FUNCIÓN JURISDICCIONAL'),
(187, 68, '2. PREVARICATO'),
(188, 68, '3. DENEGACIÓN Y RETARDO DE JUSTICIA'),
(189, 69, 'FALSIFICACIÓN DE DOCUMENTOS'),
(190, 69, 'FALSEDAD IDEOLÓGICA'),
(191, 69, 'FALSEDAD EN EL REPORTE DE LOS VOLÚMENES DE PESCA CAPTURADOS'),
(192, 69, 'OMISIÓN DE CONSIGNAR DECLARACIONES EN DOCUMENTOS'),
(193, 69, 'SUPRESIÓN, DESTRUCCIÓN U OCULTAMIENTO DE DOCUMENTOS'),
(194, 69, 'EXPEDICIÓN DE CERTIFICADO MÉDICO FALSO'),
(195, 70, 'FABRICACIÓN O FALSIFICACIÓN DE SELLOS O TIMBRES OFICIALES'),
(196, 70, 'FABRICACIÓN FRAUDULENTA O FALSIFICACIÓN DE MARCAS O CONTRASEÑAS OFICIALES'),
(197, 71, 'FALSEDAD GENÉRICA'),
(198, 71, 'FABRICACIÓN O TENENCIA DE INSTRUMENTOS PARA FALSIFICAR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_delito`
--

CREATE TABLE `tipo_delito` (
  `id_tdeli` int(11) NOT NULL,
  `id_deli` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_delito`
--

INSERT INTO `tipo_delito` (`id_tdeli`, `id_deli`, `nombre`) VALUES
(1, 1, 'A. HOMICIDIO'),
(2, 1, 'B. LESIONES'),
(3, 1, 'C. ABORTO'),
(4, 1, 'D. EXPOSICIÓN A PELIGRO O ABANDONO DE PERSONAS EN PELIGRO'),
(5, 2, 'INJURIA'),
(6, 2, 'CALUMNIA'),
(7, 2, 'DIFAMACION'),
(8, 3, 'A. MATRIMONIOS ILEGALES'),
(9, 3, 'B. DELITOS CONTRA EL ESTADO CIVIL'),
(10, 3, 'C. ATENTADOS CONTRA LA PATRIA POTESTAD'),
(11, 3, 'D. OMISIÓN DE ASISTENCIA FAMILIAR'),
(12, 4, 'A. VIOLACION LIBERTAD PERSONAL'),
(13, 4, 'B. VIOLACION DE LA INTIMIDAD'),
(14, 4, 'C. VIOLACION DOMICILIO'),
(15, 4, 'D. VIOLACION DEL SECRETO DE COMUNICACIONES'),
(16, 4, 'E. VIOLACION DEL SECRETO PROFESIONAL'),
(17, 4, 'F. VIOLACION DE LA LIBERTAD DE REUNIÓN'),
(18, 4, 'G. VIOLACION DE LA LIBERTAD DE TRABAJO Y ASOCIACIÓN'),
(19, 4, 'H. VIOLACION DE LA LIBERTAD DE EXPRESIÓN'),
(20, 4, 'I. VIOLACION LIBERT. SEXUAL'),
(21, 4, 'J. PROXENITISMO'),
(22, 4, 'K. OFENSA PUDOR PÚBLICO'),
(23, 5, 'A. HURTO'),
(24, 5, 'B. ROBO'),
(25, 5, 'C. ABIGEATO'),
(26, 5, 'D. APROPIACION ILICITA'),
(27, 5, 'F. ESTAFAS Y OTRAS DEFRAUDACIONES'),
(28, 5, 'G. FRAUDE EN LA ADMINISTRACIÓN DE PERSONAS JURIDICAS'),
(29, 5, 'H. EXTORSIÓN'),
(30, 5, 'I. USURPACIÓN'),
(31, 5, 'J. DAÑOS'),
(32, 6, 'ATENTADOS CONTRA EL SISTEMA CREDITICIO'),
(33, 6, 'USURA'),
(34, 6, 'LIBRAMIENTOS INDEBIDOS'),
(35, 7, 'A. CONTRA LOS DERECHOS DE AUTOR Y CONEXOS'),
(36, 7, 'B. CONTRA LA PROPIEDAD INDUSTRIAL'),
(37, 8, 'ESPECULACION'),
(38, 8, 'ADULTERACION'),
(39, 8, 'VENTA ILEGAL DE MERCADERIAS'),
(40, 8, 'FRAUDE EN REMATES, LICITACIONES Y CONCURSOS PUBLICOS'),
(41, 8, 'REHUSAMIENTO A PRESTAR INFORMACION ECONOMICA, INDUSTRIAL O COMERCIAL'),
(42, 8, 'SUBVALUACION MERCADERIAS ADQUIRIDAS CON TIPO DE CAMBIO PREFERENCIAL'),
(43, 8, 'FUNCIONAMIENTO ILEGAL DE CASINOS DE JUEGO'),
(44, 8, 'DESEMPEÑO DE ACTIVIDADES NO AUTORIZADAS'),
(45, 8, 'FUNCIONAMIENTO ILEGAL DE JUEGOS DE CASINO Y MÁQUINAS TRAGAMONEDAS'),
(46, 9, 'A. DELITOS FINANCIEROS'),
(47, 9, 'B. DELITOS MONETARIOS'),
(48, 10, 'ELABORACIÓN CLANDESTINA DE PRODUCTOS'),
(49, 10, 'COMERCIO CLANDESTINO'),
(50, 11, 'A. PELIGRO COMUN'),
(51, 11, 'B. C. LOS MEDIOS DE TRANSPORTE, COMUNICACIÓN Y OTROS SERVICIOS PUBLICOS'),
(52, 11, 'C. CONTRA LA SALUD PÚBLICA'),
(53, 11, 'D. CONTRA EL ORDEN MIGRATORIO'),
(54, 12, 'DISTURBIOS'),
(55, 12, 'DELITO DE GRAVE PERTURBACIÓN DE LA TRANQUILIDAD PÚBLICA'),
(56, 12, 'APOLOGIA'),
(57, 12, 'ASOCIACION ILICITA'),
(58, 12, 'MARCAJE O REGLAJE'),
(59, 12, 'OFENSAS A LA MEMORIA DE LOS MUERTOS'),
(60, 12, 'DELITO DE INTERMEDIACIÓN ONEROSA DE ÓRGANOS Y TEJIDOS'),
(61, 13, 'GENOCIDIO'),
(62, 13, 'DESAPARICIÓN FORZADA'),
(63, 13, 'TORTURA'),
(64, 13, 'DISCRIMINACIÓN'),
(65, 13, 'MANIPULACIÓN GENÉTICA'),
(66, 14, 'A. COMETIDOS POR PARTICULARES'),
(67, 14, 'B. COMETIDOS POR FUNCIONARIOS PÚBLICOS'),
(68, 14, 'C. COMETIDOS CONTRA LA ADMINISTRACIÓN DE JUSTICIA'),
(69, 15, 'A. FALSIFICACIÓN DE DOCUMENTOS EN GENERAL'),
(70, 15, 'B. FALSIFICACIÓN DE SELLOS, TIMBRES Y MARCAS OFICIALES'),
(71, 15, 'C. DISPOSICIONES COMUNES');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_papeleta`
--

CREATE TABLE `tipo_papeleta` (
  `codigo` varchar(5) NOT NULL,
  `gravedad` varchar(50) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `monto` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_papeleta`
--

INSERT INTO `tipo_papeleta` (`codigo`, `gravedad`, `descripcion`, `monto`) VALUES
('M01', 'Muy Grave', 'Conducir con presencia de alcohol en la sangre en proporción mayor a lo previsto en el Código Penal, o bajo los efectos de estupefacientes, narcóticos y/o alucinógenos comprobado con el exámen respect', '4150'),
('M02', 'Muy Grave', 'Conducir con presencia de alcohol en la sangre en proporción mayor a lo previsto en el Código Penal, bajo los efectos de estupefacientes, narcóticos y/o alucinógenos comprobada con el exámen respectiv', '2075'),
('M03', 'Muy Grave', 'Conducir un vehículo automotor sin tener licencia de conducir o permiso provisional.', '2075'),
('M04', 'Muy Grave', 'Conducir vehículos estando la licencia de conducir retenida, suspendida o estando inhabilitado para obtener licencia de conducir.', '4150'),
('M05', 'Muy Grave', 'Conducir un vehículo con Licencia de Conducir cuya clase o categoría no corresponde al vehículo que conduce.', '2075'),
('M06', 'Muy Grave', 'Estacionar en las curvas, puentes, túneles, zonas estrechas de la vía, pasos a nivel, pasos a desnivel en cambios de rasante, pendientes y cruces de ferrocarril.', '996'),
('M07', 'Muy Grave', 'Participar en competencias de velocidad en eventos no autorizados.', '996'),
('M08', 'Muy Grave', 'Permitir a un menor de edad la conducción de un vehículo automotor, sin autorización o permiso provisional.', '996'),
('M09', 'Muy Grave', 'Conducir un vehículo con cualquiera de sus sistemas de dirección, frenos, suspensión, luces o eléctrico en mal estado, previa inspección técnica vehicular.', '996'),
('M10', 'Muy Grave', 'Abastecer de combustible un vehículo del servicio de transporte público de pasajeros con personas a bordo del vehículo.', '498'),
('M11', 'Muy Grave', 'Conducir vehículos de las categorías M o N sin parachoques o dispositivo antiempotramiento cuando corresponda; o un vehículo de la categoría L5 sin parachoques posterior, conforme a lo establecido en ', '498'),
('M12', 'Muy Grave', 'No detenerse al aproximarse a un vehículo de transporte escolar debidamente identificado que está recogiendo o dejando escolares.', '498'),
('M13', 'Muy Grave', 'Conducir un vehículo con neumático(s), cuya banda de rodadura presente desgaste inferior al establecido en el Reglamento Nacional de Vehículos.', '498'),
('M14', 'Muy Grave', 'No detenerse al llegar a un cruce ferroviario a nivel o reiniciar la marcha sin haber comprobado que no se aproxima tren o vehículo ferroviario, o cruzar la vía ferrea por lugares distintos a los cruc', '498'),
('M15', 'Muy Grave', 'Circular produciendo contaminación en un índice superior a los límites máximos permisibles de emisión de gases contaminantes.', '498'),
('M16', 'Muy Grave', 'Circular en sentido contrario al tránsito autorizado.', '498'),
('M17', 'Muy Grave', 'Cruzar una intersección o girar, estando el semáforo con luz roja y no existiendo la indicación en contrario.', '498'),
('M18', 'Muy Grave', 'Desobedecer las indicaciones sobre el tránsito que ordene el efectivo de la Policía Nacional del Perú asignado al control del tránsito.', '498'),
('M19', 'Muy Grave', 'Conducir vehículos sin cumplir con las restricciones que consigna la Licencia de Conducir.', '498'),
('M20', 'Muy Grave', 'No respetar los límites máximo o mínimo de velocidad establecidos.', '747'),
('M21', 'Muy Grave', 'Estacionar interrumpiendo totalmente el tránsito.', '498'),
('M22', 'Muy Grave', 'Detenerse para cargar o descargar mercancías en la calzada y/o en los lugares que puedan constituir un peligro u obstáculo o interrumpan la circulación.', '498'),
('M23', 'Muy Grave', 'Estacionar o detener el vehículo en el carril de circulación, en carreteras o caminos donde existe berma lateral.', '498'),
('M24', 'Muy Grave', 'Circular sin placas de rodaje o sin el permiso correspondiente.', '498'),
('M25', 'Muy Grave', 'No dar preferencia de paso a los vehíuclos de emergencia y vehículos oficiales cuando hagan uso de sus señales audibles y visibles.', '498'),
('M26', 'Muy Grave', 'Conducir un vehículo especial que no se ajuste a las exigencias reglamentarias sin la autorización correspondiente.', '498'),
('M27', 'Muy Grave', 'Conducir un vehículo que no cuente con el certificado de aprobación de inspección técnica vehicular. Esta infracción no aplica para el caso de los vehiculos L5 de la clasificación vehicular', '2075'),
('M28', 'Muy Grave', 'Conducir un vehículo sin contar con la póliza del Seguro Obligatorio de Accidentes de Tránsito, o Certificado de Accidentes de Tránsito, cuando corresponda, o éstos no se encuentre vigente.', '498'),
('M29', 'Muy Grave', 'Deteriorar intencionalmente, adulterar, destruir o sustraer las Placas de exhibición, rotativa o transitoria .', '498'),
('M30', 'Muy Grave', 'Usar las placas de exhibición, rotativa o transitoria fuera del plazo, horario o ruta establecida o cuando esta ha caducado o ha sido invalidada.', '498'),
('M31', 'Muy Grave', 'Utilizar las placas de exhibición, rotativa o transitoria en vehículos a los que no se encuentren asignadas.', '498'),
('M33', 'Muy Grave', 'Operar maquinaria especial por la vía pública.', '498'),
('M34', 'Muy Grave', 'Circular produciendo ruidos que superen los límites máximos permisibles.', '498'),
('M35', 'Muy Grave', 'Voltear en U sobre la misma calzada, en las curvas, puentes, pasos a desnivel, vías expresas, túneles, estructuras elevadas, cima de cuesta, cruce ferroviario a nivel.', '498'),
('M36', 'Muy Grave', 'Transportar carga sin los dispositivos de sujeción o seguridad establecidos.', '498'),
('M37', 'Muy Grave', 'Conducir y ocasionar un accidente de tránsito con daños personales inobservando las normas de tránsito dispuestas en el presente Reglamento.', '0'),
('M38', 'Muy Grave', 'Conducir un vehículo para el servicio de transporte público y ocasionar un accidente de tránsito con daños personales inobservando las normas de tránsito dispuestas por el presente Reglamento.', '0'),
('M39', 'Muy Grave', 'Conducir y ocasionar un accidente de tránsito con lesiones graves o muerte inobservando las normas de tránsito dispuestas en el presente Reglamento.', '0'),
('M40', 'Muy Grave', 'Conducir un vehiculo con la licencia de conducir vencida', '208'),
('M41', 'Muy Grave', 'Circular, interrumpir y/o impedir el tránsito, en situaciones de desastre natural o emergencia, incumpliendo las disposiciones de la autoridad competente para la restricción de acceso a las vías', '6225'),
('M42', 'Muy Grave', 'Conducir un vehiculo de la categoria L5 de la clasificación vehicular, que no cuente con el certificado de aprobacíón de inspección técnica vehicular', '208'),
('G01', 'Grave', 'Adelantar o sobrepasar en forma indebida a otro vehículo.', '332'),
('G02', 'Grave', 'No hacer señales, ni tomar las precauciones para girar, voltear en U, pasar de un carril de la calzada a otro o detener el vehículo.', '332'),
('G03', 'Grave', 'Detener el vehículo bruscamente sin motivo.', '332'),
('G04', 'Grave', 'No detenerse antes de la línea de parada o antes de las áreas de intersección de calzadas o no respetar el derecho de paso del peatón.', '332'),
('G05', 'Grave', 'No mantener una distancia suficiente, razonable y prudente, de acuerdo al tipo de vehículo y la vía por la que se conduce, mientras se desplaza o al detenerse detrás de otro.', '332'),
('G06', 'Grave', 'No ubicar el vehículo con la debida anticipación en el carril donde va efectuar el giro o volteo.', '332'),
('G07', 'Grave', 'No conducir por el carril de extremo derecho de la calzada un vehículo del servicio de transporte público de pasajeros o de carga o de desplazamiento lento o un vehículo automotor menor.', '332'),
('G08', 'Grave', 'No utilizar el carril derecho para recoger o dejar pasajeros o carga.', '332'),
('G09', 'Grave', 'Retroceder, salvo casos indispensables para mantener libre la circulación, para incorporarse a ella o para estacionar el vehículo.', '332'),
('G10', 'Grave', 'Incumplir las disposiciones sobre el uso de las vías de tránsito rápido y/o de acceso restringido.', '332'),
('G11', 'Grave', 'Circular, estacionar o detenerse sobre una isla de encauzamiento, canalizadora, de refugio o divisoria del tránsito, marcas delimitadoras de carriles, separadores centrales, bermas, aceras, áreas verd', '332'),
('G12', 'Grave', 'Girar estando el semáforo con luz roja y flecha verde, sin respetar el derecho preferente de paso de los peatones.', '332'),
('G13', 'Grave', 'Conducir un vehículo con mayor número de personas al número de asientos señalado en la Tarjeta de Identificación Vehicular, con excepción de niños en brazos en los asientos posteriores; y, llevar pasa', '332'),
('G14', 'Grave', 'Tener la puerta, capot o maletera del vehículo abierta, cuando el vehículo está en marcha.', '332'),
('G15', 'Grave', 'No utilizar las luces intermitentes de emergencia de un vehículo cuando se detiene por razones de fuerza mayor, obstaculizando el tránsito, o no colocar los dispositivos de seguridad reglamentarios cu', '332'),
('G16', 'Grave', 'Conducir un vehículo por una vía en la cual no está permitida la circulación o sobre mangueras contra incendio.', '332'),
('G17', 'Grave', 'Conducir vehículos que tengan lunas o vidrios polarizados o acondicionados de modo tal que impidan la visibilidad del interior del vehículo, sin la autorización correspondiente.', '332'),
('G18', 'Grave', 'a) Conducir un vehículo sin que ambas manos estén sobre el volante de dirección, excepto cuando es necesario realizar los cambios de velocidad o accionar otros comandos. b) Conducir un vehículo usando', '332'),
('G19', 'Grave', 'Conducir un vehículo de la categoría M o N que carezca de vidrios de seguridad reglamentarios o que su parabrisas se encuentre deteriorado, trizado o con objetos impresos, calcomanías, carteles u otro', '332'),
('G20', 'Grave', 'Conducir un vehículo que no cuenta con las luces y dispositivos retrorreflectivos previstos en los reglamentos pertinentes.', '332'),
('G21', 'Grave', 'Conducir un vehículo sin espejos retrovisores.', '332'),
('G22', 'Grave', 'Conducir un vehículo cuando llueve, llovizne o garúe, sin tener operativo el sistema de limpiaparabrisas.', '332'),
('G23', 'Grave', 'Conducir un vehículo del servicio de transporte público urbano de pasajeros con personas de pie, si la altura interior del vehículo no supera a 1,80 metros.', '332'),
('G24', 'Grave', 'Conducir un vehículo con el motor en punto neutro o apagado.', '332'),
('G25', 'Grave', 'Conducir un vehículo sin portar el Certificado SOAT físico, excepto que se cuente con certificado electrónico; o sin portar el Certificado contra Accidentes de Tránsito; o que éstos no correspondan al', '332'),
('G26', 'Grave', 'Conducir un vehículo de la categoría M o N con la salida del tubo de escape en la parte lateral derecha, de modo tal que las emisiones o gases sean expulsados hacia la acera por donde circulan los pea', '332'),
('G27', 'Grave', 'Conducir un vehículo cuya carga o pasajeros obstruya la visibilidad de los espejos laterales.', '332'),
('G28', 'Grave', 'En vehículos de las categorías M y N, no llevar puesto el cinturon de seguridad y/o permitir que los ocupantes del vehículo no lo utilicen en los casos en que, de acuerdo a las normas vigentes, exista', '332'),
('G29', 'Grave', 'Circular en forma desordenada o haciendo maniobras peligrosas.', '332'),
('G30', 'Grave', 'Circular transportando personas en la parte exterior de la carroceria o permitir que sobresalga parte del cuerpo de la(s) persona(s) transportada(s) en el vehículo.', '332'),
('G31', 'Grave', 'En las vías públicas urbanas, circular en la noche o cuando la luz natural sea insuficiente o cuando las condiciones de visibilidad sean escasas, sin tener encendido el sistema de luces reglamentarias', '332'),
('G32', 'Grave', 'Circular por vías o pistas exclusivas para bicicletas.', '332'),
('G33', 'Grave', 'Circular transportando cargas que sobrepasen las dimensiones de la carrocería o que se encuentren ubicadas fuera de la misma; o transportar materiales sueltos, fluidos u otros sin adoptar las medidas ', '332'),
('G34', 'Grave', 'Remolcar vehículos sin las medidas de seguridad.', '332'),
('G35', 'Grave', 'Usar luces altas en vías urbanas o hacer mal uso de las luces.', '332'),
('G36', 'Grave', 'Compartir el asiento de conducir con otra persona, animal o cosa.', '332'),
('G37', 'Grave', 'No reducir la velocidad al ingresar a un túnel o cruzar un puente, intersecciones o calles congestionadas, cuando transite por cuestas, cuando se aproxime y tome una curva o cambie de dirección, cuand', '332'),
('G38', 'Grave', 'Transitar lentamente por el carril de la izquierda, causando congestión o riesgo o rápidamente por el carril de la derecha.', '332'),
('G39', 'Grave', 'Aumentar la velocidad cuando es alcanzado por otro vehículo que tiene la intención de sobrepasarlo o adelantarlo.', '332'),
('G40', 'Grave', 'Estacionar el vehículo en zonas prohibidas o rigidas señalizadas o sin las señales de seguridad reglamentarias en caso de emergencia.', '332'),
('G41', 'Grave', 'Estacionar o detener el vehículo sobre la línea demarcatoria de intersección, dentro de éstas o en el crucero peatonal (paso peatonal).', '332'),
('G42', 'Grave', 'Estacionar frente a la entrada o salida de garajes, estacionamientos públicos, vías privadas o en las salidas de salas, espectáculos, centros deportivos en funcionamiento.', '332'),
('G43', 'Grave', 'Estacionar a una distancia menor de cinco (5) metros de una bocacalle, de las entradas de hospitales o centros de asistencia médica, cuerpos de bomberos o de hidrantes de servicio contra incendios, sa', '332'),
('G44', 'Grave', 'Estacionar a menos de tres (3) metros de las puertas de establecimientos educacionales, teatros, iglesias y hoteles, salvo los vehículos relacionados a la función del local.', '332'),
('G45', 'Grave', 'Estacionar a menos de veinte (20) metros de un cruce ferroviario a nivel.', '332'),
('G46', 'Grave', 'Estacionar en zonas no permitidas por la autoridad competente, a menos de diez (10) metros de un cruce peatonal o de un paradero de buses, así como en el propio sitio determinado para la parada del bu', '332'),
('G47', 'Grave', 'Estacionar en lugar que afecte la operatividad del servicio de transporte público de pasajeros o carga o que afecte la seguridad, visibilidad o fluidez del tránsito o impida observar la señalización.', '332'),
('G48', 'Grave', 'Estacionar un ómnibus, microbus, casa rodante, camión, remolque, semirremolque, plataforma, tanque, tractocamión, tráiler, volquete o furgón, en en vías públicas de zona urbana, excepto en los lugares', '332'),
('G49', 'Grave', 'Estacionar un vehículo de categorìa M, N u O a una distancia menor a un metro de la parte delantera o posterior de otro ya estacionado, salvo cuando se estacione en diagonal o perpendicular a la vía.', '332'),
('G50', 'Grave', 'Estacionar en los terminales o estaciones de ruta, fuera de los estacionamientos externos determinados por la Autoridad competente.', '332'),
('G51', 'Grave', 'Estacionar un vehículo automotor por la noche en lugares donde, por la falta de alumbrado público, se impide su visibilidad, o en el día, cuando, por lluvia, llovizna o neblina u otro factor, la visib', '332'),
('G52', 'Grave', 'Estacionar un vehículo en vías con pendientes pronunciadas sin asegurar su inmovilización.', '332'),
('G53', 'Grave', 'Desplazar o empujar un vehículo bien estacionado, con el propósito de ampliar un espacio o tratar de estacionar otro vehículo.', '332'),
('G54', 'Grave', 'Abandonar el vehículo en la vía pública.', '332'),
('G55', 'Grave', 'Utilizar la vía pública para efectuar reparaciones, salvo casos de emergencia.', '332'),
('G56', 'Grave', 'Recoger o dejar pasajeros fuera de los paraderos de ruta autorizados, cuando existan.', '332'),
('G57', 'Grave', 'No respetar las señales que rigen el tránsito, cuyo incumplimiento no se encuentre tipificado en otra infracción.', '332'),
('G58', 'Grave', 'No presentar la Tarjeta de Identificación Vehicular, la Licencia de Conducir o el Documento Nacional de Identidad o documento de identidad, según corresponda.', '332'),
('G59', 'Grave', 'Conducir un vehículo de categoría L, con excepción de la categoría L5, sin tener puesto el casco de seguridad o anteojos protectores, en caso de no tener parabrisas; o permitir que los demás ocupantes', '332'),
('G60', 'Grave', 'Circular con placas ilegibles o sin iluminación o que tengan adherido algún material, que impida su lectura a través de medios electrónicos, computarizados u otro tipo de mecanismos tecnológicos que p', '332'),
('G61', 'Grave', 'No llevar las placas de rodaje en el lugar que corresponde.', '332'),
('G62', 'Grave', 'Incumplir con devolver las placas de exhibición, rotativa o transitoria dentro de los plazos establecidos en el Reglamento de Placa Única Nacional de Rodaje.', '332'),
('G63', 'Grave', 'Utilizar señales audibles o visibles iguales o similares a las que utilizan los vehículos de emergencia o vehículos oficiales.', '332'),
('G64', 'Grave', 'Conducir un vehículo cuyas características registrables o condiciones técnicas han sido modificadas, alteradas o agregadas, atentando contra la seguridad de los usuarios o por no corresponder los dato', '332'),
('G65', 'Grave', 'No ceder el paso a otros vehículos que tienen preferencia.', '332'),
('G66', 'Grave', 'Seguir a los vehículos de emergencia y vehículos oficiales para avanzar más rápidamente.', '332'),
('G70', 'Grave', 'Detener el vehiculo sobre la demarcación en el pavimento de la señal \"No bloquear cruce\"', '332'),
('G71', 'Grave', 'Circular por las vias públicas terrestres donde se encuentran instaladas garitas o puntos de peaje, sin pagar la tarifa de peaje aprobada por la autoridad competente o el establecido en los contratos ', '332'),
('G72', 'Grave', 'a) Utilizar, mientras se conduce el vehículo, cualquier dispositivo electrónico que reproduzca imágenes o videos con fines de entretenimiento visual. b) Utilizar un vehículo que tenga instalados los d', '332'),
('L01', 'Leve', 'Dejar mal estacionado el vehículo en lugares permitidos.', '166'),
('L02', 'Leve', 'Estacionar un vehículo en zonas de parqueo destinadas a vehículos que transportan a personas con discapacidad o conducidos por éstos.', '208'),
('L04', 'Leve', 'Abrir o dejar abierta la puerta de un vehículo estacionado, dificultando la circulación vehicular.', '166'),
('L05', 'Leve', 'Utilizar el carril de giro a la izquierda para continuar la marcha en cualquier dirección que no sea la específicamente señalada.', '166'),
('L06', 'Leve', 'Arrojar, depositar o abandonar objetos o sustancias en la vía pública que dificulten la circulación.', '166'),
('L07', 'Leve', 'Utilizar la bocina para llamar la atención en forma inncesaria.', '166'),
('L08', 'Leve', 'Hacer uso de bocinas de descarga de aire comprimido en el ámbito urbano.', '166');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usua` int(11) NOT NULL,
  `id_perso` int(11) NOT NULL,
  `id_perfil` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `sesion` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usua`, `id_perso`, `id_perfil`, `usuario`, `password`, `sesion`) VALUES
(1, 3, 1, 'admin', 'admin', 0),
(2, 1, 2, 'yoel', '123456', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `id_vehi` int(11) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `anio` int(11) NOT NULL,
  `tipo_vehi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`id_vehi`, `marca`, `modelo`, `anio`, `tipo_vehi`) VALUES
(1, 'Toyota', 'Corolla', 2017, 'Automovil'),
(2, 'huindai', 'i30', 2018, 'Automovil');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo_incautado`
--

CREATE TABLE `vehiculo_incautado` (
  `id_vehincau` int(11) NOT NULL,
  `id_opera` int(11) DEFAULT NULL,
  `id_vehi` int(11) NOT NULL,
  `placa` char(10) NOT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  `estado` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vehiculo_incautado`
--

INSERT INTO `vehiculo_incautado` (`id_vehincau`, `id_opera`, `id_vehi`, `placa`, `descripcion`, `estado`, `tipo`) VALUES
(8, 5, 1, 'dsf-656', 'desc', 'AL DEPOSITO', 'AUTOMOVIL');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arma`
--
ALTER TABLE `arma`
  ADD PRIMARY KEY (`id_arma`);

--
-- Indices de la tabla `arma_incautada`
--
ALTER TABLE `arma_incautada`
  ADD PRIMARY KEY (`id_armaincau`),
  ADD KEY `id_opera` (`id_opera`),
  ADD KEY `id_arma` (`id_arma`);

--
-- Indices de la tabla `delito`
--
ALTER TABLE `delito`
  ADD PRIMARY KEY (`id_deli`);

--
-- Indices de la tabla `denuncia`
--
ALTER TABLE `denuncia`
  ADD PRIMARY KEY (`id_denun`),
  ADD KEY `id_deli` (`id_deli`),
  ADD KEY `id_tdelito` (`id_tdelito`),
  ADD KEY `id_stdelito` (`id_stdelito`),
  ADD KEY `id_sddelito` (`id_sddelito`),
  ADD KEY `id_moda` (`id_moda`);

--
-- Indices de la tabla `droga`
--
ALTER TABLE `droga`
  ADD PRIMARY KEY (`id_droga`),
  ADD KEY `id_opera` (`id_opera`);

--
-- Indices de la tabla `modalidad`
--
ALTER TABLE `modalidad`
  ADD PRIMARY KEY (`id_moda`);

--
-- Indices de la tabla `municion`
--
ALTER TABLE `municion`
  ADD PRIMARY KEY (`id_munic`),
  ADD KEY `id_opera` (`id_opera`);

--
-- Indices de la tabla `operativo`
--
ALTER TABLE `operativo`
  ADD PRIMARY KEY (`id_opera`);

--
-- Indices de la tabla `otro`
--
ALTER TABLE `otro`
  ADD PRIMARY KEY (`id_otro`),
  ADD KEY `id_opera` (`id_opera`);

--
-- Indices de la tabla `papeleta`
--
ALTER TABLE `papeleta`
  ADD PRIMARY KEY (`id_pape`),
  ADD KEY `id_vehincau` (`id_vehincau`);

--
-- Indices de la tabla `perfil`
--
ALTER TABLE `perfil`
  ADD PRIMARY KEY (`id_perfil`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_perso`);

--
-- Indices de la tabla `persona_denuncia`
--
ALTER TABLE `persona_denuncia`
  ADD PRIMARY KEY (`id_perden`),
  ADD KEY `id_denun` (`id_denun`),
  ADD KEY `id_opera` (`id_opera`),
  ADD KEY `id_perso` (`id_perso`);

--
-- Indices de la tabla `persona_proceso`
--
ALTER TABLE `persona_proceso`
  ADD PRIMARY KEY (`id_perpro`),
  ADD KEY `id_perden` (`id_perden`);

--
-- Indices de la tabla `servicio_policial`
--
ALTER TABLE `servicio_policial`
  ADD PRIMARY KEY (`id_serpo`),
  ADD KEY `id_denun` (`id_denun`),
  ADD KEY `id_perso` (`id_perso`),
  ADD KEY `id_usua` (`id_usua`);

--
-- Indices de la tabla `subdetalle_delito`
--
ALTER TABLE `subdetalle_delito`
  ADD PRIMARY KEY (`id_sddelito`);

--
-- Indices de la tabla `subtipo_delito`
--
ALTER TABLE `subtipo_delito`
  ADD PRIMARY KEY (`id_stdelito`);

--
-- Indices de la tabla `tipo_delito`
--
ALTER TABLE `tipo_delito`
  ADD PRIMARY KEY (`id_tdeli`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usua`),
  ADD KEY `id_perso` (`id_perso`),
  ADD KEY `id_perfil` (`id_perfil`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`id_vehi`);

--
-- Indices de la tabla `vehiculo_incautado`
--
ALTER TABLE `vehiculo_incautado`
  ADD PRIMARY KEY (`id_vehincau`),
  ADD KEY `id_opera` (`id_opera`),
  ADD KEY `id_vehi` (`id_vehi`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arma`
--
ALTER TABLE `arma`
  MODIFY `id_arma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `arma_incautada`
--
ALTER TABLE `arma_incautada`
  MODIFY `id_armaincau` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `delito`
--
ALTER TABLE `delito`
  MODIFY `id_deli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `denuncia`
--
ALTER TABLE `denuncia`
  MODIFY `id_denun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `droga`
--
ALTER TABLE `droga`
  MODIFY `id_droga` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `modalidad`
--
ALTER TABLE `modalidad`
  MODIFY `id_moda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `municion`
--
ALTER TABLE `municion`
  MODIFY `id_munic` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `operativo`
--
ALTER TABLE `operativo`
  MODIFY `id_opera` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `otro`
--
ALTER TABLE `otro`
  MODIFY `id_otro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `papeleta`
--
ALTER TABLE `papeleta`
  MODIFY `id_pape` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `perfil`
--
ALTER TABLE `perfil`
  MODIFY `id_perfil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id_perso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `persona_denuncia`
--
ALTER TABLE `persona_denuncia`
  MODIFY `id_perden` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `persona_proceso`
--
ALTER TABLE `persona_proceso`
  MODIFY `id_perpro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `servicio_policial`
--
ALTER TABLE `servicio_policial`
  MODIFY `id_serpo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `subdetalle_delito`
--
ALTER TABLE `subdetalle_delito`
  MODIFY `id_sddelito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=106;

--
-- AUTO_INCREMENT de la tabla `subtipo_delito`
--
ALTER TABLE `subtipo_delito`
  MODIFY `id_stdelito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=199;

--
-- AUTO_INCREMENT de la tabla `tipo_delito`
--
ALTER TABLE `tipo_delito`
  MODIFY `id_tdeli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=72;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usua` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  MODIFY `id_vehi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `vehiculo_incautado`
--
ALTER TABLE `vehiculo_incautado`
  MODIFY `id_vehincau` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `arma_incautada`
--
ALTER TABLE `arma_incautada`
  ADD CONSTRAINT `arma_incautada_ibfk_1` FOREIGN KEY (`id_opera`) REFERENCES `operativo` (`id_opera`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `arma_incautada_ibfk_2` FOREIGN KEY (`id_arma`) REFERENCES `arma` (`id_arma`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `denuncia`
--
ALTER TABLE `denuncia`
  ADD CONSTRAINT `denuncia_ibfk_1` FOREIGN KEY (`id_deli`) REFERENCES `delito` (`id_deli`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `denuncia_ibfk_2` FOREIGN KEY (`id_tdelito`) REFERENCES `tipo_delito` (`id_tdeli`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `denuncia_ibfk_3` FOREIGN KEY (`id_stdelito`) REFERENCES `subtipo_delito` (`id_stdelito`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `denuncia_ibfk_4` FOREIGN KEY (`id_sddelito`) REFERENCES `subdetalle_delito` (`id_sddelito`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `denuncia_ibfk_5` FOREIGN KEY (`id_moda`) REFERENCES `modalidad` (`id_moda`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `droga`
--
ALTER TABLE `droga`
  ADD CONSTRAINT `droga_ibfk_1` FOREIGN KEY (`id_opera`) REFERENCES `operativo` (`id_opera`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `municion`
--
ALTER TABLE `municion`
  ADD CONSTRAINT `municion_ibfk_1` FOREIGN KEY (`id_opera`) REFERENCES `operativo` (`id_opera`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `otro`
--
ALTER TABLE `otro`
  ADD CONSTRAINT `otro_ibfk_1` FOREIGN KEY (`id_opera`) REFERENCES `operativo` (`id_opera`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `papeleta`
--
ALTER TABLE `papeleta`
  ADD CONSTRAINT `papeleta_ibfk_1` FOREIGN KEY (`id_vehincau`) REFERENCES `vehiculo_incautado` (`id_vehincau`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `persona_denuncia`
--
ALTER TABLE `persona_denuncia`
  ADD CONSTRAINT `persona_denuncia_ibfk_1` FOREIGN KEY (`id_denun`) REFERENCES `denuncia` (`id_denun`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `persona_denuncia_ibfk_2` FOREIGN KEY (`id_opera`) REFERENCES `operativo` (`id_opera`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `persona_denuncia_ibfk_3` FOREIGN KEY (`id_perso`) REFERENCES `persona` (`id_perso`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `persona_proceso`
--
ALTER TABLE `persona_proceso`
  ADD CONSTRAINT `persona_proceso_ibfk_1` FOREIGN KEY (`id_perden`) REFERENCES `persona_denuncia` (`id_perden`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `servicio_policial`
--
ALTER TABLE `servicio_policial`
  ADD CONSTRAINT `servicio_policial_ibfk_1` FOREIGN KEY (`id_perso`) REFERENCES `persona` (`id_perso`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `servicio_policial_ibfk_2` FOREIGN KEY (`id_usua`) REFERENCES `usuario` (`id_usua`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `servicio_policial_ibfk_3` FOREIGN KEY (`id_denun`) REFERENCES `denuncia` (`id_denun`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_perfil`) REFERENCES `perfil` (`id_perfil`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`id_perso`) REFERENCES `persona` (`id_perso`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `vehiculo_incautado`
--
ALTER TABLE `vehiculo_incautado`
  ADD CONSTRAINT `vehiculo_incautado_ibfk_1` FOREIGN KEY (`id_vehi`) REFERENCES `vehiculo` (`id_vehi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `vehiculo_incautado_ibfk_2` FOREIGN KEY (`id_opera`) REFERENCES `operativo` (`id_opera`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
