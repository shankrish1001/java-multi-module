package com.shankrish.javamultichild1;

import com.shankrish.javamultiparent1.ParentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/c1")
public class Child1Controller {

    private final ParentService parentService = new ParentService();

    @GetMapping("/show")
    public String showMsg(@RequestParam(defaultValue = "Child-1111") String name) {
        return parentService.showMsg(name);
    }

}

