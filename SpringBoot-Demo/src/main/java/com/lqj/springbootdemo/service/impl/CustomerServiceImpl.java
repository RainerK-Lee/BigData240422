package com.lqj.springbootdemo.service.impl;

import com.lqj.springbootdemo.bean.Customer;
import com.lqj.springbootdemo.mapper.CustomerMapper;
import com.lqj.springbootdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author：小楼听雨客
 * @Package：com.lqj.springbootdemo.service.impl
 * @Project：BigData240422
 * @name：CustomerServiceImpl
 * @Date：2024/8/27 9:59
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
    @Override
    public Customer getCustomer(Long id) {
        return customerMapper.getCustomer(id);
    }

    @Override
    public void insertCustomer(String username, String password) {
        System.out.println(username + ":"+ password);
        customerMapper.insertCustomer(username,password);
    }


}
