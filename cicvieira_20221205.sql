-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: cicvieira
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cargo_funcionarios`
--

DROP TABLE IF EXISTS `cargo_funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cargo_funcionarios` (
  `cargo_id` int NOT NULL,
  `funcionario_id` int NOT NULL,
  UNIQUE KEY `UK_jugfche1y1orvtis9ftn88kkg` (`funcionario_id`),
  KEY `FKjwhs9cksbprrrqc4bxxbcwlgy` (`cargo_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargo_funcionarios`
--

LOCK TABLES `cargo_funcionarios` WRITE;
/*!40000 ALTER TABLE `cargo_funcionarios` DISABLE KEYS */;
INSERT INTO `cargo_funcionarios` VALUES (1,1),(1,2),(2,3),(2,4),(3,5),(3,6);
/*!40000 ALTER TABLE `cargo_funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cargo_tbl`
--

DROP TABLE IF EXISTS `cargo_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cargo_tbl` (
  `id` int NOT NULL,
  `beneficio` int NOT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `salario` double DEFAULT NULL,
  `vl_ano_servico` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargo_tbl`
--

LOCK TABLES `cargo_tbl` WRITE;
/*!40000 ALTER TABLE `cargo_tbl` DISABLE KEYS */;
INSERT INTO `cargo_tbl` VALUES (1,20,'Secretário',7000,1000),(2,30,'Vendedor',12000,1800),(3,0,'Gerente',20000,3000);
/*!40000 ALTER TABLE `cargo_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario_vendas`
--

DROP TABLE IF EXISTS `funcionario_vendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario_vendas` (
  `funcionario_id` int NOT NULL,
  `venda_id` int NOT NULL,
  UNIQUE KEY `UK_2fph3uduxejo5hrbl2yj8tg11` (`venda_id`),
  KEY `FK2xrj9fsijpvv3c352bnixgs3x` (`funcionario_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario_vendas`
--

LOCK TABLES `funcionario_vendas` WRITE;
/*!40000 ALTER TABLE `funcionario_vendas` DISABLE KEYS */;
INSERT INTO `funcionario_vendas` VALUES (3,1),(3,2),(3,3),(3,4),(3,5),(4,6),(4,7),(4,8),(4,9),(4,10);
/*!40000 ALTER TABLE `funcionario_vendas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios_tbl`
--

DROP TABLE IF EXISTS `funcionarios_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionarios_tbl` (
  `id` int NOT NULL,
  `contratacao` datetime DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios_tbl`
--

LOCK TABLES `funcionarios_tbl` WRITE;
/*!40000 ALTER TABLE `funcionarios_tbl` DISABLE KEYS */;
INSERT INTO `funcionarios_tbl` VALUES (1,'2018-01-01 00:00:00','Jorge Carvalho '),(2,'2015-12-01 00:00:00','Maria Souza '),(3,'2021-12-01 00:00:00','Ana Silva'),(5,'2017-07-01 00:00:00','Juliana Alves '),(6,'2014-03-01 00:00:00','Bento Albino '),(4,'2021-12-01 00:00:00','João Mendes');
/*!40000 ALTER TABLE `funcionarios_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendas_tbl`
--

DROP TABLE IF EXISTS `vendas_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendas_tbl` (
  `id` int NOT NULL,
  `mes_venda` datetime DEFAULT NULL,
  `vl_vendas` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendas_tbl`
--

LOCK TABLES `vendas_tbl` WRITE;
/*!40000 ALTER TABLE `vendas_tbl` DISABLE KEYS */;
INSERT INTO `vendas_tbl` VALUES (1,'2021-12-01 00:00:00',5200),(2,'2022-01-01 00:00:00',4000),(3,'2022-02-01 00:00:00',4200),(4,'2022-03-01 00:00:00',5850),(5,'2022-04-01 00:00:00',7000),(6,'2021-12-01 00:00:00',3400),(7,'2022-01-01 00:00:00',7700),(8,'2022-02-01 00:00:00',5000),(9,'2022-03-01 00:00:00',5900),(10,'2022-04-01 00:00:00',6500);
/*!40000 ALTER TABLE `vendas_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-05 16:37:07
