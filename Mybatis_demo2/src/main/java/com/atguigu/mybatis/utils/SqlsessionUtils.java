package com.atguigu.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author 李德华
 * @createTime 2022-04-14 11:55
 */
public class SqlsessionUtils {

    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory factory = null;
        try {
            //加载核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlsessionFactoryBuidler
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //获取sqlsessionfactory
            factory = sqlSessionFactoryBuilder.build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
}
