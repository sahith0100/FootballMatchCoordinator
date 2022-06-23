package com.finaltest.demo;

public class hellotest {
    private final long id;
    private final String content;
    public hellotest(long id,String content){
        this.id=id;
        this.content=content;
    }
    public long getId(){
        return id;
    }
    public String getcontent(){
        return content;
    }
}
