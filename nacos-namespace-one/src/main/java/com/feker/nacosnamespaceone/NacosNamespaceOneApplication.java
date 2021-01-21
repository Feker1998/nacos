package com.feker.nacosnamespaceone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
//@RefreshScope注解，可以使当前类下的配置支持动态更新。
@RefreshScope
public class NacosNamespaceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosNamespaceOneApplication.class, args);
    }


    //    通过@Value注解，去读取key为nacosconfig的配置的值，并通过/getValue接口返回。
    @Value("${nacos.config}")
    private String config;

    @RequestMapping("/getValue")
    public String getValue() {
        return config;
    }
}
