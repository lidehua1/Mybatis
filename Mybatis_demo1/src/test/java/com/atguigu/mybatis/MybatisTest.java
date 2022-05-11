package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 李德华
 * @createTime 2022-04-14 10:58
 */
public class MybatisTest {
    @Test
    public void testMybatis() throws IOException {
        SqlSessionFactory factory = SqlsessionUtils.getSqlSessionFactory();
        //获取会话对象
        SqlSession session = factory.openSession(true);
        //获取接口的代理对象;
        UserMapper userMapper = session.getMapper(UserMapper.class);
        //添加用户
       // int result = userMapper.insertUser();
        //修改用户
        //userMapper.updateUser();
        //根据id查询单个用户
        User user1 = userMapper.selectOneById();
        System.out.println(user1);
        //userMapper.deleteOneById();
        //查询所有用户
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
