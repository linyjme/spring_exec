package cn.ly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@EnableAutoConfiguration
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("show")
    public String test(){
        return "hello Spring Boot!";
    }

}
