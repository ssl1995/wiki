package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SongShengLin
 * @date 2021/10/5 4:55 下午
 * @description
 */
@RestController
public class TestController {
    // Controller：表示层，也叫控制层

    /**
     * 配置文件设置的值，用@Value去获取，:+默认配置的值
     */
    @Value("${test.hello:Hello1}")
    private String testHello;

    @Resource
    private TestService testService;

    /**
     * 常见的四种请求方式：
     * POST增 DELETE删 PUT改 GET查
     */
    @GetMapping("/hello")
    public String HelloWorld() {
        return "Hello World";
    }

    @PostMapping("/hello/post")
    public String HelloWorldPost(String name) {
        return "Hello World Name: " + name + testHello;
    }


    @GetMapping("/test/hello")
    public List<Test> getTestList() {
        return testService.getList();
    }
}
