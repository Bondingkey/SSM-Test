package com.gzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/15  17:56  周四
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Controller//标识当前类是一个请求处理器类
public class HelloController {

    //配置url[/],映射到WEB-INF/index.html
    //SpringMVC可以映射到方法,当浏览器访问对应的后缀时,跳转返回值所对应的逻辑地址
    @RequestMapping("/")//当访问/时,便跳转到/WEB-INF/pages/index.html
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/HelloController")
    public String succes(){
        System.out.println("页面跳转成功");
        //执行完里面的语句之后,想跳转到哪里就写上那里的逻辑地址
        //跳转到succes页面
        return "succes";
    }
}
