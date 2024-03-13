package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // view 가 리턴됌
public class indexController {

    @GetMapping({"","/"})
    public String index(){

        return "index";
    }

    @GetMapping("/user")
    public @ResponseBody String user(){
        return "user";
    }

    @GetMapping("/admin")
    public @ResponseBody String admin(){
        return "admin";
    }

    @GetMapping("/manager")
    public @ResponseBody  String manager(){
        return "manager";
    }

    // 스프링 시큐리티 해당주소를 낚아채버림 - SecurityConfig 파일생성후
    @GetMapping("/login")
    public @ResponseBody  String login(){
        return "login";
    }

    @GetMapping("/join")
    public @ResponseBody  String join(){
        return "join";
    }

    @GetMapping("/joinProc")
    public @ResponseBody String joinProc(){
        return "회원가입 완료됨";
    }


}
