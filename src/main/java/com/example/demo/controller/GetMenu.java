package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.po.State;
import com.example.demo.po.User;
import com.example.demo.po.menu;
import com.example.demo.serverce.IMenuServerce;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 2.0
 */
@RequestMapping("/menu")
@RestController
public class GetMenu {

    @Resource
    private IMenuServerce menuServerce;

    @RequestMapping("/getmenu")
    public List<menu> getmenu(){
        List<menu> menu = menuServerce.getmenu(0);
        System.out.println("测试："+menu);
        return menu;
    }

    @RequestMapping("/getall")
    public menu getall(){
        System.out.println("测试：");
        menu m = new menu();
        m.setName("haha");
        m.setMenuId(250);
        return m;
    }
    @RequestMapping("/login")
    public State login(@RequestBody User user){
        System.out.println(user.toString()+user.getUsername());
        if(user.getUsername().equals("baoxun")&&user.getPassword().equals("1234")){
            System.out.println("来了");
            State state = new State();
            state.setSuccess(true);
            return state;
        }else {
            System.out.println("错误");
            State state = new State();
            state.setSuccess(false);
            return state;
        }

    }
    @RequestMapping("/login1")
    public State login1(){
        State state = new State();
        state.setSuccess(true);
        return state;
    }
}
