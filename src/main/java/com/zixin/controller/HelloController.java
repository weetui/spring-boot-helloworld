package com.zixin.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Louis
 * @version 1.0.0
 * @blog http://blog.weetui.com
 *
 */
@EnableAutoConfiguration
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "what is webhooks fuck...This is OK?");
        return "index";
    }

}
