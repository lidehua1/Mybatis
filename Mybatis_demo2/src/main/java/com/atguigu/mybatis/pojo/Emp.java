package com.atguigu.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 李德华
 * @createTime 2022-04-15 13:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Emp {

    private Integer eid;

    private String empName;

    private Integer age;

    private String sex;

    private String email;
}
