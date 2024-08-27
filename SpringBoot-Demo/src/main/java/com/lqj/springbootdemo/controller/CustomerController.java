package com.lqj.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.lqj.springbootdemo.bean.Customer;
import com.lqj.springbootdemo.service.CustomerService;
import org.apache.catalina.webresources.AbstractArchiveResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * @Author：小楼听雨客
 * @Package：com.lqj.springbootdemo.controller
 * @Project：BigData240422
 * @name：CustomerController
 * @Date：2024/8/26 19:20
 */
@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/customer")
    public String getCustomer1(){
        return "Customer";
    }

    @RequestMapping("/param")
    public String getParam(@RequestParam(value = "username") String username , @RequestParam(value = "password") String password){

        return username + ":" + password;
    }
    @RequestMapping("/param2/{name}/{password}")
    public String param2(@PathVariable(value = "name") String username , @PathVariable(value = "password") String password){
        System.out.println(username+":"+password);
        return username + ":" + password;
    }

    @RequestMapping("/param3")
    public Customer param3(@RequestBody Customer customer){
        return customer;
    }

    @RequestMapping("/getCustomer")
    public String getCustomer(){
        Customer customer = customerService.getCustomer();
        return  JSON.toJSONString(customer);

    }

}
