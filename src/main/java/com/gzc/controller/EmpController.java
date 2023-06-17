package com.gzc.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/16  16:29  周五
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Controller
//@RequestMapping也可以在类中使用,调用时需要使用:/类注解中的value值/方法注解中的value值
@RequestMapping("/EmpController")
public class EmpController {

    //一个方法可以对应多个url,可以有多个链接公用一个方法
    //method属性用来设置请求方法,GET,POST等,默认全部支持,弄错报405
    //params用来给url设置参数,不传报400
    //headers用来设置请求头信息,设置了头信息后换浏览器会报404
    @RequestMapping(value = {"/saveEmp","/insertEmp"},
            method = RequestMethod.GET,
            headers = "User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36"
    )
    public String saveEmp(){
        System.out.println("添加员工信息!!!");
        return "succes";
    }

}
