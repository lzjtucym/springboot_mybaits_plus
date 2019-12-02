/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : testdb

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-12-02 10:06:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `trueName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `roleId` int(11) DEFAULT NULL,
  `dept` varchar(255) DEFAULT NULL,
  `deptId` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '状态（-1：全部，0：正常，1：注销，2：删除，3：冻结）',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('6', 'chenyumin', '陈育民', '123', '男', '24', '15294183759', '1601561783@qq.com', '西安', '高新区', '0', '研发部', '0', '0');
INSERT INTO `test_user` VALUES ('7', 'zhangsan', '张三', '123', '女', '20', '15294183759', '152@qq.com', '西安', '高新区', '0', '研发部', '0', '0');
INSERT INTO `test_user` VALUES ('8', 'lisi', '李四', '123', '女', '20', '15294183759', '152@qq.com', '西安', '高新区', '0', '研发部', '0', '0');
