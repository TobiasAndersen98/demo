package Hallo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyFirstcontroller {

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "HEJ";
    }
}
