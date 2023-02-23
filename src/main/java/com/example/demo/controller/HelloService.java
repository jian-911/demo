package com.example.demo.controller;

import com.example.demo.userBean.CodeBook;
import com.example.demo.mapper.CodeBookDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloService {

    @Resource
    private CodeBookDao codeBookDao;

    @RequestMapping("/say")
    public String sayHello(){
       CodeBook codeBook = codeBookDao.selectByPrimaryKey(1L);
        System.out.println("我的账号："+codeBook.getAccount());
        return codeBook.getAccount();
    }
}
