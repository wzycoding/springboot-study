package com.springboot.vo;

import lombok.Data;

/**
 * 学生视图类（返回给前端，有些信息我们不想让用户看到）
 */
@Data
public class StudentVo {
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
}
