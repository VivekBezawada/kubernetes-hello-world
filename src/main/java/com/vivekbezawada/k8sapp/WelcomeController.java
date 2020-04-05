package com.vivekbezawada.k8sapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

    private static final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public WelcomeModel greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new WelcomeModel(String.format(template, name));
    }
}
