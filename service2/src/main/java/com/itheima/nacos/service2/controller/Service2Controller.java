package com.itheima.nacos.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
    @Autowired
    private ConfigurableApplicationContext configurableApplicationContext;
    /*@Value("${common.name}")
    private String name;*/

    @GetMapping("/config")
    public String getConfig(){
        String property = configurableApplicationContext.getEnvironment().getProperty("common.name");
        return "property";
    }
    @GetMapping("/configs")
    public String getConfigs(){
        String property = configurableApplicationContext.getEnvironment().getProperty("common.name");
        System.out.println(property);
        String property1 = configurableApplicationContext.getEnvironment().getProperty("common2.name");
        //读取配置信息
        return property+"---"+property1;
    }
}
