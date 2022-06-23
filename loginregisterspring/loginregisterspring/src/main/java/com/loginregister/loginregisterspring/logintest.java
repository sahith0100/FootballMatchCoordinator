package com.loginregister.loginregisterspring;

public class logintest
{    private final long id;
    private final String content;

    public logintest(long id,String content){
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
