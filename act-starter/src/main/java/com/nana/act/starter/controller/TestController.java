package com.nana.act.starter.controller;

import com.nana.act.service.test.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试
 *
 * @author xingnana
 * @create 2020-07-22
 */
@RestController("/test")
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping(value = "/hello")
    public String hello(){
        return testService.test();
    }

}
