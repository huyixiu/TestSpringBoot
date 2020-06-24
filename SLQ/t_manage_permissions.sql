SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_manage_permissions
-- ----------------------------
DROP TABLE IF EXISTS `t_manage_permissions`;
CREATE TABLE `t_manage_permissions` (
  `Aid` int(8) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `Apermission_id` int(3) DEFAULT NULL COMMENT '菜单id',
  `Apermission_parent_id` int(3) DEFAULT NULL COMMENT '父菜单ID',
  `Apermission_parent_name` varchar(50) DEFAULT NULL COMMENT '父菜单名称',
  `Aname` varchar(50) DEFAULT NULL COMMENT '菜单文本',
  `Aurl` varchar(50) DEFAULT NULL COMMENT '菜单地址',
  `Adescription` varchar(100) DEFAULT NULL COMMENT '描述',
  `Atype` int(2) DEFAULT '0' COMMENT '菜单类型（0为菜单，1为按钮）',
  `Astatus` int(2) DEFAULT '1' COMMENT '数据状态（1为启用，2为停用）',
  `Acreator` varchar(50) DEFAULT NULL COMMENT '创建人',
  `Acreate_time` datetime DEFAULT NULL COMMENT '创建时间',
  `Amodifier` varchar(50) DEFAULT NULL COMMENT '更新人',
  `Amodify_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`Aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜单权限表';
