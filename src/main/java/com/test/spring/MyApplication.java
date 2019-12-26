package com.test.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        //通过直接运行main方法和打成jar包运行输出是否一样
        //以jar包形式运行输出org.springframework.boot.loader.LaunchedURLClassLoader
        //直接执行main方法输出sun.misc.Launcher$AppClassLoader
        System.out.println(MyApplication.class.getClassLoader());
        SpringApplication.run(MyApplication.class, args);
    }
}
