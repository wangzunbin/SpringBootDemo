package com.wangzunbin.springbootdemo.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * ClassName:ServerSettings  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/4/17 10:00   <br/>
 */
@Component
@PropertySource({"classpath:application.yml"})
@ConfigurationProperties
@Data
public class ServerSettings {
    private String name;
    private String domain;

}
