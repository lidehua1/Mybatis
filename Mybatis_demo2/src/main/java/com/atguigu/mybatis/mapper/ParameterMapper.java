package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 李德华
 * @createTime 2022-04-14 16:23
 */
public interface ParameterMapper {

    /**
     * 根据用户名查询用户信息
     */
    List<User> getUserByUsername(String username);
    /**
     *
     * 根据用户和密码查询
     */
    List<User> checkLogin(@Param("username") String username,
                          @Param("password") String password);
    List<User> checkLogin(Map<String,String> map);
    /**
     * 查询所有员工
     */
    List<User> selectAllUser();
}
