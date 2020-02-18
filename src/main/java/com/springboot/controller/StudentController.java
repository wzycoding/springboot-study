package com.springboot.controller;

import com.springboot.param.StudentParam;
import com.springboot.result.Result;
import com.springboot.service.IStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 学生Controller
 */
@RestController
@RequestMapping("/api/v1.0/student")
public class StudentController {

    /**
     * 添加方法
     */
    @PostMapping("/add")
    public Result add(@RequestBody StudentParam param) {
        studentService.add(param);
        return Result.success();
    }

    /**
     * 获取所有学生信息
     */
    @GetMapping("/getAll")
    public Result getAll() {
        return Result.success(studentService.getAll());
    }

    /**
     * 通过id获取学生信息
     */
    @GetMapping("/getById/{id}")
    public Result getById(@PathVariable("id") long id) {
        return Result.success(studentService.getById(id));
    }

    /**
     * 更新学生信息
     */
    @PutMapping("/update")
    public Result update(@RequestBody StudentParam param) {
        studentService.update(param);
        return Result.success();
    }

    /**
     * 逻辑删除学生信息
     */
    @PostMapping("/remove/{id}")
    public Result delete(@PathVariable("id") long id) {
        studentService.remove(id);
        return Result.success();
    }

    /**
     * 引入学生Service
     */
    @Resource
    IStudentService studentService;
}
