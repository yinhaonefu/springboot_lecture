package com.test.spring.controller;

import com.test.spring.config.MyConfigBean;
import com.test.spring.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {

    @Value("${myConfig.myObject.myName}")
    private String myName;
    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    @Resource
    private MyConfigBean myConfigBean;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Person getPerson(){
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(myConfigBean.getMyName());
        System.out.println(myConfigBean.getMyAge());
        Person person = new Person();
        person.setId(1);
        person.setName("zhangsan");
        person.setBirthday(new Date());
        return person;
    }
}
