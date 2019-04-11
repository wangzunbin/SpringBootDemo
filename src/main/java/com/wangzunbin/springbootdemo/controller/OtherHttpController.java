package com.wangzunbin.springbootdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:OtherHttpController  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/4/10 15:37   <br/>
 */

@RestController(value = "other")
public class OtherHttpController {
    private Map<String, Object> params = new HashMap<>();

    @PutMapping("/v1/put")
    public Object  testPut(String id){
        params.clear();
        params.put("id", id);
        return params;
    }

    @DeleteMapping("/v1/del")
    public Object del(String id){
        params.clear();
        params.put("id", id);
        return params;
    }
}
