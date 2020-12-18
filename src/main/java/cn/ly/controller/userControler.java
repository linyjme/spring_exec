package cn.ly.controller;

import cn.ly.pojo.User;
import cn.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class userControler {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id")Long id){
        return this.userService.queryById(id);
    }

    @GetMapping("test")
    @ResponseBody
    public String test() {
        return "hello world";
    }
}
