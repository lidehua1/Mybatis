package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.ParameterMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlsessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author 李德华
 * @createTime 2022-04-14 16:25
 */
public class ParameterMapperTest {
    SqlSessionFactory factory = SqlsessionUtils.getSqlSessionFactory();

    /**
     * mybaits获取参数值得两种方式: ${} #{}
     * ${} 本质是字符串的拼接
     * #{}  本质占位符赋值
     * Mybatis 获取参数值得各种情况:
     * 1. mapper接口方法的参数为单个的字面量类型
     *    可以通过${}和 #{}以任意的名称获取参数值,但是需要注意${}的单引号问题
     *
     * 2. mapper接口方法的参数为多个时:
     *   此时没有把提升会讲这些参数放在一个map集合中,以两种方式进行存储
     *   a> 以arg0,arg1....为键,以参数位置
     *   b> 以param1,param2...为键,以参数为值
     *   因此只需要通过#{},${}以键的方式访问值即可,但是需要注意${}的单引号问题
     *
     * 3. mapper接口方法多个参数的情况,使用@param注解自定定义键,按照自定义的键取值
     *    List<User> checkLogin(@Param("username") String username,
     *                            @Param("password") String password);
     */
    @Test
    public void testUserByUserNmae() {
        SqlSession sqlSession = factory.openSession(true);
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        //使用#{}
        List<User> userList = mapper.getUserByUsername("admin");
        for(User user: userList){
            System.out.println(user);
        }
        List<User> admin = mapper.checkLogin("admin", "123456");
        HashMap map = new HashMap<>();
        map.put("username", "admin");
        map.put("password","123456");
        List<User> userList1 = mapper.checkLogin(map);
        for(User user: userList1){
            System.out.println(user);
        }
    }

    @Test
    public void testMybats() {
        SqlSessionFactory sqlSessionFactory = SqlsessionUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = parameterMapper.selectAllUser();
        users.forEach(user -> System.out.println(user));

    }
}
