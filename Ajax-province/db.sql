-- MySQL dump 10.13  Distrib 5.5.49, for Win64 (x86)
--
-- Host: localhost    Database: db
-- ------------------------------------------------------
-- Server version	5.5.49

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
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `city` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `cityName` varchar(20) NOT NULL COMMENT '市的名称',
  `proId` int(10) DEFAULT NULL COMMENT '所属省的ID',
  PRIMARY KEY (`id`),
  KEY `proId` (`proId`),
  CONSTRAINT `city_ibfk_1` FOREIGN KEY (`proId`) REFERENCES `province` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (1,'合肥',1),(2,'六安',1),(3,'芜湖',1),(4,'巢湖',1),(5,'马鞍山',1),(6,'杭州',2),(7,'萧山',2),(8,'千岛湖',2),(9,'新安江',2),(10,'桐庐',2),(11,'泉州',3),(12,'福州',3),(13,'莆田',3),(14,'龙岩',3);
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `district`
--

DROP TABLE IF EXISTS `district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `district` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `disName` varchar(20) NOT NULL COMMENT '区的名称',
  `cityId` int(10) DEFAULT NULL COMMENT '所属的市的ID',
  PRIMARY KEY (`id`),
  KEY `cityId` (`cityId`),
  CONSTRAINT `district_ibfk_1` FOREIGN KEY (`cityId`) REFERENCES `city` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `district`
--

LOCK TABLES `district` WRITE;
/*!40000 ALTER TABLE `district` DISABLE KEYS */;
INSERT INTO `district` VALUES (1,'蜀山区',1),(2,'包河区',1),(3,'金安区',2),(4,'裕安区',2),(5,'三山区',3),(6,'镜湖区',3),(7,'居巢区',4),(8,'含山县',4),(9,'西湖区',6),(10,'拱墅区',6);
/*!40000 ALTER TABLE `district` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `province`
--

DROP TABLE IF EXISTS `province`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `province` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `proName` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `province`
--

LOCK TABLES `province` WRITE;
/*!40000 ALTER TABLE `province` DISABLE KEYS */;
INSERT INTO `province` VALUES (1,'安徽省'),(2,'浙江省'),(3,'福建省'),(4,'江西省'),(5,'湖南省'),(6,'云南省'),(7,'黑龙江省'),(8,'河南省');
/*!40000 ALTER TABLE `province` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-26 16:34:44
