package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;

import java.util.List;

/**
 * @author 李德华
 * @createTime 2022-04-15 13:32
 */
public interface DeptMapper {
    /**
     * 查询所有部门
     */

    List<Dept> getAllDept();
}
