package com.wangzunbin.springbootdemo.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * ClassName:RequestLisrtener  <br/>
 * Funtion: 这个是请求的监听器 <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/4/19 14:36   <br/>
 */

@WebListener
public class RequestLisrtener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("========request Destroyed ===============");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("=========request init ========");
    }
}
