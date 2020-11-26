package org.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class TestController {


    @ResponseBody
    @RequestMapping(value = "/view")
    public Object view(HttpServletRequest request, HttpServletResponse response){
            return "wocao";
    }


	@RequestMapping(value = "/viewData")
	public Object viewData(String name, Map<String,String> map,HttpServletRequest request, HttpServletResponse response){
		return "/index.jsp";
	}


}
