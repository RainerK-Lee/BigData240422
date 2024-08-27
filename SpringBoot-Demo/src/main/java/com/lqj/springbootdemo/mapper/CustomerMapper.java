package com.lqj.springbootdemo.mapper;

import com.lqj.springbootdemo.bean.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author：小楼听雨客
 * @Package：com.lqj.springbootdemo.mapper
 * @Project：BigData240422
 * @name：CustomerMapper
 * @Date：2024/8/27 15:06
 */
@Mapper
public interface CustomerMapper {
    @Select("select id,username,password from customer where id = #{id}")
    Customer getCustomer(Long id);
    @Insert("insert into customer (username,password)value(#{username},#{password})")
    void insertCustomer(@Param("username") String username,@Param("password") String password);
}
