package com.bing.lan.struts2.action;

public class HelloAction /*extends ActionSupport */ {

    public String sayHello() throws Exception {
        System.out.println("HelloAction.sayHello: ");
        return "success";
    }
}
