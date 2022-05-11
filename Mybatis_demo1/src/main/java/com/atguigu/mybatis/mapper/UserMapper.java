package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * @author 李德华
 * @createTime 2022-04-14 10:45
 */
public interface UserMapper {
    /**
     * Mybatis面向接口编程的两个一致
     * 1.映射文件的namespace要和mapper接口的全类名一样;
     * 2.映射文件的id值要和接口中的方法名一样;
     *
     *  表---实体类---接口---mapper文件
     */
    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户
     */
    int updateUser();

    /**
     * 删除指定id用户
     */
    void deleteOneById();
    /**
     * 查询指定id用户
     */
    User selectOneById();
    /**
     * 查询所有的用户
     */
    List<User> selectAll();
}
