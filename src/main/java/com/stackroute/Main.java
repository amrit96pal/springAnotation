package com.stackroute;

import com.stackroute.config.Appconfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext= new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(Appconfig.class);
        annotationConfigApplicationContext.refresh();
        Movie movie= (Movie) annotationConfigApplicationContext.getBean("movie");
        System.out.println("The age of the actor is: "+movie.getActor().getAge()+" The name is: "+movie.getActor().getName()+" and finally the gender is: "+movie.getActor().getGender());

    }
}