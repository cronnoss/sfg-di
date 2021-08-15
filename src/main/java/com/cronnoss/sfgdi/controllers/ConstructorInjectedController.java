package com.cronnoss.sfgdi.controllers;

import com.cronnoss.sfgdi.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
