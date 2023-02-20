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

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '462ea4dd-70ae-11ed-b63c-fa0f8360fb2c:1-363,
c4c277c8-7c0f-11ed-a309-32c90dc2d3b2:1-240,
e8f7aa14-80b1-11ed-8241-32a0184e69e4:1-159';

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
) ENGINE=InnoDB AUTO_INCREMENT=186 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (121,'matos','posible cambio id ',NULL,'emirmatos@hotmail.com',0,'90BC89116839FA8A9C582480A58092CD','emir'),(122,'bernal','','','so307755@gmail.com',0,'77D822BF0DCC35DA5A08148909DD9E00','jose antonio'),(123,'diaz','','43B1DF9355CD06F947DB0F2B444B4022,43B1DF9355CD06F947DB0F2B444B4022,43B1DF9355CD06F947DB0F2B444B4022,43B1DF9355CD06F947DB0F2B444B4022','netillodiaz@hotmail.com',0,'BFAFB41B24528F056E1BB5451970BEF3','ernesto'),(124,'pareja','','','xpareja@yahoo.com',0,'7EA48AEACC5DB59F18C223AB9E0B7B40','xavier'),(125,'casado','','','maurocasado.mmo@gmail.com',0,'FD00EF7DEFD0B81BA16D4744FC86F239','mauro '),(126,'lara','','','hugo_laraz@yahoo.com.mx',0,'3ADCEBCC2D8A6A916875683A0C80071B','hector hugo'),(127,'barrientos','','','christian_barrie@hotmail.com',0,'35AB64C66F081FA21B5F867E2D23FCA3','christian'),(128,'oliveira','','','ixos82@gmail.com',0,'79C4A2DE1220C0C82A57B630FE051BA5','ivan'),(129,'gonzales','','','gonzalezifm@hotmail.com',0,'68F87B4BB55C07B122DF2B3C18F1AE15','jose'),(130,'baez','paypal de delma rubio','','yotubendo@gmail.com',0,'44B9512A39DBD6A1F56F209269346F30','miguel'),(131,'aldana','','','aldanavelajuanjavier@gmail.com',0,'AF0B11E4A01F1F46014E63FDFCBEA694','juan javier'),(132,'ng','canadiense','','emwng@shaw.ca',0,'7243A76BFF3FDFFC5648BF3CA3D47AC1','eduard'),(133,'oosthuizen','','','prokkieinvest@gmail.com',0,'C857ED7B85CF0C6332EC8CEB46FAF1D5','jacques'),(134,'abreu','','','Karloslevit@gmail.com',0,'D5013A906C1DE5835AECD0BCA51024C3','carlos '),(135,'pruebaApellido','','','catar@gmail.com',2,'066D7E1004B66CDA69FBP1865BF92221','prueba'),(136,'pruebaApellido','','','catar@gmail.com',1,'066D7E1004B66CDA69FBP1865BF92221','prueba'),(137,'prueba2','','','bd@gmail.com',0,'066D7E1004B66CDA69FB21865AF92221','prueba'),(138,'test','','','a@a.com',1,'066D7E1004B66CDA69FB21865AF92221','test'),(140,'briongos','','','jbriongosc@gmail.com',0,'66FE204A3D0ADB36FBF73929F39D3685','javier'),(141,'castillo','','','Fx.Castiel.C@gmail.com',0,'6E484A20AC0F0C8DB2882B5E5A82A169','angel'),(142,'izquierdo','','','izkierdo93@gmail.com',0,'1D2945C930683AE506AF5C6BC9D808ED','andres'),(143,'butarro','','','fernandolb27@hotmail.com',0,'D1722C23054E91F8E6816DB287D32FF6','fernando'),(144,'urdas','','','basinasu71@gmail.com',0,'D6991E8A56E4D4CAE513EEB32E94F486','basi nasi'),(145,'munuera','','','rhino3d@hotmail.es',0,'76143523FCDCC10B3412E6CBA4FABF6C','ramon'),(146,'verdejo','','','federicoverdejo@gmail.com',0,'5227BF762915EEAC2FF9BD85F358C7C2','federico'),(147,'lemus','','','kelvintrader200@gmail.com',0,'47D41BBD4BB97118E47B5C7781A3F714','kevin'),(148,'olivera','','','ivan.xavier.oliveira@gmail.com',0,'79C4A2DE1220C0C82A57B630FE051BA5','pedro'),(149,'falta','','','luimanco87@hotmail.com',0,'CA4E60649986B88F907806E812FD08B1','luis miguel'),(150,'diaz','','','robertoleon850425@gmail.com',0,'32DEA84AC57E372374968FD3FB044098','roberto leon'),(151,'nuñez','','','Josemanuelnp24@gmail.com',0,'DA29C22613D78328A683E20568DD513B','jose'),(152,'garcia','','','diegotraderusd@gmail.com',0,'D713ECF635EC6AAC09C835FE2A50846F','diago'),(153,'gutierrez','','','eigraham.ttg@gmail.com',0,'B8AAA3350997BDAF857571B11BA9A1B3','abraham'),(154,'obrero','','','pablosobrero93@gmail.com',0,'58F0D577B7228F76717ADBFF41214A42','pablo'),(155,'castro','','','studio7tradinguprofit@gmail.com',0,'A41B4FB668CCB7DD07FACBDF30C28CDA','oscar'),(156,'cardona','','','jpcardona@gmail.com',0,'43B4211392E73E3AE44F5BB8FBDCC754','juan pablo'),(157,'ortega','','','acrobata999@gmail.com',0,'FD3F283173DC495DAEC8972DDB26EAD3','javier'),(158,'gonzales','','','davidsebastian.023@hotmail.es',0,'5B09131E2A6FAE5D6CE471A0A38B59B6','sebastian'),(159,'vargas','','','ivanvargas1026@gmail.com',0,'D9DA9A9AED6B9C970B3A73613810C399','oscar'),(160,'de la hoz','','','eduardo@delahoz.co',0,'4CE2BFD91179A18868ACC394D6EDF8A8','eduardo'),(161,'falta','','','info@futurostrade.com',0,'260C9825EC163B5DCFFD88B9E46D8C41','leonardo'),(162,'sanchez','','','davivsz@hotmail.com',0,'AEC641035F696496E1134F1C42A4F67F','david'),(163,'gutierrez','','','fergutiflo.trader@gmail.com',0,'05A4171AD4E330E5D87C3E46333DDBA5','fernando'),(164,'franco','','','leone.rfs@gmail.com',0,'75BA707532690BBE4F0697824DF89050','roberto'),(165,'polania','','','elias.polania@gmail.com',0,'F876C0E103797C01C4D66329EC53E134','elias'),(166,'lemu','','','kelvintrader200@gmail.com',2,'47D41BBD4BB97118E47B5C7781A3F714','kevin alexi'),(167,'gamero','','','faltante@mail.com',0,'falta','ruben'),(168,'lozano','','','LOZMAGO@HOTMAIL.COM',0,'415F4BFEA995B6063916218DA9A94506','matias'),(169,'cristiani','','','faltante@mail.com',0,'0F8FCA48006A85774EFE93BF2F3F6572','maximiliano'),(170,'loiz','','','ustavomoralesloiz@gmail.com',0,'BE7E2D5034BA236E0858C8399C2C1E8A','gustavo'),(171,'melgarejo','','','martaselvamelgarejoriquelmepy@gmail.com',0,'3A480C325ECD643EC68C1C6213664F7E','marta'),(172,'garcia','','','eduardo.gracia@dmro.com.mx',0,'ECE7A2468FF6C4B5F1869D0BB4F4C02E','eduardo'),(173,'henao','','','bittradinginvestor@gmail.com',0,'6828F27B74CDE73E4466D75237917B15','oscar fabian'),(174,'prieto','','','falta@mail.com',0,'falta','jose '),(175,'alzate','','','andresalzaterios@gmail.com',0,'falta','andres'),(176,'riaño','','','rianojames@gmail.com',0,'8ADAADA516FD7CDDA670AA3310E11655','james'),(177,'sanchez','','','falta',0,'falta','camilo'),(178,'forero','o dani garzon','','danifo999@gmail.com',0,'240ADAD940BF48B604BA488F476B0F9C','nestor'),(179,'carrera','','anterior:35489E3CDCEF27C0AB82072DFB33F105','JORGE.SOS135@GMAIL.COM',0,'81AB238EAD2DBBDFBFF1DAAB618C88D7','jorge'),(180,'sepulveda','hizo 2 pagos por nequi','','germansepulvedarough@gmail.com',0,'361084E58615F79981F6BCB0A534F0D3','german'),(181,'test','','','test@hotmail.com',2,'6828F27B74CDE73E4466D75237917B15','test'),(182,'solorio','','','ramonjrsp1@gmail.com',0,'E13B2BCFFF513F0B54F8C4D8B97BD22C','juan'),(183,'galicia','','','GFDaniiel@gmail.com',2,'5E154E0B91BB4C5B571CC0F01DDBBE42','luis daniel'),(184,'galicia','','','GFDaniiel@gmail.com',0,'5E154E0B91BB4C5B571CC0F01DDBBE42','luis daniel'),(185,'benitez','','','agbg.agbb@gmail.com',0,'AB09F00D2647E575A4D01C4387F44FB6','aida');
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
) ENGINE=InnoDB AUTO_INCREMENT=276 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (180,1,497,497,121,146,1),(181,1,497,397.6,122,147,1),(188,1,497,497,123,150,1),(189,1,500,500,140,151,3),(190,1,500,500,141,152,3),(191,1,500,500,142,153,3),(192,1,500,500,143,154,3),(193,1,497,497,144,155,1),(194,1,497,422.45,145,156,1),(195,1,397,240.02620000000002,142,157,35),(196,1,497,497,146,158,1),(197,1,197,120.17,147,159,40),(198,1,197,120.17,148,160,40),(199,1,192,192,149,161,25),(200,1,500,500,150,162,3),(201,1,500,500,151,163,3),(202,1,497,377.72,152,164,1),(203,1,197,149.72,152,164,40),(204,1,497,422.0027,153,165,1),(205,1,500,500,154,166,3),(206,1,497,422.45,155,167,1),(207,1,497,372.75,156,168,1),(208,1,397,297.75,156,168,35),(209,1,500,422.5,157,169,3),(210,1,397,247.0134,157,169,35),(211,1,397,350.0349,158,170,35),(212,1,397,350.0349,159,171,35),(213,1,500,423,160,172,3),(214,1,397,242.0112,160,172,35),(215,1,197,197,161,173,40),(216,1,500,500,162,174,3),(217,1,497,497,163,175,1),(218,1,500,500,164,176,3),(219,1,500,500,165,177,3),(220,1,192,182.4,138,178,30),(221,3,591,506.48699999999997,138,178,40),(222,1,288,288,138,179,15),(223,1,500,400,138,180,3),(224,1,500,375,138,181,3),(225,1,497,384,124,182,1),(226,1,288,288,125,183,15),(227,1,288,288,126,184,15),(228,1,397,247,127,185,35),(229,1,192,192,128,186,25),(230,1,497,467,129,187,1),(231,1,197,185,129,187,40),(232,1,97,91,129,187,50),(233,1,197,197,130,188,40),(234,1,197,165,131,189,40),(235,1,97,82,131,189,50),(236,1,497,497,130,190,1),(237,1,497,497,132,191,1),(238,1,497,497,133,192,1),(239,1,497,497,134,193,1),(240,1,497,422,166,194,1),(241,1,497,422,147,195,1),(242,1,197,120,122,196,40),(243,1,197,120,140,197,40),(244,1,197,120,167,198,40),(245,1,497,367,168,199,1),(246,1,247,182,168,199,36),(247,1,197,95.7085020242915,169,200,40),(248,1,497,422,127,201,1),(249,1,197,120,170,202,40),(250,1,97,97,157,203,50),(251,1,500,445,171,204,3),(252,1,247,219,171,204,36),(253,1,500,445,172,205,3),(254,1,247,219,172,205,36),(255,1,247,230,136,206,36),(256,1,247,247,138,207,36),(257,1,288,288,138,207,15),(258,1,497,342,173,208,1),(259,1,247,103,174,209,36),(260,1,197,83,175,210,40),(261,1,247,95,156,211,36),(262,1,497,462,176,212,1),(263,1,247,229,176,212,36),(264,1,247,185,177,213,36),(265,1,97,97,178,214,40),(266,1,288,288,178,215,15),(267,1,397,247,179,216,35),(268,1,497,362,180,217,1),(269,1,497,497,181,218,1),(270,1,497,397,182,219,1),(271,1,497,397,183,220,1),(272,1,497,397,184,221,1),(273,1,197,197,178,222,40),(274,1,497,445,185,223,1),(275,1,247,219,185,223,36);
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
) ENGINE=InnoDB AUTO_INCREMENT=224 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (146,0,'2021-11-17',497,121,1,3),(147,0,'2021-11-28',397.6,122,1,3),(150,0,'2021-12-11',497,123,1,3),(151,0,'2022-11-14',500,140,3,4),(152,0,'2021-11-14',500,141,3,4),(153,0,'2021-12-02',500,142,3,4),(154,0,'2021-12-18',500,143,3,4),(155,0,'2022-01-07',497,144,3,3),(156,0,'2022-02-28',422.45,145,3,3),(157,0,'2022-03-04',240.02620000000002,142,3,3),(158,0,'2022-03-04',497,146,3,3),(159,0,'2022-03-08',120.17,147,3,3),(160,0,'2022-03-09',120.17,148,3,3),(161,0,'2022-03-12',192,149,3,3),(162,0,'2022-03-20',500,150,3,4),(163,0,'2022-04-01',500,151,3,4),(164,0,'2022-04-01',527.44,152,3,3),(165,0,'2022-04-11',422.0027,153,3,3),(166,0,'2022-05-04',500,154,3,4),(167,0,'2022-06-17',422.45,155,3,3),(168,0,'2022-06-24',670.5,156,3,4),(169,0,'2022-07-07',669.5134,157,3,4),(170,0,'2022-07-11',350.0349,158,3,4),(171,0,'2022-07-11',350.0349,159,3,4),(172,0,'2022-07-14',665.0112,160,3,4),(173,0,'2022-08-20',197,161,3,3),(174,0,'2022-08-08',500,162,3,4),(175,0,'2022-08-31',497,163,3,3),(176,0,'2022-09-01',500,164,3,4),(177,0,'2022-11-10',500,165,3,4),(178,2,'2022-11-15',688.887,138,2,4),(179,2,'2022-11-08',288,138,2,3),(180,2,'2022-12-13',400,138,8,3),(181,2,'2022-12-14',375,138,3,3),(182,0,'2021-12-20',384,124,1,3),(183,0,'2022-01-24',288,125,1,3),(184,0,'2022-03-31',288,126,1,3),(185,0,'2022-05-26',247,127,1,3),(186,0,'2022-05-30',192,128,1,3),(187,0,'2022-07-17',743,129,1,3),(188,0,'2022-08-15',197,130,1,3),(189,0,'2022-09-04',247,131,1,3),(190,0,'2022-09-08',497,130,1,3),(191,0,'2022-09-29',497,132,1,3),(192,0,'2022-09-30',497,133,1,3),(193,0,'2022-10-13',497,134,1,3),(194,0,'2022-02-12',422,166,2,3),(195,0,'2022-02-12',422,147,2,3),(196,0,'2022-03-04',120,122,2,3),(197,0,'2022-03-08',120,140,2,3),(198,0,'2022-03-09',120,167,2,3),(199,0,'2022-03-17',549,168,2,3),(200,0,'2022-03-29',95.7085020242915,169,2,3),(201,0,'2022-04-04',422,127,2,3),(202,0,'2022-05-21',120,170,2,3),(203,0,'2022-07-21',97,157,2,3),(204,0,'2022-08-25',664,171,2,4),(205,0,'2022-08-31',664,172,2,4),(206,1,'2022-12-03',230,136,8,3),(207,1,'2022-12-07',535,138,2,3),(208,0,'2022-02-28',342,173,4,3),(209,0,'2022-03-10',103,174,4,3),(210,0,'2022-03-16',83,175,4,3),(211,0,'2022-03-17',95,156,4,3),(212,0,'2022-07-20',691,176,4,3),(213,0,'2022-08-22',185,177,4,3),(214,0,'2022-11-28',197,178,3,3),(215,0,'2022-12-02',288,178,4,3),(216,0,'2022-11-27',247,179,1,3),(217,0,'2023-01-05',362,180,4,3),(218,0,'2023-04-19',497,181,1,3),(219,0,'2022-11-24',397,182,3,3),(220,0,'2022-11-26',397,183,3,4),(221,0,'2022-11-26',397,184,3,3),(222,0,'2022-11-28',197,178,3,3),(223,0,'2023-01-09',664,185,2,4);
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
) ENGINE=InnoDB AUTO_INCREMENT=181 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (32,121,0,0,0,146,'2021-11-17','2021-11-17','paypal OTM',500,469.8,146,'emir matos'),(33,122,0,0,0,147,'2021-11-28','2021-11-28','paypal OTM',397.6,375.8296,147,'jose antonio bernal'),(36,123,0,0,0,150,'2021-12-11','2021-12-11','paypal OTM',497,469.86199999999997,150,'ernesto diaz'),(37,140,0,0,0,151,'2022-01-01','2021-11-14','teachable',100,91.1,151,'javier briongos'),(38,140,0,0,0,151,'2022-02-01','2021-12-14','teachable',100,91.1,151,'javier briongos'),(39,140,0,0,0,151,'2022-03-01','2022-01-14','teachable',100,91.1,151,'javier briongos'),(40,140,0,0,0,151,'2022-04-01','2022-02-14','teachable',100,91.1,151,'javier briongos'),(41,140,0,0,0,151,'2022-05-01','2022-03-14','teachable',100,91.1,151,'javier briongos'),(42,141,0,0,0,152,'2022-01-01','2021-11-14','teachable',100,91.1,152,'angel castillo'),(43,141,0,0,0,152,'2022-02-01','2021-12-14','teachable',100,91.1,152,'angel castillo'),(44,141,0,0,0,152,'2022-03-01','2022-01-14','teachable',100,91.1,152,'angel castillo'),(45,141,0,0,0,152,'2022-04-01','2022-02-14','teachable',100,91.1,152,'angel castillo'),(46,141,0,0,0,152,'2022-05-01','2022-03-14','teachable',100,91.1,152,'angel castillo'),(47,142,0,0,0,153,'2022-02-01','2021-12-02','teachable',100,91.1,153,'andres izquierdo'),(48,142,0,0,0,153,'2022-03-01','2022-01-02','teachable',100,91.1,153,'andres izquierdo'),(49,142,0,0,0,153,'2022-04-01','2022-02-02','teachable',100,91.1,153,'andres izquierdo'),(50,142,0,0,0,153,'2022-05-01','2022-03-02','teachable',100,91.1,153,'andres izquierdo'),(51,142,0,0,0,153,'2022-06-01','2022-04-02','teachable',100,91.1,153,'andres izquierdo'),(52,143,0,0,0,154,'2022-02-01','2021-12-18','teachable',100,91.1,154,'fernando butarro'),(53,143,0,0,0,154,'2022-03-01','2022-01-18','teachable',100,91.1,154,'fernando butarro'),(54,143,0,0,0,154,'2022-04-01','2022-02-18','teachable',100,91.1,154,'fernando butarro'),(55,143,0,0,0,154,'2022-05-01','2022-03-18','teachable',100,91.1,154,'fernando butarro'),(56,143,0,0,0,154,'2022-06-01','2022-04-18','teachable',100,91.1,154,'fernando butarro'),(57,144,0,0,0,155,'2022-01-07','2022-01-07','teachable',497,453.958,155,'basi nasi urdas'),(58,145,0,0,0,156,'2022-02-28','2022-02-28','teachable',422.45,385.8193,156,'ramon munuera'),(59,142,0,0,0,157,'2022-03-04','2022-03-04','teachable',240.02620000000002,219.0839468,157,'andres izquierdo'),(60,146,0,0,0,158,'2022-03-04','2022-03-04','teachable',497,453.958,158,'federico verdejo'),(61,147,0,0,0,159,'2022-03-08','2022-03-08','teachable',120.17,109.53538,159,'kevin lemus'),(62,148,0,0,0,160,'2022-03-09','2022-03-09','teachable',120.17,109.53538,160,'pedro olivera'),(63,149,0,0,0,161,'2022-03-12','2022-03-12','teachable',192,175.188,161,'luis miguel falta'),(64,150,0,0,0,162,'2022-05-01','2022-03-20','teachable',100,91.1,162,'roberto leon diaz'),(65,150,0,0,0,162,'2022-06-01','2022-04-20','teachable',100,91.1,162,'roberto leon diaz'),(66,150,0,0,0,162,'2022-07-01','2022-05-20','teachable',100,91.1,162,'roberto leon diaz'),(67,150,0,0,0,162,'2022-08-01','2022-06-20','teachable',100,91.1,162,'roberto leon diaz'),(68,150,0,0,0,162,'2022-09-01','2022-07-20','teachable',100,91.1,162,'roberto leon diaz'),(69,151,0,0,0,163,'2022-06-01','2022-04-01','teachable',100,91.1,163,'jose nuñez'),(70,151,0,0,0,163,'2022-07-01','2022-05-01','teachable',100,91.1,163,'jose nuñez'),(71,151,0,0,0,163,'2022-08-01','2022-06-01','teachable',100,91.1,163,'jose nuñez'),(72,151,0,0,0,163,'2022-09-01','2022-07-01','teachable',100,91.1,163,'jose nuñez'),(73,151,0,0,0,163,'2022-10-01','2022-08-01','teachable',100,91.1,163,'jose nuñez'),(74,152,0,0,0,164,'2022-04-01','2022-04-01','teachable',527.44,481.78016,164,'diago garcia'),(75,153,0,0,0,165,'2022-04-11','2022-04-11','teachable',422.0027,385.4104678,165,'abraham gutierrez'),(76,154,0,0,0,166,'2022-07-01','2022-05-04','teachable',100,91.1,166,'pablo obrero'),(77,154,0,0,0,166,'2022-08-01','2022-06-04','teachable',100,91.1,166,'pablo obrero'),(78,154,0,0,0,166,'2022-09-01','2022-07-04','teachable',100,91.1,166,'pablo obrero'),(79,154,0,0,0,166,'2022-10-01','2022-08-04','teachable',100,91.1,166,'pablo obrero'),(80,154,0,0,0,166,'2022-11-01','2022-09-04','teachable',100,91.1,166,'pablo obrero'),(81,155,0,0,0,167,'2022-06-17','2022-06-17','teachable',422.45,385.8193,167,'oscar castro'),(82,156,0,0,0,168,'2022-08-01','2022-06-24','teachable',223.5,203.97899999999998,168,'juan pablo cardona'),(83,156,0,0,0,168,'2022-09-01','2022-07-24','teachable',223.5,203.97899999999998,168,'juan pablo cardona'),(84,156,0,0,0,168,'2022-10-01','2022-08-24','teachable',223.5,203.97899999999998,168,'juan pablo cardona'),(85,157,0,0,0,169,'2022-09-01','2022-07-07','teachable',133.90268,122.08704952,169,'javier ortega'),(86,157,0,0,0,169,'2022-10-01','2022-08-07','teachable',133.90268,122.08704952,169,'javier ortega'),(87,157,0,0,0,169,'2022-11-01','2022-09-07','teachable',133.90268,122.08704952,169,'javier ortega'),(88,157,0,0,0,169,'2023-02-01','2022-12-07','teachable',133.90268,122.08704952,169,'javier ortega'),(89,157,0,0,0,169,'2023-03-01','2023-01-07','teachable',133.90268,122.08704952,169,'javier ortega'),(90,158,0,0,0,170,'2022-09-01','2022-07-11','teachable',70.00698,63.68637972,170,'sebastian gonzales'),(91,158,0,0,0,170,'2022-10-01','2022-08-11','teachable',70.00698,63.68637972,170,'sebastian gonzales'),(92,158,0,0,0,170,'2022-11-01','2022-09-11','teachable',70.00698,63.68637972,170,'sebastian gonzales'),(93,158,0,0,0,170,'2022-12-01','2022-10-11','teachable',70.00698,63.68637972,170,'sebastian gonzales'),(94,158,0,0,0,170,'2023-01-01','2022-11-11','teachable',70.00698,63.68637972,170,'sebastian gonzales'),(95,159,0,0,0,171,'2022-09-01','2022-07-11','teachable',70.00698,63.68637972,171,'oscar vargas'),(96,159,0,0,0,171,'2022-10-01','2022-08-11','teachable',70.00698,63.68637972,171,'oscar vargas'),(97,159,0,0,0,171,'2022-11-01','2022-09-11','teachable',70.00698,63.68637972,171,'oscar vargas'),(98,159,1,0,0,171,'2022-12-01','2022-10-11','teachable',70.00698,63.68637972,171,'oscar vargas'),(99,159,1,0,0,171,'2023-01-01','2022-11-11','teachable',70.00698,63.68637972,171,'oscar vargas'),(100,160,0,0,0,172,'2022-09-01','2022-07-14','teachable',133.00224,121.26404736,172,'eduardo de la hoz'),(101,160,0,0,0,172,'2022-10-01','2022-08-14','teachable',133.00224,121.26404736,172,'eduardo de la hoz'),(102,160,0,0,0,172,'2022-11-01','2022-09-14','teachable',133.00224,121.26404736,172,'eduardo de la hoz'),(103,160,0,0,0,172,'2022-12-01','2022-10-14','teachable',133.00224,121.26404736,172,'eduardo de la hoz'),(104,160,0,0,0,172,'2023-01-01','2022-11-14','teachable',133.00224,121.26404736,172,'eduardo de la hoz'),(105,161,0,0,0,173,'2022-08-20','2022-08-20','teachable',197,179.75799999999998,173,'leonardo falta'),(106,162,0,0,0,174,'2022-10-01','2022-08-08','teachable',100,91.1,174,'david sanchez'),(107,162,0,0,0,174,'2022-11-01','2022-09-08','teachable',100,91.1,174,'david sanchez'),(108,162,0,0,0,174,'2022-12-01','2022-10-08','teachable',100,91.1,174,'david sanchez'),(109,162,0,0,0,174,'2023-01-01','2022-11-08','teachable',100,91.1,174,'david sanchez'),(110,162,0,0,0,174,'2023-02-01','2022-12-08','teachable',100,91.1,174,'david sanchez'),(111,163,0,0,0,175,'2022-08-31','2022-08-31','teachable',497,469.86199999999997,175,'fernando gutierrez'),(112,164,0,0,0,176,'2022-11-01','2022-09-01','teachable',100,91.1,176,'roberto franco'),(113,164,0,0,0,176,'2022-12-01','2022-10-01','teachable',100,91.1,176,'roberto franco'),(114,164,0,0,0,176,'2023-01-01','2022-11-01','teachable',100,91.1,176,'roberto franco'),(115,164,0,0,0,176,'2023-02-01','2022-12-01','teachable',100,91.1,176,'roberto franco'),(116,164,0,0,0,176,'2023-03-01','2023-01-01','teachable',100,91.1,176,'roberto franco'),(117,165,0,0,0,177,'2023-01-01','2022-11-10','teachable',100,91.1,177,'elias polania'),(118,165,0,0,0,177,'2023-02-01','2022-12-10','teachable',100,91.1,177,'elias polania'),(119,165,0,0,0,177,'2023-03-01','2023-01-10','teachable',100,91.1,177,'elias polania'),(120,165,0,0,0,177,'2023-04-01','2023-02-10','teachable',100,91.1,177,'elias polania'),(121,165,0,0,0,177,'2023-05-01','2023-03-10','teachable',100,91.1,177,'elias polania'),(123,138,0,0,0,178,'2023-01-01','2022-11-15','Paypal cristian',344.4435,344.4435,178,'test test'),(124,138,0,0,0,178,'2023-02-01','2022-12-15','Paypal cristian',344.4435,344.4435,178,'test test'),(125,138,0,0,0,179,'2022-11-08','2022-11-08','Paypal cristian',288,272.14799999999997,179,'test test'),(126,138,0,0,0,180,'2022-12-13','2022-12-13','nequi',400,400,180,'test test'),(127,138,0,0,0,181,'2022-12-14','2022-12-14','teachable',375,342.45,181,'test test'),(128,124,0,0,0,182,'2021-12-20','2021-12-20','paypal OTM',384,362.964,182,'xavier pareja'),(129,125,0,0,0,183,'2022-01-24','2022-01-24','paypal OTM',288,272.14799999999997,183,'mauro  casado'),(130,126,0,0,0,184,'2022-03-31','2022-03-31','paypal OTM',288,272.14799999999997,184,'hector hugo lara'),(131,127,0,0,0,185,'2022-05-26','2022-05-26','paypal OTM',247,233.362,185,'christian barrientos'),(132,128,0,0,0,186,'2022-05-30','2022-05-30','paypal OTM',192,181.332,186,'ivan oliveira'),(133,129,0,0,0,187,'2022-07-17','2022-07-17','paypal OTM',743,702.5780000000001,187,'jose gonzales'),(134,130,0,0,0,188,'2022-08-15','2022-08-15','paypal OTM',197,186.06199999999998,188,'miguel baez'),(135,131,0,0,0,189,'2022-09-04','2022-09-04','paypal OTM',247,233.362,189,'juan javier aldana'),(136,130,0,0,0,190,'2022-09-08','2022-09-08','paypal OTM',497,469.86199999999997,190,'miguel baez'),(137,132,0,0,0,191,'2022-09-29','2022-09-29','paypal OTM',497,469.86199999999997,191,'eduard ng'),(138,133,0,0,0,192,'2022-09-30','2022-09-30','paypal OTM',497,469.86199999999997,192,'Jacques Oosthuizen'),(139,134,0,0,0,193,'2022-10-13','2022-10-13','paypal OTM',497,469.86199999999997,193,'carlos  abreu'),(140,166,0,0,0,194,'2022-02-12','2022-02-12','Paypal cristian',422,398.912,194,'kevin alexi lemu'),(141,147,0,0,0,195,'2022-02-12','2022-02-12','Paypal cristian',422,398.912,195,'kevin lemus'),(142,122,0,0,0,196,'2022-03-04','2022-03-04','Paypal cristian',120,113.22,196,'jose antonio bernal'),(143,140,0,0,0,197,'2022-03-08','2022-03-08','Paypal cristian',120,113.22,197,'javier briongos'),(144,167,0,0,0,198,'2022-03-09','2022-03-09','Paypal cristian',120,113.22,198,'ruben gamero'),(145,168,0,0,0,199,'2022-03-17','2022-03-17','Paypal cristian',549,519.0540000000001,199,'matias lozano'),(146,169,0,0,0,200,'2022-03-29','2022-03-29','Paypal cristian',95.7085020242915,90.24024291497976,200,'maximiliano cristiani'),(147,127,0,0,0,201,'2022-04-04','2022-04-04','Paypal cristian',422,398.912,201,'christian barrientos'),(148,170,0,0,0,202,'2022-05-21','2022-05-21','Paypal cristian',120,113.22,202,'gust loiz'),(149,157,0,0,0,203,'2022-07-21','2022-07-21','Paypal cristian',97,91.462,203,'javier ortega'),(150,171,0,0,0,204,'2022-08-25','2022-08-25','Paypal cristian',132.8,125.32880000000002,204,'marta melgarejo'),(151,171,0,0,0,204,'2022-09-25','2022-09-25','Paypal cristian',132.8,125.32880000000002,204,'marta melgarejo'),(152,171,0,0,0,204,'2022-10-25','2022-10-25','Paypal cristian',132.8,125.32880000000002,204,'marta melgarejo'),(153,171,0,0,0,204,'2022-12-01','2022-11-30','Paypal cristian',132.8,125.32880000000002,204,'marta melgarejo'),(154,171,0,0,0,204,'2023-01-01','2022-12-25','Paypal cristian',132.8,125.32880000000002,204,'marta melgarejo'),(155,172,0,0,0,205,'2022-08-31','2022-08-31','Paypal cristian',132.8,125.32880000000002,205,'eduardo garcia'),(156,172,0,0,0,205,'2022-09-30','2022-09-30','Paypal cristian',132.8,125.32880000000002,205,'eduardo garcia'),(157,172,0,0,0,205,'2022-10-31','2022-10-31','Paypal cristian',132.8,125.32880000000002,205,'eduardo garcia'),(158,172,0,0,0,205,'2022-11-30','2022-11-30','Paypal cristian',132.8,125.32880000000002,205,'eduardo garcia'),(159,172,0,0,0,205,'2022-12-31','2022-12-31','Paypal cristian',132.8,125.32880000000002,205,'eduardo garcia'),(160,136,0,0,0,206,'2022-12-03','2022-12-03','nequi',230,230,206,'prueba pruebaApellido'),(161,138,0,0,0,207,'2022-12-07','2022-12-07','Paypal cristian',535,505.81,207,'test test'),(162,173,0,0,0,208,'2022-02-28','2022-02-28','nequi y otros',342,342,208,'oscar fabian henao'),(163,174,0,0,0,209,'2022-03-10','2022-03-10','nequi y otros',103,103,209,'jose  prieto'),(164,175,0,0,0,210,'2022-03-16','2022-03-16','nequi y otros',83,83,210,'andres alzate'),(165,156,0,0,0,211,'2022-03-17','2022-03-17','nequi y otros',95,95,211,'juan pablo cardona'),(166,176,0,0,0,212,'2022-07-20','2022-07-20','nequi y otros',691,691,212,'james riaño'),(167,177,0,0,0,213,'2022-08-22','2022-08-22','nequi y otros',185,185,213,'camilo sanchez'),(168,178,0,0,0,214,'2023-01-01','2022-11-28','teachable',97,84.4,214,'nestor forero'),(169,178,0,0,0,215,'2022-12-02','2022-12-02','nequi y otros',288,288,215,'nestor forero'),(170,179,0,0,0,216,'2022-12-01','2022-11-27','paypal OTM',247,233.362,216,'jorge carrera'),(171,180,0,0,0,217,'2023-01-05','2022-06-05','nequi y otros',362,362,217,'german sepulveda'),(172,181,0,0,0,218,'2023-04-19','2023-04-19','paypal OTM',497,469.86199999999997,218,'test test'),(173,182,0,0,0,219,'2023-01-01','2022-11-24','teachable',397,362.558,219,'juan solorio'),(174,184,0,0,0,221,'2023-01-01','2022-11-26','teachable',397,362.558,221,'luis daniel galicia'),(175,178,0,0,0,222,'2023-01-01','2022-11-28','teachable',197,179.75799999999998,222,'nestor forero'),(176,185,0,0,0,223,'2023-03-01','2023-01-09','Paypal cristian',132.8,125.32880000000002,223,'aida benitez'),(177,185,0,0,0,223,'2023-04-01','2023-02-09','Paypal cristian',132.8,125.32880000000002,223,'aida benitez'),(178,185,0,0,0,223,'2023-05-01','2023-03-09','Paypal cristian',132.8,125.32880000000002,223,'aida benitez'),(179,185,0,0,0,223,'2023-06-01','2023-04-09','Paypal cristian',132.8,125.32880000000002,223,'aida benitez'),(180,185,0,0,0,223,'2023-07-01','2023-05-09','Paypal cristian',132.8,125.32880000000002,223,'aida benitez');
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
INSERT INTO `producto` VALUES (1,'OTM pack unico',497),(3,'OTM Pack cuotas',500),(15,'OTM Swing',288),(20,'OTM profile',288),(25,'OTM micro',192),(30,'OTM cumulated',192),(35,'Logic pack',397),(36,'Logic pack Of+A',247),(40,'Logic Order flow',197),(45,'Logic profile',197),(50,'Logic analytics',97);
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
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'$argon2id$v=19$m=1024,t=1,p=1$CAPPcRGfp3054Dhv9t8gug$U7Kexadd21NXsrPdMvDadX2mmM5sBAnNnmgounGYVT4','ADMIN','pepe'),(14,'$argon2id$v=19$m=1024,t=1,p=1$8xszoRqAvonCOHc488Dxxg$h1y62DymcUyr00ajUpIdvAwIRQzywXexBeLZhoAUQuA','USER','pepe'),(15,'$argon2id$v=19$m=1024,t=1,p=1$G8EY65wQvsBotcAA+QnH2Q$PtuSWcheaWzLxcSfpIBjfpPQAuQokx/tcFatbg7KwmA','USER','homero'),(19,'$argon2id$v=19$m=1024,t=1,p=1$KOTG08lAZt52RI4vPRhdIQ$jSXWW6IrgOh+Y2ShwoIop9bYuMpbOMlT68/QhZl4sPU','USER','cristianccuellar@gmail.com'),(20,'$argon2id$v=19$m=1024,t=1,p=1$0W85NyFt/XPVxDgQhcCtfg$2GPtbAMHYAl66ShMimhQcMnsxInqxukWT0mqY65OXUk','USER','gabytleon@gmail.com');
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

-- Dump completed on 2023-01-10 19:21:07
