CREATE DATABASE  IF NOT EXISTS `flight_book` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `flight_book`;
-- MySQL dump 10.13  Distrib 5.6.11, for Win32 (x86)
--
-- Host: localhost    Database: flight_book
-- ------------------------------------------------------
-- Server version	5.6.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking` (
  `pnr_no` int(11) NOT NULL AUTO_INCREMENT,
  `idno` int(11) NOT NULL,
  `user_name` varchar(8) NOT NULL,
  `flightno` int(11) NOT NULL,
  `date_flight` date NOT NULL,
  `date_book` date NOT NULL,
  `time_book` time NOT NULL,
  `class` varchar(15) NOT NULL,
  `tickets` int(11) NOT NULL,
  `rate` int(11) NOT NULL,
  `canceled` varchar(1) NOT NULL DEFAULT 'N',
  PRIMARY KEY (`pnr_no`),
  UNIQUE KEY `pnr_no_UNIQUE` (`pnr_no`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1,0,'admin',1,'2015-06-12','2015-01-01','08:20:00','Economy',5,7502,'Y'),(2,0,'admin',1,'2015-06-15','2015-06-13','17:02:52','Economy',2,7502,'N'),(3,0,'admin',2,'2015-06-18','2015-06-14','17:21:28','First Class',10,12500,'N'),(4,1,'harsh',6,'2015-10-12','2015-10-06','20:59:45','Economy',3,9500,'Y'),(5,1,'harsh',3,'2015-11-12','2015-10-23','07:38:09','Economy',4,14580,'N');
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flights`
--

DROP TABLE IF EXISTS `flights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flights` (
  `flightno` int(11) NOT NULL AUTO_INCREMENT,
  `flight_id` varchar(10) NOT NULL,
  `airline` varchar(10) NOT NULL,
  `from_f` varchar(20) NOT NULL,
  `to_f` varchar(20) NOT NULL,
  `dep_time` time NOT NULL,
  `arr_time` time NOT NULL,
  `rate_eco` int(11) NOT NULL,
  `rate_buss` int(11) NOT NULL,
  `rate_first` int(11) NOT NULL,
  `eco_seats` int(11) NOT NULL,
  `buss_seats` int(11) NOT NULL,
  `first_seats` int(11) NOT NULL,
  `flight_day` char(7) NOT NULL,
  PRIMARY KEY (`flightno`),
  UNIQUE KEY `flight_id_UNIQUE` (`flight_id`),
  UNIQUE KEY `flightno_UNIQUE` (`flightno`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flights`
--

LOCK TABLES `flights` WRITE;
/*!40000 ALTER TABLE `flights` DISABLE KEYS */;
INSERT INTO `flights` VALUES (1,'6E-379','Indigo','Kolkata','Bengaluru','06:10:00','08:35:00',7502,9000,15650,30,30,30,'1346'),(2,'6E-414','Indigo','Bengaluru','Bhopal','12:30:00','21:20:00',7452,9020,12500,50,40,40,'2457'),(3,'9W-2282','Jet Airway','Delhi','Kolkata','10:20:00','14:10:00',14580,18765,20755,40,30,30,'1256'),(4,'AI-924','Air India','Bhopal','Mumbai','15:30:00','09:10:00',10303,14597,17890,40,40,30,'1367'),(5,'SG-279','Spice Jet','Delhi','Kochi','22:20:00','01:00:00',6700,10200,14000,25,30,30,'4567'),(6,'AI-927','Air India','Kolkata','Bhopal','07:00:00','13:20:00',9500,11700,14500,45,30,25,'2357');
/*!40000 ALTER TABLE `flights` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `idno` int(11) NOT NULL,
  `user_name` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL,
  `address` varchar(120) NOT NULL,
  `phone_no` char(11) NOT NULL,
  `city` varchar(20) NOT NULL,
  `dev` char(1) NOT NULL DEFAULT 'N',
  PRIMARY KEY (`idno`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (0,'admin','admin','admin','2147483647','admin','Y');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-05 11:32:08
