package com.freshworks.com.domain;

public class MyServiceS
{

    private final long id;
    private final String content;

    public MyServiceS(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
