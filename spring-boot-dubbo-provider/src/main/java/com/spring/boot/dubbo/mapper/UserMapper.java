package com.spring.boot.dubbo.mapper;

import com.spring.dubbo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    @Select(value = "select * from user where id = #{id}")
    @Results(value = {@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
    @Result(column = "age", property = "age", jdbcType = JdbcType.INTEGER)})
    public User getUser(int id);
}
