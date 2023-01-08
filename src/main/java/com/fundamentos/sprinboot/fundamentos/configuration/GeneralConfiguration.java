package com.fundamentos.sprinboot.fundamentos.configuration;

import com.fundamentos.sprinboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.sprinboot.fundamentos.bean.MyBeanWithPropertiesImplement;
import com.fundamentos.sprinboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    @Value("${value.id}")
    private int id;

    @Value("${value.description}")
    private String description;

    @Value("${value.value}")
    private int value;

    @Bean
    public MyBeanWithProperties function(){
        return new MyBeanWithPropertiesImplement(id,description, value);
    }
}
