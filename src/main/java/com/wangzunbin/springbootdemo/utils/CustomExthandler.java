package com.wangzunbin.springbootdemo.utils;

import com.wangzunbin.springbootdemo.bean.MyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:CustomExthandler  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/4/17 11:07   <br/>
 */

@RestControllerAdvice
public class CustomExthandler {

    @ExceptionHandler(value = Exception.class)
    public Object handleException(Exception e, HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 100);
        map.put("msg", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;
    }

    @ExceptionHandler(value = MyException.class)
    public Object handleMyException(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error.html");
        modelAndView.addObject("msg", e.getMessage());
        return modelAndView;
    }
}
