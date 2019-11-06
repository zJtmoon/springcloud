package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
public class DemoApplication {
    /**
     * 解决resttemplete找不到的原因,如果使用rest方式使用别名的方式进行调用，需要依赖ribbon负载均衡器需要加@LoadBalance
     * @LoadBalanced 能让restremplate在请求时拥有客户端的负载均衡的能力
     * @param
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args)
    {

        SpringApplication.run(DemoApplication.class, args);
    }

}
