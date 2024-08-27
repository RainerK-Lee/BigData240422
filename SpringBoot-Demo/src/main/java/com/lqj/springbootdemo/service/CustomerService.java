package com.lqj.springbootdemo.service;

import com.lqj.springbootdemo.bean.Customer;
import org.springframework.stereotype.Service;

/**
 * @Author：小楼听雨客
 * @Package：com.lqj.springbootdemo.service
 * @Project：BigData240422
 * @name：CustomerService
 * @Date：2024/8/27 9:58
 */
public interface CustomerService {
    Customer getCustomer(Long id);
    void insertCustomer(String username , String password);

    void updateCustomer(Customer customer);

}
