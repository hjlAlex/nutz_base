/*
SQLyog v10.2 
MySQL - 5.5.24-CDB-3.0.0-log : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tea`;

/*Table structure for table `module` */

CREATE TABLE `module` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `str_flag` varchar(50) NOT NULL,
  `page_id` bigint(128) NOT NULL,
  `type` bigint(128) NOT NULL,
  `relate_ids` varchar(250) NOT NULL,
  `remark` varchar(250) DEFAULT NULL,
  `ext1` varchar(250) DEFAULT NULL,
  `ext2` varchar(250) DEFAULT NULL,
  `ext3` varchar(250) DEFAULT NULL,
  `ext4` varchar(250) DEFAULT NULL,
  `ext5` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `str_flag` (`str_flag`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `module` */

insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (7,'index_mid_news',1,2,'4','ext1为首页贡茶介绍的左部顶测标题','贡茶','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (8,'index_mid_pic',1,1,'22,23,24,25','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (9,'index_mid_shuff',1,1,'27,28,29,38','ext1位标题简介','贡茶饮品','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (10,'index_mid_buttom_pic',1,1,'30,31,32,33,34,35','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (11,'index_buttom_right_pic',1,1,'36,37','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (12,'index_buttom_right_news',1,2,'6,7','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (13,'index_buttom_left',1,2,'7,8,9,10,11,12','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (14,'index_mid_buttom_news',1,2,'5','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (15,'common_nav',7,3,'7,8,9,10,11,12','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (16,'common_shuff',7,1,'19,20,21','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (17,'common_friend',7,3,'13','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (18,'common_logo',7,1,'18','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (19,'about_mid_rg_pic',6,1,'39','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (20,'about_news',6,2,'13','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (21,'join_mid_rg_pic',8,1,'40','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (22,'join_mid_news',8,2,'14,15,16,17,18','','','','','','');
insert  into `module`(`id`,`str_flag`,`page_id`,`type`,`relate_ids`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (23,'join_mid_news_pic',8,1,'41,42,43,44,45','','','','','','');

/*Table structure for table `navigation` */

CREATE TABLE `navigation` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `link_url` varchar(250) NOT NULL,
  `name` varchar(50) NOT NULL,
  `remark` varchar(250) DEFAULT NULL,
  `ext1` varchar(250) DEFAULT NULL,
  `ext2` varchar(250) DEFAULT NULL,
  `ext3` varchar(250) DEFAULT NULL,
  `ext4` varchar(250) DEFAULT NULL,
  `ext5` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `navigation` */

insert  into `navigation`(`id`,`link_url`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (7,'/index','首页','ext5为排序','贡茶','','','','1');
insert  into `navigation`(`id`,`link_url`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (8,'/about','关于贡茶','ext5为排序','About royaltea','','','','2');
insert  into `navigation`(`id`,`link_url`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (9,'/join','加盟介绍','ext5为排序','Join in','','','','3');
insert  into `navigation`(`id`,`link_url`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (10,'/tea','奶茶饮品','ext5为排序','Tea beverage','','','','4');
insert  into `navigation`(`id`,`link_url`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (11,'/news','新闻中心','ext5为排序','Royaltea new','','','','5');
insert  into `navigation`(`id`,`link_url`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (12,'/join_apply','申请加盟','ext5为排序','Joining','','','','6');
insert  into `navigation`(`id`,`link_url`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (13,'/xxx','奶茶店加盟','','','','','','');

/*Table structure for table `news` */

CREATE TABLE `news` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `content` varchar(5000) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  `remark` varchar(250) DEFAULT NULL,
  `ext1` varchar(250) DEFAULT NULL,
  `ext2` varchar(250) DEFAULT NULL,
  `ext3` varchar(250) DEFAULT NULL,
  `ext4` varchar(250) DEFAULT NULL,
  `ext5` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `news` */

insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (4,'贡茶介绍','<p>\r\n	<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">&nbsp; &nbsp; &nbsp; &nbsp;目前市面上的茶饮料店多如过江之鲫，但品质却良秀不齐， 想要喝一杯天然、健康而且高品质的茶饮料， 实在是可遇而不可求； 因此，royaltea皇茶特别从时尚茶饮发源地台湾引进皇室御品茗茶以飨喜爱茶饮料的朋友。</span> \r\n</p>\r\n<p>\r\n	<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\"><span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">&nbsp; &nbsp; &nbsp; royaltea皇茶为自己订下最严苛的要求，坚持以贡品茶饮的最高标准来 维持最高的茶饮品质，调製茶饮坚持使用百分之百的纯品好茶原料，挑选茶叶原料 更以道地台湾茶为首选，绝不会为降低成本而牺牲了品质。除了维持本身茶饮品高品质外， 用最低成本，为加盟业主牟取最大的利润，让投资能在最短时间内回收！</span></span> \r\n</p>\r\n<p>\r\n	<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\"><span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">&nbsp; &nbsp; &nbsp; 皇茶是一个以白领阶层、年轻势力为主流消费群体，以休闲、饮品为主打产品的特许 经营连锁机构，本着“让文化深入产品，以产品引领文化”的产品理念，至力于打造全新的饮品 形态，将传统奶茶与健康茶文化溶合一体，以优质进口原材料为消费者提供更健康、更具活力的 特色饮品。皇茶加盟店面现以覆盖广东珠三角部分主要城市，特别在东莞、江门、中山地区领先同 行的同时并在当地拥有非常大的影响力。</span><br />\r\n</span> \r\n</p>','2015-12-19 18:43:08','2015-12-19 18:45:46','','','','','','');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (5,'加盟介绍 Join Advantage','<p class=\"lay-b\" style=\"font-family:\'microsoft yahei\';font-size:14px;vertical-align:baseline;text-align:center;\">\r\n	皇茶为加盟商提供经营技术，辅助选择营业场合和区域，以营业合同的形式，授予加盟店的规定区域内的经销权或营业权。\r\n</p>','2015-12-19 19:04:03','2015-12-19 19:04:03','','','','','','');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (6,'开奶茶店四大黄金地段','<span style=\"font-family:\'microsoft yahei\';line-height:17px;background-color:#FFFFFF;\">目前市面上的茶饮料店多如过江之鲫，但品质却良秀不齐，想要喝一杯天然、健康而且高品 质的茶饮料；因此，royaltea皇茶特别从时尚茶饮发源地台湾引进皇 室御品茗茶以飨喜爱茶饮料的朋友。</span>','2015-12-19 19:22:14','2015-12-19 19:22:14','','','','','','');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (7,'开奶茶店四大黄金地段','<span style=\"font-family:\'microsoft yahei\';line-height:17px;background-color:#FFFFFF;\">目前市面上的茶饮料店多如过江之鲫，但品质却良秀不齐，想要喝一杯天然、健康而且高品 质的茶饮料；因此，royaltea皇茶特别从时尚茶饮发源地台湾引进皇 室御品茗茶以飨喜爱茶饮料的朋友。</span>','2015-12-19 19:22:56','2015-12-20 11:31:04','ext5为排序','','','','','2');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (8,'开皇茶加盟店需要哪些手续1','<span style=\"color:#222222;font-family:Consolas, \'Lucida Console\', monospace;line-height:normal;background-color:#FFFFFF;\">开皇茶加盟店需要哪些手续1</span>','2015-12-19 19:26:42','2015-12-20 11:30:34','ext5为排序','','','','','1');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (9,'皇茶怎么加盟','<span style=\"color:#222222;font-family:Consolas, \'Lucida Console\', monospace;line-height:normal;background-color:#FFFFFF;\">皇茶怎么加盟</span>','2015-12-19 19:27:14','2015-12-20 11:31:18','ext5为排序','','','','','3');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (10,'开皇茶加盟店需要哪些手续2','开皇茶加盟店需要哪些手续2','2015-12-19 19:27:49','2015-12-20 11:31:35','ext5为排序','','','','','4');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (11,'开皇茶加盟店需要哪些手续3','开皇茶加盟店需要哪些手续3','2015-12-19 19:27:59','2015-12-20 11:31:47','ext5为排序','','','','','5');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (12,'开皇茶加盟店需要哪些手续4','开皇茶加盟店需要哪些手续4','2015-12-19 19:28:13','2015-12-20 11:31:58','ext5为排序','','','','','6');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (13,'关于贡茶','<p>\r\n	<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">&nbsp; &nbsp; &nbsp; 皇茶饮品有限公司成立于2006年，皇茶royaltea是广州茶饮品行业中知名品牌之一，对茶饮品的经营和管理有着非常丰富的经验, 目前公司长期以来动力于奶茶店加盟以及奶茶店的管理，旗下品牌发展至全国已近百家。</span> \r\n</p>\r\n<p>\r\n	<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">&nbsp; &nbsp; &nbsp;&nbsp;<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">茶饮料是全球公认的保健饮品，royaltea皇茶加盟在提倡健康、品味、时尚的基础上，结合中华传统的养生文化，将健康、养生观念融入平常加盟奶茶店的茶饮中，在塑造健康、品味、 时尚形象的同时，更注重奶茶加盟茶饮料的养生功效，迎合了各类消费人群的口味以及保健观念。</span></span> \r\n</p>\r\n<p style=\"text-align:center;\">\r\n	<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\"><img src=\"/nutz_base/upload/image/1450597113528.png\" alt=\"\" /></span> \r\n</p>\r\n<p style=\"text-align:left;\">\r\n	<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\"> &nbsp; &nbsp; &nbsp;&nbsp;<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">皇茶是一家以奶茶、咖啡为主的加盟连锁店，是全国各地奶茶爱好者最喜爱的茶饮品。我们坚持采用新鲜，健康的食材和上等咖啡豆为原料， 精心制作每一杯饮品，做出适合当地顾客口感的时尚风味饮品。</span></span> \r\n</p>\r\n<p style=\"text-align:left;\">\r\n	<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">&nbsp; &nbsp; &nbsp; <span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">皇茶加盟店面现以覆盖广东珠三角部分主要城市，特别在东莞、江门、中山地区领先 同行的同时并在当地拥有非常大的影响力。皇茶加盟官网：www.huangchajm.com</span><br />\r\n</span> \r\n</p>','2015-12-20 15:40:55','2015-12-20 15:40:55','','','','','','');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (14,'贡茶加盟费多少钱1','<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">皇茶加盟费多少钱？这是很多想加盟皇茶的朋友们想要知道的。下面小编就具体分析一下！皇茶加盟费多少钱？这是很多想加盟 皇茶的朋友们想要知道的。下面小编就具体分析一下！皇茶加盟费多少钱？这是很多想加盟皇茶的朋友们想要知道的。下面小编就具体分析一下！</span>','2015-12-20 20:23:58','2015-12-20 20:23:58','','','','','','');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (15,'贡茶加盟费多少钱2','<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">皇茶加盟费多少钱？这是很多想加盟皇茶的朋友们想要知道的。下面小编就具体分析一下！皇茶加盟费多少钱？这是很多想加盟 皇茶的朋友们想要知道的。下面小编就具体分析一下！皇茶加盟费多少钱？这是很多想加盟皇茶的朋友们想要知道的。下面小编就具体分析一下！</span>','2015-12-20 20:24:36','2015-12-20 20:24:36','','','','','','');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (16,'贡茶加盟费多少钱3','<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">皇茶加盟费多少钱？这是很多想加盟皇茶的朋友们想要知道的。下面小编就具体分析一下！皇茶加盟费多少钱？这是很多想加盟 皇茶的朋友们想要知道的。下面小编就具体分析一下！皇茶加盟费多少钱？这是很多想加盟皇茶的朋友们想要知道的。下面小编就具体分析一下！</span>','2015-12-20 20:24:50','2015-12-20 20:24:50','','','','','','');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (17,'贡茶加盟费多少钱4','<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">皇茶加盟费多少钱？这是很多想加盟皇茶的朋友们想要知道的。下面小编就具体分析一下！皇茶加盟费多少钱？这是很多想加盟 皇茶的朋友们想要知道的。下面小编就具体分析一下！皇茶加盟费多少钱？这是很多想加盟皇茶的朋友们想要知道的。下面小编就具体分析一下！</span>','2015-12-20 20:25:04','2015-12-20 20:25:04','','','','','','');
insert  into `news`(`id`,`title`,`content`,`create_time`,`update_time`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (18,'贡茶加盟费多少钱5','<span style=\"font-family:\'microsoft yahei\';font-size:14px;line-height:25px;\">皇茶加盟费多少钱？这是很多想加盟皇茶的朋友们想要知道的。下面小编就具体分析一下！皇茶加盟费多少钱？这是很多想加盟 皇茶的朋友们想要知道的。下面小编就具体分析一下！皇茶加盟费多少钱？这是很多想加盟皇茶的朋友们想要知道的。下面小编就具体分析一下！</span>','2015-12-20 20:25:15','2015-12-20 20:25:15','','','','','','');

/*Table structure for table `page` */

CREATE TABLE `page` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `str_id` varchar(50) NOT NULL,
  `loca_url` varchar(50) NOT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `str_id` (`str_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `page` */

insert  into `page`(`id`,`str_id`,`loca_url`,`remark`) values (1,'index','/index','首页');
insert  into `page`(`id`,`str_id`,`loca_url`,`remark`) values (6,'about','/about','关于皇茶');
insert  into `page`(`id`,`str_id`,`loca_url`,`remark`) values (7,'common','/common','公共页面');
insert  into `page`(`id`,`str_id`,`loca_url`,`remark`) values (8,'join','/join','加盟介绍');

/*Table structure for table `picture` */

CREATE TABLE `picture` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `path` varchar(250) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `remark` varchar(250) DEFAULT NULL,
  `ext1` varchar(250) DEFAULT NULL,
  `ext2` varchar(250) DEFAULT NULL,
  `ext3` varchar(250) DEFAULT NULL,
  `ext4` varchar(250) DEFAULT NULL,
  `ext5` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `picture` */

insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (18,'/upload/image/1450527560183.png','首页Logo','首页顶部Logo，ext1为title','贡茶','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (19,'/upload/image/1450521562904.png','首页轮播图1','ext5为排序','','','','','1');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (20,'/upload/image/1450521588086.png','首页轮播图2','ext5为排序','','','','','2');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (21,'/upload/image/1450521607187.png','首页轮播图3','ext5为排序','','','','','3');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (22,'/upload/image/1450522351966.png','首页中部介绍图1','ext5为排序','','','','','1');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (23,'/upload/image/1450522372005.png','首页中部介绍图2','ext5为排序','','','','','2');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (24,'/upload/image/1450522393093.png','首页中部介绍图3','ext5为排序','','','','','3');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (25,'/upload/image/1450522404685.png','首页中部介绍图4','ext5为排序','','','','','4');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (26,'/upload/image/1450522730416.png','首页中部背景图','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (27,'/upload/image/1450522753842.png','首页中部轮播图1','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (28,'/upload/image/1450522770138.png','首页中部轮播图2','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (29,'/upload/image/1450522786179.png','首页中部轮播图3','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (30,'/upload/image/1450523246135.png','首页中下部小图','ext1为标题，ext2为简介','投资优势','奶茶行业14亿的市场前景','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (31,'/upload/image/1450523357343.png','首页中下部小图2','ext1为标题，ext2简介','投资优势','奶茶行业14亿的市场前景','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (32,'/upload/image/1450523418759.png','首页中下部小图3','ext1为标题，ext2简介','投资优势','奶茶行业14亿的市场前景','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (33,'/upload/image/1450523514063.png','首页中下部小图4','ext1为标题，ext2为简介','投资优势','奶茶行业14亿的市场前景','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (34,'/upload/image/1450523587711.png','首页中下部小图5','ext1为标题，ext2为简介','投资优势','奶茶行业14亿的市场前景','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (35,'/upload/image/1450523627582.png','首页中下部小图6','ext1为标题，ext2为简介','投资优势','奶茶行业14亿的市场前景','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (36,'/upload/image/1450523964459.png','首页底部右侧图片1','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (37,'/upload/image/1450523985274.png','首页底部右侧图片2','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (38,'/upload/image/1450580471032.png','首页中部轮播图4','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (39,'/upload/image/1450596945140.png','关于页面中部右侧图片','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (40,'/upload/image/1450613987173.png','加盟介绍中部右侧图片','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (41,'/upload/image/1450614108360.png','加盟介绍中部news图片1','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (42,'/upload/image/1450614130949.png','加盟介绍中部news图片2','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (43,'/upload/image/1450614148748.png','加盟介绍中部news图片3','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (44,'/upload/image/1450614181324.png','加盟介绍中部news图片4','','','','','','');
insert  into `picture`(`id`,`path`,`name`,`remark`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values (45,'/upload/image/1450614195796.png','加盟介绍中部news图片5','','','','','','');

/*Table structure for table `user` */

CREATE TABLE `user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`password`,`nick_name`,`create_time`,`update_time`) values (1,'admin','e10adc3949ba59abbe56e057f20f883e','超级管理员','2015-12-13 11:33:01','2015-12-17 21:18:54');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
