package com.wangzunbin.springbootdemo.controller;

import com.wangzunbin.springbootdemo.bean.MyException;
import com.wangzunbin.springbootdemo.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * ClassName:FileController  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/4/12 11:29   <br/>
 */

@RestController
public class ExceptionController {


    @GetMapping(path = "/v2/test_ext")
    public Object testEXT() {
        int a = 1 / 0;
        return new User("dada", "adad", 11, "dahj", new Date());
    }

    @GetMapping("/v2/get_exception")
    public Object getException() {
        throw new MyException("500", "121");
    }
}
