package org.training.messagingapiapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping
    public String printGreetings2() {
        return "Hi Guest !!";
    }

    @GetMapping("oracle")
    public String printGreetings() {
        return "Hi Oracle !!";
    }


}
