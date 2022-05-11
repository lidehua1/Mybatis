package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 李德华
 * @createTime 2022-04-14 22:08
 */
public interface SelectMapper {
    /**
     * 根据id查询用户信息
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 插入用户信息
     */
    void insertUser(User user);

    /**
     * 动态设置表名
     */
    List<User> getAllUser(@Param("tableName") String tableName);

    /**
     * 使用resultMap自定义规则模糊查询用户信息
     */
    List<User> testModu(@Param("mohu") String modu);
}
