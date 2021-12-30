package com.itheima.nacos.service1.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
    /**
     * 1、@Value(“xiaoxiong”)
     * 直接将字符串"xiaoxiong"赋值给属性，如果属性类型不是String，或无法进行类型转换，则报错
     * 2、@Value("$ {xiaoxiong}")
     * 将会把{}中的字符当做key从Properties文件中找出对应的Value赋值给属性如果没有找到则会把"$ {xiaoxiong}“当做普通字符赋值给属性
     * 3、@Value(”#{xiaoxiong}")
     * 会将#{}中的字符串当做Spring表达式进行解析，Spring会把xiaoxiong当做beanName,并从Spring容器中找到对应的Bean,如果找到则进行属性注入，没有找到则报错
     * common.name
     *
     */
    @Autowired
    private ConfigurableApplicationContext configurableApplicationContext;

//    @Value("${common.name}")
    @NacosValue(value="common.name")
    private String name;

    @GetMapping("/get")
    public String getName(){
        return name;
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
