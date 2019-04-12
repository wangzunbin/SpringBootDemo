package com.wangzunbin.springbootdemo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName:User  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/3/27 15:16   <br/>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    // 如果字段的值为null的话, 不返回
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonProperty("mobile") //别名
    private String phone;
    private Integer age;
    @JsonIgnore  // 标记此字段会不返回
    private String pwd;
    //格式化日期
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date createTime;

}
