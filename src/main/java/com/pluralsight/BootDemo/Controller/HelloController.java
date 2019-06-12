package com.pluralsight.BootDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping ("/publishes")
    public String publico () {
        return "Public Page";
    }


    @RequestMapping ("/admin")
    public String admin () {
        return "Administrator Page";
    }

    @RequestMapping ("/private")
    public String privato () {
        return "Private Page";
    }
}