package com.springboot.mapper;

import com.springboot.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 学生表Dao层
 */
@Mapper
public interface StudentMapper {

    /**
     * 新增学生
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into student(name, sex, remark, create_time) " +
            "values(#{name}, #{sex}, #{remark}, #{createTime}) ")
    int insert(Student student);

    /**
     * 根据id查找学生
     */
    @Select("select * from student where id = #{id} and `delete` = 0")
    Student getById(long id);

    /**
     * 查询所有学生信息
     */
    @Select("select * from student where `delete` = 0")
    List<Student> findAll();

    /**
     * 逻辑删除学生
     */
    @Delete("update student set `delete` = 1 where id = #{id}")
    int remove(long id);

    /**
     * 修改学生信息
     */
    @Update("<script> " +
            "update student " +
            "<set> " +
            "<if test=\"name != null\">name=#{name},</if> " +
            "<if test=\"sex != null\">sex=#{sex},</if> " +
            "<if test=\"remark != null\">remark=#{remark}</if> " +
            "</set> " +
            "where id = #{id} " +
            "</script> ")
    void update(Student target);
}
