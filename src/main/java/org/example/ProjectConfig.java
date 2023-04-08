package org.example;

import org.example.aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

  /*  @Bean
    public CommentService commentService(){
        return new CommentService();
    }*/
    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }
}
