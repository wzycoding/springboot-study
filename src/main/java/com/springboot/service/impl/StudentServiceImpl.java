package com.springboot.service.impl;

import com.springboot.entity.Student;
import com.springboot.mapper.StudentMapper;
import com.springboot.param.StudentParam;
import com.springboot.service.IStudentService;
import com.springboot.vo.StudentVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Override
    public int add(StudentParam param) {
        Student student = new Student();
        student.setCreateTime(new Date());
        student.setName(param.getName());
        student.setSex(param.getSex());
        student.setRemark(param.getRemark());
        return studentMapper.insert(student);
    }

    @Override
    public List<StudentVo> getAll() {
        List<StudentVo> studentVoList = new ArrayList<>();
        List<Student> studentList = studentMapper.findAll();
        for (Student student : studentList) {
            StudentVo studentVo = new StudentVo();
            studentVo.setName(student.getName());
            studentVo.setRemark(student.getRemark());
            studentVo.setSex(student.getSex());
            studentVo.setId(student.getId());
            studentVoList.add(studentVo);
        }
        return studentVoList;
    }

    @Override
    public StudentVo getById(Long id) {
        StudentVo studentVo = new StudentVo();
        Student student = studentMapper.getById(id);
        studentVo.setName(student.getName());
        studentVo.setRemark(student.getRemark());
        studentVo.setSex(student.getSex());
        return studentVo;
    }

    @Override
    public int remove(Long id) {
        return studentMapper.remove(id);
    }

    @Override
    public void update(StudentParam param) {
        Student student = new Student();
        student.setId(param.getId());
        student.setName(param.getName());
        student.setRemark(param.getRemark());
        student.setSex(param.getSex());
        studentMapper.update(student);
    }

    @Resource
    private StudentMapper studentMapper;
}
