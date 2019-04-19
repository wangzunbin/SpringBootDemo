package com.wangzunbin.springbootdemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * ClassName:CustomContextListener  <br/>
 * Funtion: 这个是项目的启动的监听器 <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/4/19 14:36   <br/>
 */

@WebListener
public class CustomContextListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("========context destroyed =========");
    }


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("==========context init  ===========");
    }
}
