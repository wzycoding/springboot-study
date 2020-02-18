create table if not exists student (
  id bigint primary key auto_increment comment 'id',
  name varchar(20) not null default '' comment '姓名',
  sex int not null default 0 comment '性别：0男，1女',
  remark varchar(100) default '' comment '备注',
  create_time datetime not null comment '创建时间',
  `delete` int not null default 0 comment '删除标记，0未删除，1删除'
)ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='学生表';