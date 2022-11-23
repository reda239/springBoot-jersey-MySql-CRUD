package com.example.springrestandsoapdemo.Config;

import com.example.springrestandsoapdemo.Web.CompteRestApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig resourceConfig = new ResourceConfig();

        return resourceConfig.register(CompteRestApi.class);
    }
}
