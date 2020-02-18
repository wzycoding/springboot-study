package com.springboot.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    /**
     * id
     */
    private Long id;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生性别
     */
    private Integer sex;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 删除标记
     */
    private Integer delete;

}
