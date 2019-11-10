package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjt
 * @create 2019-11-06-下午10:41
 * @desc：
 */
@RestController
public class AppServer {
    @Value("${server.port}")
    private  String port;
    @RequestMapping("/getMember")
    public  String getMember(){
        return "this is member,我是会员服务  port"+port ;
    }
}
