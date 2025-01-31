package com.example.FirstSpring;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Hello World");
    }
    @GetMapping("/hello/{name}")
    public HelloResponse helloParam(@PathVariable String name){
        return new HelloResponse("Hello " + name );
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello " + name + "!");
    }
}
