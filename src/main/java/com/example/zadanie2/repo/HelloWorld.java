package com.example.zadanie2.repo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ttomaka on 16.03.2017.
 */

public class HelloWorld implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring : Hello ! " + name);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Run afterPropertiesSet method");
    }
    public void initHelloWorld() {
        System.out.println("Run initHelloWorld method");
    }

    public void destroy() {
        System.out.println("Run destroy method");
    }
    public void destroyHelloWorld() {
        System.out.println("Run destroyHelloWorld method");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Run setApplicationContext method");

    }

    public void setBeanName(String s) {
        System.out.println("Run setApplicationContext method Bean name is " + s);

    }

    @PostConstruct
    public void postConstructHelloWorld() {
        System.out.println("Run postConstructHelloWorld method");
    }

    @PreDestroy
    public void preDestroyHelloWorld() {
        System.out.println("Run preDestroyHelloWorld method");
    }

}
