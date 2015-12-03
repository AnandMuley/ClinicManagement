CREATE DATABASE  IF NOT EXISTS `icare` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `icare`;
-- MySQL dump 10.13  Distrib 5.6.27, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: icare
-- ------------------------------------------------------
-- Server version	5.6.27-0ubuntu0.14.04.1

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
-- Table structure for table `appointments`
--

DROP TABLE IF EXISTS `appointments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `appointments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `age` bigint(20) NOT NULL,
  `consultant` varchar(255) DEFAULT NULL,
  `contactNo` bigint(20) NOT NULL,
  `date` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `referredBy` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointments`
--

LOCK TABLES `appointments` WRITE;
/*!40000 ALTER TABLE `appointments` DISABLE KEYS */;
INSERT INTO `appointments` VALUES (1,'Bandra',30,'Viki',7898089890,'2015-12-03 00:00:00','Arjun Rampal','DoctorA','Male'),(2,'Bandra Versova',40,'Avira',7890098700,'2015-12-03 00:00:00','Karan Verma','DoctorA','Male'),(3,'Pune',24,'None',9870098700,'2015-12-02 00:00:00','Rahul Verma','DoctorA','Male'),(4,'A2-202,Sky Heights,Versova,Mumbai-444001',45,'Karan Verma',8978998799,'2015-12-02 00:00:00','Akash Malhotra','DoctorA','Male');
/*!40000 ALTER TABLE `appointments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicines`
--

DROP TABLE IF EXISTS `medicines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicines` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `code` varchar(50) DEFAULT NULL,
  `medicineType` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicines`
--

LOCK TABLES `medicines` WRITE;
/*!40000 ALTER TABLE `medicines` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opdcasepaper`
--

DROP TABLE IF EXISTS `opdcasepaper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opdcasepaper` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `diagnosis` varchar(255) DEFAULT NULL,
  `eyeType` varchar(255) DEFAULT NULL,
  `fundus` varchar(255) DEFAULT NULL,
  `iot` varchar(255) DEFAULT NULL,
  `nct` varchar(255) DEFAULT NULL,
  `pinHole` varchar(255) DEFAULT NULL,
  `sac` varchar(255) DEFAULT NULL,
  `sle` varchar(255) DEFAULT NULL,
  `vaNear` varchar(255) DEFAULT NULL,
  `vision` varchar(255) DEFAULT NULL,
  `PatientId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_8hxqr5w022osy98w9svch66vo` (`PatientId`),
  CONSTRAINT `FK_8hxqr5w022osy98w9svch66vo` FOREIGN KEY (`PatientId`) REFERENCES `patients` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opdcasepaper`
--

LOCK TABLES `opdcasepaper` WRITE;
/*!40000 ALTER TABLE `opdcasepaper` DISABLE KEYS */;
/*!40000 ALTER TABLE `opdcasepaper` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patients`
--

DROP TABLE IF EXISTS `patients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patients` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `allergies` varchar(255) DEFAULT NULL,
  `contactNo` varchar(255) DEFAULT NULL,
  `diseaseHistory` varchar(255) DEFAULT NULL,
  `fees` int(11) DEFAULT NULL,
  `mrdNo` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `procedureFees` int(11) DEFAULT NULL,
  `referredBy` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patients`
--

LOCK TABLES `patients` WRITE;
/*!40000 ALTER TABLE `patients` DISABLE KEYS */;
/*!40000 ALTER TABLE `patients` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-03 10:04:42
