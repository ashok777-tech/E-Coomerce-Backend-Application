package com.ashok.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping(value="/")
    public String greet() {
        return "em chestunnav";
    }
    @RequestMapping(value="/hey")
    public String hey(){
        return "hibruh";
    }
}
