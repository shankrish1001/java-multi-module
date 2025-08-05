package com.shankrish.javamultichild2;

import com.shankrish.javamultiparent1.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/c2")
public class GreetingController {

    private final GreetingService greetingService = new GreetingService();

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Child2222") String name) {
        return greetingService.greet(name);
    }

}
