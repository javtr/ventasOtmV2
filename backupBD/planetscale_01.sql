-- MySQL dump 10.13  Distrib 8.0.31, for Linux (x86_64)
--
-- Host: us-east.connect.psdb.cloud    Database: test-otm
-- ------------------------------------------------------
-- Server version	8.0.23-PlanetScale

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '462ea4dd-70ae-11ed-b63c-fa0f8360fb2c:1-158';

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) DEFAULT NULL,
  `comentario1` varchar(255) DEFAULT NULL,
  `comentario2` varchar(255) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `estado` int DEFAULT NULL,
  `id_machine` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=166 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (121,'matos','posible cambio id ',NULL,'emirmatos@hotmail.com',0,'90BC89116839FA8A9C582480A58092CD','emir'),(122,'bernal','','','so307755@gmail.com',0,'77D822BF0DCC35DA5A08148909DD9E00','jose antonio'),(123,'diaz','','43B1DF9355CD06F947DB0F2B444B4022,43B1DF9355CD06F947DB0F2B444B4022,43B1DF9355CD06F947DB0F2B444B4022,43B1DF9355CD06F947DB0F2B444B4022','netillodiaz@hotmail.com',0,'BFAFB41B24528F056E1BB5451970BEF3','ernesto'),(124,'pareja','','','xpareja@yahoo.com',0,'7EA48AEACC5DB59F18C223AB9E0B7B40','xavier'),(125,'casado','','','maurocasado.mmo@gmail.com',0,'FD00EF7DEFD0B81BA16D4744FC86F239','mauro '),(126,'lara','','','hugo_laraz@yahoo.com.mx',0,'3ADCEBCC2D8A6A916875683A0C80071B','hector hugo'),(127,'barrientos','','','christian_barrie@hotmail.com',0,'35AB64C66F081FA21B5F867E2D23FCA3','christian'),(128,'oliveira','','','ixos82@gmail.com',0,'79C4A2DE1220C0C82A57B630FE051BA5','ivan'),(129,'gonzales','','','gonzalezifm@hotmail.com',0,'68F87B4BB55C07B122DF2B3C18F1AE15','jose'),(130,'baez','paypal de delma rubio','','yotubendo@gmail.com',0,'44B9512A39DBD6A1F56F209269346F30','miguel'),(131,'aldana','','','aldanavelajuanjavier@gmail.com',0,'AF0B11E4A01F1F46014E63FDFCBEA694','juan javier'),(132,'ng','canadiense','','emwng@shaw.ca',0,'7243A76BFF3FDFFC5648BF3CA3D47AC1','eduard'),(133,'Oosthuizen','','','prokkieinvest@gmail.com',0,'C857ED7B85CF0C6332EC8CEB46FAF1D5','Jacques'),(134,'abreu','','','Karloslevit@gmail.com',0,'D5013A906C1DE5835AECD0BCA51024C3','carlos '),(135,'pruebaApellido','','','catar@gmail.com',2,'066D7E1004B66CDA69FBP1865BF92221','prueba'),(136,'pruebaApellido','','','catar@gmail.com',0,'066D7E1004B66CDA69FBP1865BF92221','prueba'),(137,'prueba2','','','bd@gmail.com',0,'066D7E1004B66CDA69FB21865AF92221','prueba'),(138,'test','','','a@a.com',0,'066D7E1004B66CDA69FB21865AF92221','test'),(140,'briongos','','','jbriongosc@gmail.com',0,'66FE204A3D0ADB36FBF73929F39D3685','javier'),(141,'castillo','','','Fx.Castiel.C@gmail.com',0,'6E484A20AC0F0C8DB2882B5E5A82A169','angel'),(142,'izquierdo','','','izkierdo93@gmail.com',0,'1D2945C930683AE506AF5C6BC9D808ED','andres'),(143,'butarro','','','fernandolb27@hotmail.com',0,'D1722C23054E91F8E6816DB287D32FF6','fernando'),(144,'urdas','','','basinasu71@gmail.com',0,'D6991E8A56E4D4CAE513EEB32E94F486','basi nasi'),(145,'munuera','','','rhino3d@hotmail.es',0,'76143523FCDCC10B3412E6CBA4FABF6C','ramon'),(146,'verdejo','','','federicoverdejo@gmail.com',0,'5227BF762915EEAC2FF9BD85F358C7C2','federico'),(147,'lemus','','','kelvintrader200@gmail.com',0,'47D41BBD4BB97118E47B5C7781A3F714','kevin'),(148,'olivera','','','ivan.xavier.oliveira@gmail.com',0,'79C4A2DE1220C0C82A57B630FE051BA5','pedro'),(149,'falta','','','luimanco87@hotmail.com',0,'CA4E60649986B88F907806E812FD08B1','luis miguel'),(150,'diaz','','','robertoleon850425@gmail.com',0,'32DEA84AC57E372374968FD3FB044098','roberto leon'),(151,'nuñez','','','Josemanuelnp24@gmail.com',0,'DA29C22613D78328A683E20568DD513B','jose'),(152,'garcia','','','diegotraderusd@gmail.com',0,'D713ECF635EC6AAC09C835FE2A50846F','diago'),(153,'gutierrez','','','eigraham.ttg@gmail.com',0,'B8AAA3350997BDAF857571B11BA9A1B3','abraham'),(154,'obrero','','','pablosobrero93@gmail.com',0,'58F0D577B7228F76717ADBFF41214A42','pablo'),(155,'castro','','','studio7tradinguprofit@gmail.com',0,'A41B4FB668CCB7DD07FACBDF30C28CDA','oscar'),(156,'cardona','','','jpcardona@gmail.com',0,'43B4211392E73E3AE44F5BB8FBDCC754','juan pablo'),(157,'ortega','','','acrobata999@gmail.com',0,'FD3F283173DC495DAEC8972DDB26EAD3','javier'),(158,'gonzales','','','davidsebastian.023@hotmail.es',0,'5B09131E2A6FAE5D6CE471A0A38B59B6','sebastian'),(159,'vargas','','','ivanvargas1026@gmail.com',0,'D9DA9A9AED6B9C970B3A73613810C399','oscar'),(160,'de la hoz','','','mailto:eduardo@delahoz.co',0,'4CE2BFD91179A18868ACC394D6EDF8A8','eduardo'),(161,'falta','','','info@futurostrade.com',0,'260C9825EC163B5DCFFD88B9E46D8C41','leonardo'),(162,'sanchez','','','davivsz@hotmail.com',0,'AEC641035F696496E1134F1C42A4F67F','david'),(163,'gutierrez','','','fergutiflo.trader@gmail.com',0,'05A4171AD4E330E5D87C3E46333DDBA5','fernando'),(164,'franco','','','leone.rfs@gmail.com',0,'75BA707532690BBE4F0697824DF89050','roberto'),(165,'polania','','','elias.polania@gmail.com',0,'F876C0E103797C01C4D66329EC53E134','elias');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cantidad` int DEFAULT NULL,
  `precio_compra` double NOT NULL,
  `precio_final` double NOT NULL,
  `cliente_id` int NOT NULL,
  `factura_id` int NOT NULL,
  `producto_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=223 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (180,1,497,497,121,146,1),(181,1,497,397.6,122,147,1),(188,1,497,497,123,150,1),(189,1,500,500,140,151,3),(190,1,500,500,141,152,3),(191,1,500,500,142,153,3),(192,1,500,500,143,154,3),(193,1,497,497,144,155,1),(194,1,497,422.45,145,156,1),(195,1,397,240.02620000000002,142,157,35),(196,1,497,497,146,158,1),(197,1,197,120.17,147,159,40),(198,1,197,120.17,148,160,40),(199,1,192,192,149,161,25),(200,1,500,500,150,162,3),(201,1,500,500,151,163,3),(202,1,497,377.72,152,164,1),(203,1,197,149.72,152,164,40),(204,1,497,422.0027,153,165,1),(205,1,500,500,154,166,3),(206,1,497,422.45,155,167,1),(207,1,497,372.75,156,168,1),(208,1,397,297.75,156,168,35),(209,1,500,422.5,157,169,3),(210,1,397,247.0134,157,169,35),(211,1,397,350.0349,158,170,35),(212,1,397,350.0349,159,171,35),(213,1,500,423,160,172,3),(214,1,397,242.0112,160,172,35),(215,1,197,197,161,173,40),(216,1,500,500,162,174,3),(217,1,497,497,163,175,1),(218,1,500,500,164,176,3),(219,1,500,500,165,177,3),(220,1,192,182.4,138,178,30),(221,3,591,506.48699999999997,138,178,40),(222,1,288,288,138,179,15);
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `id` int NOT NULL AUTO_INCREMENT,
  `compra_activa` int DEFAULT NULL,
  `fecha_compra` varchar(255) DEFAULT NULL,
  `valor_compra` double NOT NULL,
  `cliente_id` int NOT NULL,
  `medio_pago_id` int NOT NULL,
  `tipo_pago_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=180 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (146,0,'2021-11-17',497,121,1,3),(147,0,'2021-11-28',397.6,122,1,3),(150,0,'2021-12-11',497,123,1,3),(151,0,'2022-11-14',500,140,3,4),(152,0,'2021-11-14',500,141,3,4),(153,0,'2021-12-02',500,142,3,4),(154,0,'2021-12-18',500,143,3,4),(155,0,'2022-01-07',497,144,3,3),(156,0,'2022-02-28',422.45,145,3,3),(157,0,'2022-03-04',240.02620000000002,142,3,3),(158,0,'2022-03-04',497,146,3,3),(159,0,'2022-03-08',120.17,147,3,3),(160,0,'2022-03-09',120.17,148,3,3),(161,0,'2022-03-12',192,149,3,3),(162,0,'2022-03-20',500,150,3,4),(163,0,'2022-04-01',500,151,3,4),(164,0,'2022-04-01',527.44,152,3,3),(165,0,'2022-04-11',422.0027,153,3,3),(166,0,'2022-05-04',500,154,3,4),(167,0,'2022-06-17',422.45,155,3,3),(168,0,'2022-06-24',670.5,156,3,4),(169,0,'2022-07-07',669.5134,157,3,4),(170,0,'2022-07-11',350.0349,158,3,4),(171,0,'2022-07-11',350.0349,159,3,4),(172,0,'2022-07-14',665.0112,160,3,4),(173,0,'2022-08-20',197,161,3,3),(174,0,'2022-08-08',500,162,3,4),(175,0,'2022-08-31',497,163,1,3),(176,0,'2022-09-01',500,164,3,4),(177,0,'2022-11-10',500,165,3,4),(178,0,'2022-11-15',688.887,138,4,4),(179,0,'2022-11-08',288,138,1,3);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medio_pago`
--

DROP TABLE IF EXISTS `medio_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medio_pago` (
  `id` int NOT NULL AUTO_INCREMENT,
  `medio_pago` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medio_pago`
--

LOCK TABLES `medio_pago` WRITE;
/*!40000 ALTER TABLE `medio_pago` DISABLE KEYS */;
INSERT INTO `medio_pago` VALUES (1,'paypal OTM'),(2,'Paypal cristian'),(3,'teachable'),(4,'nequi y otros'),(8,'nequi');
/*!40000 ALTER TABLE `medio_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cliente_id_pago` int DEFAULT NULL,
  `estado` int DEFAULT NULL,
  `estado_cliente_pago` int DEFAULT NULL,
  `estado_factura_pago` int DEFAULT NULL,
  `factura_id_pago` int DEFAULT NULL,
  `fecha_desembolso` varchar(255) DEFAULT NULL,
  `fecha_pago` varchar(255) DEFAULT NULL,
  `tipo_pago` varchar(255) DEFAULT NULL,
  `valor_pago` double NOT NULL,
  `valor_pago_neto` double NOT NULL,
  `factura_id` int NOT NULL,
  `cliente_nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKrtu0je6xnvrvwuflslyslq2eo` (`factura_id`)
) ENGINE=InnoDB AUTO_INCREMENT=126 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (32,121,0,0,0,146,'2021-11-17','2021-11-17','paypal OTM',500,469.8,146,'emir matos'),(33,122,0,0,0,147,'2021-11-28','2021-11-28','paypal OTM',397.6,375.8296,147,'jose antonio bernal'),(36,123,0,0,0,150,'2021-12-11','2021-12-11','paypal OTM',497,469.86199999999997,150,'ernesto diaz'),(37,140,0,0,0,151,'2022-01-01','2021-11-14','teachable',100,91.1,151,'javier briongos'),(38,140,0,0,0,151,'2022-02-01','2021-12-14','teachable',100,91.1,151,'javier briongos'),(39,140,0,0,0,151,'2022-03-01','2022-01-14','teachable',100,91.1,151,'javier briongos'),(40,140,0,0,0,151,'2022-04-01','2022-02-14','teachable',100,91.1,151,'javier briongos'),(41,140,0,0,0,151,'2022-05-01','2022-03-14','teachable',100,91.1,151,'javier briongos'),(42,141,0,0,0,152,'2022-01-01','2021-11-14','teachable',100,91.1,152,'angel castillo'),(43,141,0,0,0,152,'2022-02-01','2021-12-14','teachable',100,91.1,152,'angel castillo'),(44,141,0,0,0,152,'2022-03-01','2022-01-14','teachable',100,91.1,152,'angel castillo'),(45,141,0,0,0,152,'2022-04-01','2022-02-14','teachable',100,91.1,152,'angel castillo'),(46,141,0,0,0,152,'2022-05-01','2022-03-14','teachable',100,91.1,152,'angel castillo'),(47,142,0,0,0,153,'2022-02-01','2021-12-02','teachable',100,91.1,153,'andres izquierdo'),(48,142,0,0,0,153,'2022-03-01','2022-01-02','teachable',100,91.1,153,'andres izquierdo'),(49,142,0,0,0,153,'2022-04-01','2022-02-02','teachable',100,91.1,153,'andres izquierdo'),(50,142,0,0,0,153,'2022-05-01','2022-03-02','teachable',100,91.1,153,'andres izquierdo'),(51,142,0,0,0,153,'2022-06-01','2022-04-02','teachable',100,91.1,153,'andres izquierdo'),(52,143,0,0,0,154,'2022-02-01','2021-12-18','teachable',100,91.1,154,'fernando butarro'),(53,143,0,0,0,154,'2022-03-01','2022-01-18','teachable',100,91.1,154,'fernando butarro'),(54,143,0,0,0,154,'2022-04-01','2022-02-18','teachable',100,91.1,154,'fernando butarro'),(55,143,0,0,0,154,'2022-05-01','2022-03-18','teachable',100,91.1,154,'fernando butarro'),(56,143,0,0,0,154,'2022-06-01','2022-04-18','teachable',100,91.1,154,'fernando butarro'),(57,144,0,0,0,155,'2022-01-07','2022-01-07','teachable',497,453.958,155,'basi nasi urdas'),(58,145,0,0,0,156,'2022-02-28','2022-02-28','teachable',422.45,385.8193,156,'ramon munuera'),(59,142,0,0,0,157,'2022-03-04','2022-03-04','teachable',240.02620000000002,219.0839468,157,'andres izquierdo'),(60,146,0,0,0,158,'2022-03-04','2022-03-04','teachable',497,453.958,158,'federico verdejo'),(61,147,0,0,0,159,'2022-03-08','2022-03-08','teachable',120.17,109.53538,159,'kevin lemus'),(62,148,0,0,0,160,'2022-03-09','2022-03-09','teachable',120.17,109.53538,160,'pedro olivera'),(63,149,0,0,0,161,'2022-03-12','2022-03-12','teachable',192,175.188,161,'luis miguel falta'),(64,150,0,0,0,162,'2022-05-01','2022-03-20','teachable',100,91.1,162,'roberto leon diaz'),(65,150,0,0,0,162,'2022-06-01','2022-04-20','teachable',100,91.1,162,'roberto leon diaz'),(66,150,0,0,0,162,'2022-07-01','2022-05-20','teachable',100,91.1,162,'roberto leon diaz'),(67,150,0,0,0,162,'2022-08-01','2022-06-20','teachable',100,91.1,162,'roberto leon diaz'),(68,150,0,0,0,162,'2022-09-01','2022-07-20','teachable',100,91.1,162,'roberto leon diaz'),(69,151,0,0,0,163,'2022-06-01','2022-04-01','teachable',100,91.1,163,'jose nuñez'),(70,151,0,0,0,163,'2022-07-01','2022-05-01','teachable',100,91.1,163,'jose nuñez'),(71,151,0,0,0,163,'2022-08-01','2022-06-01','teachable',100,91.1,163,'jose nuñez'),(72,151,0,0,0,163,'2022-09-01','2022-07-01','teachable',100,91.1,163,'jose nuñez'),(73,151,0,0,0,163,'2022-10-01','2022-08-01','teachable',100,91.1,163,'jose nuñez'),(74,152,0,0,0,164,'2022-04-01','2022-04-01','teachable',527.44,481.78016,164,'diago garcia'),(75,153,0,0,0,165,'2022-04-11','2022-04-11','teachable',422.0027,385.4104678,165,'abraham gutierrez'),(76,154,0,0,0,166,'2022-07-01','2022-05-04','teachable',100,91.1,166,'pablo obrero'),(77,154,0,0,0,166,'2022-08-01','2022-06-04','teachable',100,91.1,166,'pablo obrero'),(78,154,0,0,0,166,'2022-09-01','2022-07-04','teachable',100,91.1,166,'pablo obrero'),(79,154,0,0,0,166,'2022-10-01','2022-08-04','teachable',100,91.1,166,'pablo obrero'),(80,154,0,0,0,166,'2022-11-01','2022-09-04','teachable',100,91.1,166,'pablo obrero'),(81,155,0,0,0,167,'2022-06-17','2022-06-17','teachable',422.45,385.8193,167,'oscar castro'),(82,156,0,0,0,168,'2022-08-01','2022-06-24','teachable',223.5,203.97899999999998,168,'juan pablo cardona'),(83,156,0,0,0,168,'2022-09-01','2022-07-24','teachable',223.5,203.97899999999998,168,'juan pablo cardona'),(84,156,0,0,0,168,'2022-10-01','2022-08-24','teachable',223.5,203.97899999999998,168,'juan pablo cardona'),(85,157,0,0,0,169,'2022-09-01','2022-07-07','teachable',133.90268,122.08704952,169,'javier ortega'),(86,157,0,0,0,169,'2022-10-01','2022-08-07','teachable',133.90268,122.08704952,169,'javier ortega'),(87,157,0,0,0,169,'2022-11-01','2022-09-07','teachable',133.90268,122.08704952,169,'javier ortega'),(88,157,0,0,0,169,'2022-12-01','2022-10-07','teachable',133.90268,122.08704952,169,'javier ortega'),(89,157,0,0,0,169,'2023-01-01','2022-11-07','teachable',133.90268,122.08704952,169,'javier ortega'),(90,158,0,0,0,170,'2022-09-01','2022-07-11','teachable',70.00698,63.68637972,170,'sebastian gonzales'),(91,158,0,0,0,170,'2022-10-01','2022-08-11','teachable',70.00698,63.68637972,170,'sebastian gonzales'),(92,158,0,0,0,170,'2022-11-01','2022-09-11','teachable',70.00698,63.68637972,170,'sebastian gonzales'),(93,158,0,0,0,170,'2022-12-01','2022-10-11','teachable',70.00698,63.68637972,170,'sebastian gonzales'),(94,158,0,0,0,170,'2023-01-01','2022-11-11','teachable',70.00698,63.68637972,170,'sebastian gonzales'),(95,159,0,0,0,171,'2022-09-01','2022-07-11','teachable',70.00698,63.68637972,171,'oscar vargas'),(96,159,0,0,0,171,'2022-10-01','2022-08-11','teachable',70.00698,63.68637972,171,'oscar vargas'),(97,159,0,0,0,171,'2022-11-01','2022-09-11','teachable',70.00698,63.68637972,171,'oscar vargas'),(98,159,0,0,0,171,'2022-12-01','2022-10-11','teachable',70.00698,63.68637972,171,'oscar vargas'),(99,159,0,0,0,171,'2023-01-01','2022-11-11','teachable',70.00698,63.68637972,171,'oscar vargas'),(100,160,0,0,0,172,'2022-09-01','2022-07-14','teachable',133.00224,121.26404736,172,'eduardo de la hoz'),(101,160,0,0,0,172,'2022-10-01','2022-08-14','teachable',133.00224,121.26404736,172,'eduardo de la hoz'),(102,160,0,0,0,172,'2022-11-01','2022-09-14','teachable',133.00224,121.26404736,172,'eduardo de la hoz'),(103,160,0,0,0,172,'2022-12-01','2022-10-14','teachable',133.00224,121.26404736,172,'eduardo de la hoz'),(104,160,0,0,0,172,'2023-01-01','2022-11-14','teachable',133.00224,121.26404736,172,'eduardo de la hoz'),(105,161,0,0,0,173,'2022-08-20','2022-08-20','teachable',197,179.75799999999998,173,'leonardo falta'),(106,162,0,0,0,174,'2022-10-01','2022-08-08','teachable',100,91.1,174,'david sanchez'),(107,162,0,0,0,174,'2022-11-01','2022-09-08','teachable',100,91.1,174,'david sanchez'),(108,162,0,0,0,174,'2022-12-01','2022-10-08','teachable',100,91.1,174,'david sanchez'),(109,162,0,0,0,174,'2023-01-01','2022-11-08','teachable',100,91.1,174,'david sanchez'),(110,162,0,0,0,174,'2023-02-01','2022-12-08','teachable',100,91.1,174,'david sanchez'),(111,163,0,0,0,175,'2022-08-31','2022-08-31','paypal OTM',497,469.86199999999997,175,'fernando gutierrez'),(112,164,0,0,0,176,'2022-11-01','2022-09-01','teachable',100,91.1,176,'roberto franco'),(113,164,0,0,0,176,'2022-12-01','2022-10-01','teachable',100,91.1,176,'roberto franco'),(114,164,0,0,0,176,'2023-01-01','2022-11-01','teachable',100,91.1,176,'roberto franco'),(115,164,0,0,0,176,'2023-02-01','2022-12-01','teachable',100,91.1,176,'roberto franco'),(116,164,0,0,0,176,'2023-03-01','2023-01-01','teachable',100,91.1,176,'roberto franco'),(117,165,0,0,0,177,'2023-01-01','2022-11-10','teachable',100,91.1,177,'elias polania'),(118,165,0,0,0,177,'2023-02-01','2022-12-10','teachable',100,91.1,177,'elias polania'),(119,165,0,0,0,177,'2023-03-01','2023-01-10','teachable',100,91.1,177,'elias polania'),(120,165,0,0,0,177,'2023-04-01','2023-02-10','teachable',100,91.1,177,'elias polania'),(121,165,0,0,0,177,'2023-05-01','2023-03-10','teachable',100,91.1,177,'elias polania'),(123,138,0,0,0,178,'2023-01-01','2022-11-15','nequi y otros',344.4435,344.4435,178,'test test'),(124,138,0,0,0,178,'2023-02-01','2022-12-15','nequi y otros',344.4435,344.4435,178,'test test'),(125,138,0,0,0,179,'2022-11-08','2022-11-08','paypal OTM',288,272.14799999999997,179,'test test');
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'OTM pack unico',497),(3,'OTM Pack cuotas',500),(15,'OTM Swing',288),(20,'OTM profile',288),(25,'OTM micro',192),(30,'OTM cumulated',192),(35,'Logic pack',397),(40,'Logic Order flow',197),(45,'Logic profile',197),(50,'Logic analytics',97);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_pago`
--

DROP TABLE IF EXISTS `tipo_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_pago` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo_pago` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_pago`
--

LOCK TABLES `tipo_pago` WRITE;
/*!40000 ALTER TABLE `tipo_pago` DISABLE KEYS */;
INSERT INTO `tipo_pago` VALUES (3,'unico'),(4,'cuotas');
/*!40000 ALTER TABLE `tipo_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `rol` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'$argon2id$v=19$m=1024,t=1,p=1$CAPPcRGfp3054Dhv9t8gug$U7Kexadd21NXsrPdMvDadX2mmM5sBAnNnmgounGYVT4','ADMIN','pepe'),(14,'$argon2id$v=19$m=1024,t=1,p=1$8xszoRqAvonCOHc488Dxxg$h1y62DymcUyr00ajUpIdvAwIRQzywXexBeLZhoAUQuA','USER','pepe'),(15,'$argon2id$v=19$m=1024,t=1,p=1$G8EY65wQvsBotcAA+QnH2Q$PtuSWcheaWzLxcSfpIBjfpPQAuQokx/tcFatbg7KwmA','USER','homero'),(19,'$argon2id$v=19$m=1024,t=1,p=1$KOTG08lAZt52RI4vPRhdIQ$jSXWW6IrgOh+Y2ShwoIop9bYuMpbOMlT68/QhZl4sPU','USER','cristianccuellar@gmail.com');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-30 16:17:23
