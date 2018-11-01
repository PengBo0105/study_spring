package com.base.Annotationcfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class useFunctionService {
    @Autowired
    FunctionService functionService;
    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
