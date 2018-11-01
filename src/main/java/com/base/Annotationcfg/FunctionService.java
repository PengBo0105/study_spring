package com.base.Annotationcfg;

import org.springframework.stereotype.Service;

@Service //声明当前类是一个spring的管理类
public class FunctionService {
    public String sayHello(String word){
        return "my first spring" + word;
    }
}
