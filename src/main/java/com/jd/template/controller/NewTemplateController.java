package com.jd.template.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class NewTemplateController {
    private static final String STATIC_MESSAGE = "我收到消息了";


    @RequestMapping("/test")
    @ResponseBody
    public String testMyTempalte(String message){

        return STATIC_MESSAGE+message;
    }


    @RequestMapping("/t")
    @ResponseBody
    public String testMyTempalte12(){

        return STATIC_MESSAGE;
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ModelAndView testMyTempalte2(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }




}