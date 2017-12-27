package com.example.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class Application {

    @RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello World");
        return "hello";

    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }


}
