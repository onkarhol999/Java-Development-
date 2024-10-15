package org.example.config;


import org.example.Aline;
import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Aline aline(){
        Aline obj = new Aline();
        obj.setAge(33);
        obj.setCom(desktop());
        return obj;
    }
////    @Bean(name = "Comp1")
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
