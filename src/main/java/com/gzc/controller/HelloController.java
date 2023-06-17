package com.gzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String success(){
        System.out.println("页面跳转成功");
        //执行完里面的语句之后,想跳转到哪里就写上那里的逻辑地址
        //跳转到success页面
        return "succes";
    }

    @RequestMapping("/toEmpListPages")
    public String toemplistpage(){
        return "emplist";
    }

    //?代表匹配一个字符
    //*代表匹配任意字符
    //**代表匹配多重路径
    @RequestMapping("/testant/**")
    public String testAnt(){
        return "succes";
    }

    //@PathVariable用于获取URL中占位符参数的值,写在参数的前面,参数类型不匹配报400
    //required设置当前参数是否必须入参【默认值：true】,如果是true又不传参报500,如果是false则可以不传参,系统会自动装配null
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(value = "id",required = false) Integer id){
        System.out.println("id = " + id);
        return "succes";
    }
}
