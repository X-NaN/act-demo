package com.nana.act.service.test;

import org.springframework.stereotype.Service;

/**
 * 功能描述 <br>
 *
 * @author xingnana
 * @create 2020-07-22
 */
@Service("testService")
public class TestService {

    public String test(){
        return "service test";
    }

}
