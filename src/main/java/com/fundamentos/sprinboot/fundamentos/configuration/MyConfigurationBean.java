package com.fundamentos.sprinboot.fundamentos.configuration;

import com.fundamentos.sprinboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    private MyOperation myOperation;
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }
    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);

    }

    @Bean
    public MyNotificacion myNotificacion(){
        return new MyNotificationImplement();
    }
}
