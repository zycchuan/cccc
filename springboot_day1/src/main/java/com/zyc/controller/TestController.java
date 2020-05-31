package com.zyc.controller;


import com.zyc.bean.JsonData;
import com.zyc.bean.User;
import com.zyc.service.UserService;
import com.zyc.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("test")
public class TestController {

    @Resource
    private UserService userService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisClient redisClient;
    /*@Autowired
    private User user;
*/
    //测试
    @RequestMapping("testFm")
    public String testFm(Model model){
        User user = new User();
        user.setName("zzz");
        user.setAge("1");
        model.addAttribute("user",user);
        System.out.println(123);
        return "fm/fmIndex";
    }
    @RequestMapping("testTh")
    public String testTh(Model model){
        User user = new User();
        String name="123";
        /*redisClient.set1("base:user:11","nn");
        String name = stringRedisTemplate.opsForValue().get("base:user:11");*/
        user.setName(name);
        model.addAttribute("user",user);
        return "th/thIndex";
    }
    @RequestMapping("testInert")
    @ResponseBody
    public Object testInert(){
        User user = new User();
        user.setName("zyc");
        userService.add(user);
        System.out.println(user);
        return user;

    }

    @RequestMapping("testSelect")
    @ResponseBody
    public Object testSelect(Integer id){
        return userService.selectAll(id);

    }

}
