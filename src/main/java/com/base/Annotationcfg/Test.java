package com.base.Annotationcfg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String args[]){
        //使用AnnotationConfigApplicationContext作为Spring容器，并接受一个参数类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
        useFunctionService usefunctionservice =context.getBean(useFunctionService.class);
        System.out.println(usefunctionservice.sayHello("6666"));
    }
}
