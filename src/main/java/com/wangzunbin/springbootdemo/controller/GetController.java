package com.wangzunbin.springbootdemo.controller;

import com.wangzunbin.springbootdemo.bean.ServerSettings;
import com.wangzunbin.springbootdemo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:GetController  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/3/27 15:01   <br/>
 */

@RestController
@PropertySource({"classpath:application.yml"})
public class GetController {

    @Value("${test.name}")
    private String name;

    @Autowired
    private ServerSettings serverSettings;

    private Map<String, Object> params = new HashMap<>();

    /**
     * 功能描述, 根据restful协议, 从路径中获取字段
     * @param cityId 城市id
     * @param userId 用户id
     * @return 返回数据
     */
    @RequestMapping(path = "/{city_id}/{user_id}", method = RequestMethod.GET)
    public Object findUser(@PathVariable("city_id")String cityId,
                           @PathVariable("user_id")String userId){
        params.clear();
        params.put("cityId", cityId);
        params.put("userId", userId);
        return params;
    }

    @GetMapping(value = "/v1/page_user1")
    public Object pageUser(int from, int size){
        params.clear();
        params.put("from", from);
        params.put("size", size);
        System.out.println("大点哈");
        System.out.println("测试2");
        return params;
    }

    @RequestMapping("/v1/save_user")
    public Object saveUser(@RequestBody User user){
        return user;
    }

    @GetMapping("/v1/get_header")
    public Object getHeader(@RequestHeader("access_token")String accessToken, String id){
        params.clear();
        params.put("access_token", accessToken);
        params.put("id", id);
        return params;
    }

    @GetMapping("/v2/get_name")
    public Object getName(){
        params.clear();
        params.put("name", name);
        return params;
    }

    @GetMapping("/v2/get_network")
    public Object getNetwork(){
        params.clear();
        params.put("name", serverSettings.getName());
        params.put("domain", serverSettings.getDomain());
        return params;
    }

    @GetMapping("/api/get_user")
    public Object getUser(){
        params.clear();
        params.put("username", "adadada");
        return params;
    }
}
