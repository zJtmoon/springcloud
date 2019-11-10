package com.example.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zjt
 * @create 2019-11-06-下午11:28
 * @desc：
 */
@RestController
public class orderController {

    @Resource
    private RestTemplate restTemplate;
    /**
     * 在springcloud。有两种方式http   1.rest是有springboot提供的采用httpclient技术 2.fegin它是springcloud的
     *
     * @return
     */
    //订单服务调用会员服务
    @RequestMapping("/getOrder")
    public String getOrder() {
        //使用别名去注册中心上获取对应的服务调用地址
        String url = "http://hello-springcloud/getMember";
//        //这样其实不对
//       String result= restTemplate.getForObject("http://127.0.0.1:8081/getMember",String.class);

        String result = restTemplate.getForObject(url, String.class);
        System.out.println("订单服务调用会员服务的result：" + result + "------");
        return result;
    }
}
