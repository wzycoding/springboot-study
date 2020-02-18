package com.springboot.service;

import com.springboot.param.StudentParam;
import com.springboot.vo.StudentVo;

import java.util.List;

public interface IStudentService {
    /**
     * 添加学生信息
     */
    int add(StudentParam param);

    /**
     * 获取所有学生信息
     */
    List<StudentVo> getAll();

    /**
     * 获取学生信息通过id
     */
    StudentVo getById(Long id);

    /**
     * 删除学生信息通过id
     */
    int remove(Long id);

    /**
     * 更新学生信息
     */
    void update(StudentParam param);
}
