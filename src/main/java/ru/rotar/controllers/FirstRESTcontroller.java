package ru.rotar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
// проверочный реквест показывает что сервис работает
@RestController
@RequestMapping("/api")
public class FirstRESTcontroller {
    //@ResponseBody
    @GetMapping("/seyHello")
    public String sayHello() {
        return "hello world my new project";
    }
}
