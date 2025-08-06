package com.shankrish.javamultichild2;

import com.shankrish.javamultiparent1.ParentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/c2")
public class Child2Controller {

    private final ParentService parentService = new ParentService();

    @GetMapping("/show")
    public String showMsg(@RequestParam(defaultValue = "Child2222") String name) {
        return parentService.showMsg(name);
    }

}
