package com.lqj.springbootdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author：小楼听雨客
 * @Package：com.lqj.springbootdemo.bean
 * @Project：BigData240422
 * @name：Customer
 * @Date：2024/8/26 21:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long id;
    private String username;
    private String password;
}
