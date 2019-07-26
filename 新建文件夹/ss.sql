/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.5.28-enterprise-commercial-advanced-log : Database - twice
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`twice` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `twice`;

/*Table structure for table `dept` */

DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `tb_deptno` varchar(20) NOT NULL,
  `tb_deptname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`tb_deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dept` */

insert  into `dept`(`tb_deptno`,`tb_deptname`) values ('10001','生产部'),('10002','采购部'),('10003','财务部'),('10004','运输部'),('10005','研发部'),('10006','直销部'),('10007','综合管理部'),('10008','服务中心');

/*Table structure for table `person` */

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `tb_personno` varchar(20) NOT NULL,
  `tb_personname` varchar(20) DEFAULT NULL,
  `tb_deptno` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`tb_personno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `person` */

insert  into `person`(`tb_personno`,`tb_personname`,`tb_deptno`) values ('1','小黑','10001'),('2','张小飞','10002');

/*Table structure for table `stock_order` */

DROP TABLE IF EXISTS `stock_order`;

CREATE TABLE `stock_order` (
  `tb_billno` varchar(20) NOT NULL,
  `tb_billdate` date DEFAULT NULL,
  `tb_customer` varchar(20) DEFAULT NULL,
  `tb_customer_address` varchar(20) DEFAULT NULL,
  `tb_buyer` varchar(20) DEFAULT NULL,
  `tb_maker` varchar(20) DEFAULT NULL,
  `tb_deptname` varchar(20) DEFAULT NULL,
  `tb_permitter` varchar(20) DEFAULT NULL,
  `tb_permit_date` date DEFAULT NULL,
  `tb_creat_time` date DEFAULT NULL,
  `tb_remark` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`tb_billno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stock_order` */

insert  into `stock_order`(`tb_billno`,`tb_billdate`,`tb_customer`,`tb_customer_address`,`tb_buyer`,`tb_maker`,`tb_deptname`,`tb_permitter`,`tb_permit_date`,`tb_creat_time`,`tb_remark`) values ('20190725001','2019-07-25','北大青鸟','株洲键坤','小黑','张小飞','管理部','刘小贝','2016-01-26','2016-01-26','无备注'),('20190725002','2019-07-25','清华黑鸟','北京天马','小黄','关小羽','生产部','刘小贝','2016-01-26','2016-01-26','无备注');

/*Table structure for table `stockorder_detail` */

DROP TABLE IF EXISTS `stockorder_detail`;

CREATE TABLE `stockorder_detail` (
  `tb_billno` varchar(20) DEFAULT NULL,
  `tb_line_id` int(11) NOT NULL AUTO_INCREMENT,
  `tb_prodname` varchar(50) DEFAULT NULL,
  `tb_amount` double DEFAULT NULL,
  `tb_price` double DEFAULT NULL,
  `tb_money_amt` double DEFAULT NULL,
  `tb_ispresent` int(11) DEFAULT NULL,
  PRIMARY KEY (`tb_line_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `stockorder_detail` */

insert  into `stockorder_detail`(`tb_billno`,`tb_line_id`,`tb_prodname`,`tb_amount`,`tb_price`,`tb_money_amt`,`tb_ispresent`) values ('20190725001',1,'早餐',200,7,1400,0),('20190725001',2,'午餐',250,12,3000,0),('20190725002',3,'ACCPS1课程',100,10000,1000000,1),('20190725002',4,'ACCPS2课程',100,12000,1200000,1),('20190725002',5,'ACCPY2课程',100,15000,1500000,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
