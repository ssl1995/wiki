package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SongShengLin
 * @date 2021/10/5 4:55 下午
 * @description
 */
@RestController
public class TestController {

    /**
     * 常见的四种请求方式：
     * POST增 DELETE删 PUT改 GET查
     */
    @GetMapping("/hello")
    public String HelloWorld() {
        return "Hello World";
    }
}
