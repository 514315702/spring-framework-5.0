package org.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {


    @ResponseBody
    @RequestMapping(value = "/view")
    public Object view(String name, HttpServletRequest request, HttpServletResponse response){
            return "wocao";
    }


}
