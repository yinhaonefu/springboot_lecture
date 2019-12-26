package com.test.spring.config;


import org.springframework.beans.factory.annotation.Value;

public class MyConfigBean {
    @Value("${myConfig.myObject.myName}")
    private String myName;
    @Value("${myConfig.myObject.myAge}")
    private String myAge;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyAge() {
        return myAge;
    }

    public void setMyAge(String myAge) {
        this.myAge = myAge;
    }
}
