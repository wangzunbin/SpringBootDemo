package com.wangzunbin.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/**
 * ClassName:FileController  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/4/12 11:29   <br/>
 */

@Controller
public class FileController {

    private static final String filePath = "E:/IdeaProject/SpringBootDemo/src/main/resources/static/images/";

    @RequestMapping(path = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("head_img") MultipartFile file, HttpServletRequest request){

        String name = request.getParameter("name");
        System.out.println("用户名: " + name);
        if(Objects.isNull(file)) {
            return "上传的文件不能为空";
        }

        // 获取文件名
        String fileName = file.getOriginalFilename();
        System.out.println("上传的文件名为: " + fileName);
        if(Objects.isNull(fileName)) {
            return "上传的文件不能为空";
        }
        // 获取文件的后缀名
        String substring = fileName.substring(fileName.lastIndexOf("."));
        System.out.println("上传的文件格式为: " + substring);

        fileName = UUID.randomUUID() + substring;
        File dest = new File(filePath , fileName);
        try {
            file.transferTo(dest);
            return fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

}
