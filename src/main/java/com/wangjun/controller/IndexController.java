package com.wangjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/5
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String test(){
        return "index";
    }

}
