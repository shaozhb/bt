package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhibin.shao on 2017/12/7.
 */
@Controller
@RequestMapping("/t")
public class test1 {

    @RequestMapping("/test1")
    public String getTest(){
        return "test1";
    }


}
