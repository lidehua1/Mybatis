package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.utils.SqlsessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * @author 李德华
 * @createTime 2022-04-20 22:29
 */
public class MybatisBaseTest {
    SqlSessionFactory factory = SqlsessionUtils.getSqlSessionFactory();

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = factory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.insertUser();

    }
}
