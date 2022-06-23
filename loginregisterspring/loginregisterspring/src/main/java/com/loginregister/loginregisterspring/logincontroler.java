package com.loginregister.loginregisterspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
@RestController
public class logincontroler {
    private static final String template="hello boss,%s!";
    private final AtomicLong counter =new AtomicLong();

    @GetMapping("/logintest")
    public logintest logintest(@RequestParam(value="name",defaultValue="World")String name){
        return new logintest(counter.incrementAndGet(),String.format(template,name));
    }
}
