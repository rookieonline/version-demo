package com.hefeng.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author rookie
 * @date 2021/05/28 22:55
 **/
@Data
@TableName("person")
public class Person {

    private String name;
    private Integer age;
    private String addr;
}
