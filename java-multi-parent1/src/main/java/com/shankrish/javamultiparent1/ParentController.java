package com.shankrish.javamultiparent1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ParentController {
    @GetMapping
    public String getTest() {
        return "Hello world from parent module";
    }
}
