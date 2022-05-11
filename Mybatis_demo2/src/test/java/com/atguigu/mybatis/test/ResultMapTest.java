package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlsessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * @author 李德华
 * @createTime 2022-04-15 13:19
 */
public class ResultMapTest {
    SqlSessionFactory factory = SqlsessionUtils.getSqlSessionFactory();

    @Test
    public void testGetAllEmp() {
        SqlSession sqlSession = factory.openSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        for (Emp emp : allEmp) {
            System.out.println(allEmp);
        }

    }

    @Test
    public void testGetAllDept() {
        SqlSession sqlSession = factory.openSession();
        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
        List<Dept> deptList = deptMapper.getAllDept();
        for (Dept dept : deptList) {
            System.out.println(dept);
        }
    }




}
