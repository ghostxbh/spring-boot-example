/*
 Navicat Premium Data Transfer

 Source Server         : LocalMysql
 Source Server Type    : MySQL
 Source Server Version : 50521
 Source Host           : localhost
 Source Database       : springboot

 Target Server Type    : MySQL
 Target Server Version : 50521
 File Encoding         : utf-8

 Date: 02/20/2019 15:43:19 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `ip` varchar(50) DEFAULT NULL COMMENT 'IP',
  `insert_time` datetime DEFAULT NULL COMMENT '提交时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Records of `message`
-- ----------------------------
BEGIN;
INSERT INTO `message` VALUES ('1', '小李', '181.611.21.56', '2019-02-06 09:57:20'), ('2', '阿龙', '177.42.57.11', '2019-02-05 09:57:57'), ('3', 'ss', '1264.564564.12', '2019-02-13 09:59:07'), ('4', '1', '15845.1455', '2019-02-08 10:00:11');
COMMIT;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `balance` int(18) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('0', '暖暖', '0', '0'), ('1', 'string', '20', '1'), ('2', 'nathan', '23', '999999');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
