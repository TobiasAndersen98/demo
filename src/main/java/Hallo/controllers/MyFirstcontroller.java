package Hallo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyFirstcontroller {

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "HEJ";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!!";
    }

    @GetMapping("/calc")
    @ResponseBody
    public String calc(@RequestParam int input){
        return "" + input*input;
    }
}
