package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 李德华
 * @createTime 2022-04-15 13:32
 */
public interface EmpMapper {
    /**
     * 查询所有员工
     */
    List<Emp> getAllEmp ();


}
