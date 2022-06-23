package com.finaltest.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class hellocontroler {
    private static final String template="hello,%s!";
    private final AtomicLong counter =new AtomicLong();

    @GetMapping("/hellotest")
    public hellotest hellotest(@RequestParam(value="name",defaultValue="World")String name){
        return new hellotest(counter.incrementAndGet(),String.format(template,name));
    }
}
