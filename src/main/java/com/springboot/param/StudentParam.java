package com.springboot.param;

import lombok.Data;

/**
 * student入参
 */
@Data
public class StudentParam {
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
}
