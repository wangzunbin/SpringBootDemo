package com.wangzunbin.springbootdemo.controller;

import com.wangzunbin.springbootdemo.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * ClassName:SampleController  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/4/12 10:18   <br/>
 */

@RestController
public class SampleController {


    @GetMapping("/testjson")
    public Object testjson(){

        return new User(null, "110", 18, "dada", new Date());
    }

}
