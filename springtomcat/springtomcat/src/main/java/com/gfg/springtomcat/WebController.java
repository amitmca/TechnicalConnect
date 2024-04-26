package com.gfg.springtomcat;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class WebController {
    @GetMapping("/hello")
    public String getVersion() {
        return "Hello World";
    }
}