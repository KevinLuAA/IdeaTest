package com.miu.web;

import com.miu.service.ServiceTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;

/**
 * 子模块  web   （页面交互接收、传递数据，唯一有启动类的模块）
 *
 * 程序入口(相当于控制层)
 *
 * web依赖 service、dao、entity
 */
@RestController
@RequestMapping("test")
public class WebTest {
    @RequestMapping("showAll")
    public String showAll(){
        // 创建ServiceTest对象
        ServiceTest serviceTest = new ServiceTest();
        return serviceTest.showService()+":我是web";
    }
}
