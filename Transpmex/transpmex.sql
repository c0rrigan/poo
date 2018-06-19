-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.3.7-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for transpmex
CREATE DATABASE IF NOT EXISTS `transpmex` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `transpmex`;

-- Dumping structure for table transpmex.estados
CREATE TABLE IF NOT EXISTS `estados` (
  `id_estadomex` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `estado` text NOT NULL,
  PRIMARY KEY (`id_estadomex`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='tabla de estados de la republica méxicana';

-- Dumping data for table transpmex.estados: ~32 rows (approximately)
/*!40000 ALTER TABLE `estados` DISABLE KEYS */;
INSERT INTO `estados` (`id_estadomex`, `estado`) VALUES
	(1, 'Aguascalientes'),
	(2, 'Baja California'),
	(3, 'Baja California Sur'),
	(4, 'Campeche'),
	(5, 'Chiapas'),
	(6, 'Chihuahua'),
	(7, 'Coahuila'),
	(8, 'Colima'),
	(9, 'Ciudad de México'),
	(10, 'Durango'),
	(11, 'Estado de México'),
	(12, 'Guanajuato'),
	(13, 'Guerrero'),
	(14, 'Hidalgo'),
	(15, 'Jalisco'),
	(16, 'Michoacán'),
	(17, 'Morelos'),
	(18, 'Nayarit'),
	(19, 'Nuevo\r\nLeón'),
	(20, 'Oaxaca'),
	(21, 'Puebla'),
	(22, 'Querétaro'),
	(23, 'Quintana Roo'),
	(24, 'San Luis Potosí'),
	(25, 'Sinaloa'),
	(26, 'Sonora'),
	(27, 'Tabasco'),
	(28, 'Tamaulipas'),
	(29, 'Tlaxcala'),
	(30, 'Veracruz'),
	(31, 'Yucatán'),
	(32, 'Zacatecas');
/*!40000 ALTER TABLE `estados` ENABLE KEYS */;

-- Dumping structure for table transpmex.estados_vehiculos
CREATE TABLE IF NOT EXISTS `estados_vehiculos` (
  `id_estado` tinyint(3) unsigned NOT NULL AUTO_INCREMENT,
  `estado` text NOT NULL,
  PRIMARY KEY (`id_estado`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='tabla de estados de vehiculos';

-- Dumping data for table transpmex.estados_vehiculos: ~2 rows (approximately)
/*!40000 ALTER TABLE `estados_vehiculos` DISABLE KEYS */;
INSERT INTO `estados_vehiculos` (`id_estado`, `estado`) VALUES
	(1, 'Parado'),
	(2, 'En Ruta'),
	(3, 'En Servicio');
/*!40000 ALTER TABLE `estados_vehiculos` ENABLE KEYS */;

-- Dumping structure for table transpmex.facturas
CREATE TABLE IF NOT EXISTS `facturas` (
  `id_factura` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` text NOT NULL DEFAULT '0',
  `calle` text NOT NULL DEFAULT '0',
  `colonia` text NOT NULL DEFAULT '0',
  `municipio` text NOT NULL DEFAULT '0',
  `id_estado` smallint(5) unsigned NOT NULL DEFAULT 0,
  `tipo_envio` smallint(5) unsigned NOT NULL DEFAULT 0,
  `vol_carga` float DEFAULT 0,
  `peso_carga` float DEFAULT 0,
  `fecha_salida` date DEFAULT NULL,
  `fecha_entrega` date DEFAULT NULL,
  `retraso` smallint(5) unsigned NOT NULL DEFAULT 0,
  `costo` float unsigned DEFAULT 0,
  PRIMARY KEY (`id_factura`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table transpmex.facturas: ~2 rows (approximately)
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
INSERT INTO `facturas` (`id_factura`, `key`, `calle`, `colonia`, `municipio`, `id_estado`, `tipo_envio`, `vol_carga`, `peso_carga`, `fecha_salida`, `fecha_entrega`, `retraso`, `costo`) VALUES
	(1, '0', 'Av8', 'Buenos Aires', 'Miguel Hidalgo', 3, 1, 34.5, 12.3, '2018-06-01', '2018-06-03', 0, 990),
	(2, 'KGF9UO', 'Av8', 'Buenos Aires', 'Miguel Hidalgo', 3, 1, 34.5, 12.3, '2018-06-01', '2018-06-03', 0, 990);
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;

-- Dumping structure for table transpmex.marcas
CREATE TABLE IF NOT EXISTS `marcas` (
  `id_marca` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `marca` text NOT NULL,
  PRIMARY KEY (`id_marca`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='tabla de marcas de vehiculos';

-- Dumping data for table transpmex.marcas: ~29 rows (approximately)
/*!40000 ALTER TABLE `marcas` DISABLE KEYS */;
INSERT INTO `marcas` (`id_marca`, `marca`) VALUES
	(1, 'Caterpillar'),
	(2, 'Chevrolet'),
	(3, 'Citroen'),
	(4, 'DAF'),
	(5, 'Dina'),
	(6, 'Dodge'),
	(7, 'FAW'),
	(8, 'Ford'),
	(9, 'Freightliner'),
	(10, 'Hino'),
	(11, 'Hyundai'),
	(12, 'Isuzu'),
	(13, 'Iveco'),
	(14, 'Kamaz'),
	(15, 'Kenworth'),
	(16, 'Mack'),
	(17, 'MAN'),
	(18, 'Mercedez-Benz'),
	(19, 'Mitsubishi'),
	(20, 'Navistar'),
	(21, 'Nissan'),
	(22, 'Otro'),
	(23, 'Peterbilt'),
	(24, 'Renault'),
	(25, 'Scania'),
	(26, 'Sterling'),
	(27, 'Tata'),
	(28, 'Volkswagen'),
	(29, 'Volvo');
/*!40000 ALTER TABLE `marcas` ENABLE KEYS */;

-- Dumping structure for table transpmex.tipo_envios
CREATE TABLE IF NOT EXISTS `tipo_envios` (
  `id_tipoenv` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `tipo` tinytext DEFAULT NULL,
  PRIMARY KEY (`id_tipoenv`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='Tipos de envios';

-- Dumping data for table transpmex.tipo_envios: ~2 rows (approximately)
/*!40000 ALTER TABLE `tipo_envios` DISABLE KEYS */;
INSERT INTO `tipo_envios` (`id_tipoenv`, `tipo`) VALUES
	(1, 'Local'),
	(2, 'Nacional');
/*!40000 ALTER TABLE `tipo_envios` ENABLE KEYS */;

-- Dumping structure for table transpmex.vehiculos
CREATE TABLE IF NOT EXISTS `vehiculos` (
  `id_vehiculo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `id_estado` tinyint(3) unsigned NOT NULL DEFAULT 1,
  `matr` text NOT NULL DEFAULT '0',
  `id_marca` smallint(6) unsigned NOT NULL DEFAULT 0,
  `modelo` text NOT NULL DEFAULT '0',
  `anio` smallint(4) unsigned NOT NULL DEFAULT 0,
  `cap_carga` int(11) NOT NULL DEFAULT 0,
  `vol_carga` int(11) NOT NULL DEFAULT 0,
  `km_recorridos` int(11) NOT NULL DEFAULT 0,
  `km_servicio` int(11) NOT NULL DEFAULT 0,
  `dir_img` text DEFAULT '0',
  PRIMARY KEY (`id_vehiculo`),
  KEY `FK_vehiculos_estados` (`id_estado`),
  KEY `FK_vehiculos_marcas` (`id_marca`),
  CONSTRAINT `FK_vehiculos_estados` FOREIGN KEY (`id_estado`) REFERENCES `estados_vehiculos` (`id_estado`),
  CONSTRAINT `FK_vehiculos_marcas` FOREIGN KEY (`id_marca`) REFERENCES `marcas` (`id_marca`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='Tabla que contiene los vehiculos de carga';

-- Dumping data for table transpmex.vehiculos: ~2 rows (approximately)
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
INSERT INTO `vehiculos` (`id_vehiculo`, `id_estado`, `matr`, `id_marca`, `modelo`, `anio`, `cap_carga`, `vol_carga`, `km_recorridos`, `km_servicio`, `dir_img`) VALUES
	(6, 1, 'KS345', 8, 'Transit', 1965, 2500, 4000, 0, 0, 'src\\main\\resources\\KS345van.jpg'),
	(8, 1, 'ks', 2, 'Supercargo', 2000, 1, 1, 1, 1, 'dos');
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
