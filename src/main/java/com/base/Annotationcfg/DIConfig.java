package com.base.Annotationcfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//声名当前类是一个Java配置类
@ComponentScan("com.base.Annotationcfg")//自动扫描包下所有的声名类
public class DIConfig {

}
