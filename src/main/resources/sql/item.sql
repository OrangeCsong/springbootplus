/*
Navicat MySQL Data Transfer

Source Server         : 本地MySQL
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2018-07-23 17:03:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `item_id` int(11) NOT NULL,
  `item_name` varchar(255) DEFAULT NULL,
  `item_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('1', 'censong11', 'miaoshu11');
INSERT INTO `item` VALUES ('2', 'censong11', 'miaoshu11');
