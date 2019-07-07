package com.webservice.jaxws.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.ws.config.annotation.EnableWs;

@Configuration
@EnableWs
@ComponentScan(basePackages = "com.webservice.jaxws")
public class ApplicationConfig extends WebMvcConfigurerAdapter {

}