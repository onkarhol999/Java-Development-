package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Aline obj = context.getBean(Aline.class);
        System.out.println(obj.getAge());
        obj.show();
//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Aline obj = (Aline) context.getBean("alien");
//        System.out.println(obj.getAge());
//        obj.show();

     }
}
