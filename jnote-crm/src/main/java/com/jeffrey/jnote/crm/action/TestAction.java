package com.jeffrey.jnote.crm.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/")
public class TestAction {

    @RequestMapping("test")
    public String test(){ return "/config/test";}
}
