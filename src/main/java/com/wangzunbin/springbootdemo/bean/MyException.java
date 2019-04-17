package com.wangzunbin.springbootdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:MyException  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/4/17 11:22   <br/>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyException extends RuntimeException {

    private String code;
    private String msg;
}
