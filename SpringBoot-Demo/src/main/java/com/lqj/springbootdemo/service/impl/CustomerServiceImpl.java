package com.lqj.springbootdemo.service.impl;

import com.lqj.springbootdemo.bean.Customer;
import com.lqj.springbootdemo.service.CustomerService;

/**
 * @Author：小楼听雨客
 * @Package：com.lqj.springbootdemo.service.impl
 * @Project：BigData240422
 * @name：CustomerServiceImpl
 * @Date：2024/8/27 9:59
 */
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomer() {
        return new Customer("lqj","123456");
    }
}
