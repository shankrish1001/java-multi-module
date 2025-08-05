package com.shankrish.javamultichild1;

import com.shankrish.javamultiparent1.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/c1")
public class GreetingController {

    private final GreetingService greetingService = new GreetingService();

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "-Child-1111-") String name) {
        return greetingService.greet(name);
    }

}

