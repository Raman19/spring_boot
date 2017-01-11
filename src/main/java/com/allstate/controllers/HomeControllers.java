package com.allstate.controllers;

import com.allstate.models.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeControllers {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    private Hello home(){
        Hello h = new Hello("Hello Spring");
        return h;
    }
}
