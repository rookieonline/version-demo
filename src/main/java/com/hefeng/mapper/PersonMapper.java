package com.hefeng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hefeng.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author rookie
 * @date 2021/05/28 22:59
 **/
@Mapper
@Component("personMapper")
public interface PersonMapper extends BaseMapper<Person> {
}
