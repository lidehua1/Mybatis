package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlsessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * @author 李德华
 * @createTime 2022-04-14 22:11
 */
public class SelectMapperTest {
    /**
     * mybaits的各种查询功能
     * 1.若查询出的数据只有一条,可以通过实体类的对象或者集合接收
     * 2.若查询处的数据有多条,一定不能通过实体类的对象接收,此时会抛出异常
     * a> 可以通过list集合接收
     * b> 可以通过map接收
     */
    SqlSessionFactory factory = SqlsessionUtils.getSqlSessionFactory();

    @Test
    public void testSelectOne() {
        SqlSession sqlSession = factory.openSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User userById = mapper.getUserById(6);
        System.out.println(userById);
    }

    @Test
    public void testGetKey() {
        SqlSession sqlSession = factory.openSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        User user = new User();
        user.setUsername("李德华").setAge(18).setSex("男").setPassword("1234556789");
        selectMapper.insertUser(user);
        sqlSession.commit();
        System.out.println(user.getId());
    }

    @Test
    public void setTableName() {
        SqlSession sqlSession = factory.openSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> userList = mapper.getAllUser("t_user");
        for (User user : userList) {
            System.out.println(user);
        }

    }

    @Test
    public void testResultMapByLikeUserInfo() {
        SqlSession sqlSession = factory.openSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> userList = mapper.testModu("李");
        for (User user : userList) {
            System.out.println(user);
        }

    }
}
