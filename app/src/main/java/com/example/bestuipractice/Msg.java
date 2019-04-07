package com.example.bestuipractice;

public class Msg {

    static int TYPE_RECEIVED = 0;
    static int TYPE_SEND = 2;

    private String content;
    private int type;

    public Msg(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }


}
