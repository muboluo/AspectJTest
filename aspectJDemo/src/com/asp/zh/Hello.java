package com.asp.zh;

public class Hello {


    private String privateStr;

    public String publicStr;

    public static String staticStr = "staticStr";


    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello();
    }

    public void sayHello() {
        System.out.println("com.asp.zh.Hello, AspectJ!");
    }


    public void sayHelloWithParam(String param1) {


        System.out.println("sayHelloWithParam " + param1);
    }


    public void sayHelloWithParam(String param1, String param2) {


        System.out.println("sayHelloWithParam " + param1 + param2);
    }

    public String sayHelloWithReturn() {

        System.out.println("Say Hello sayHelloWithReturn ");
        return "sayHelloWithReturn";

    }

    public String sayHelloWithParamAndReturn(String param1, String param2) {

        System.out.println("sayHelloWithParamAndReturn " + param1 + param2);

        return param1 + param2;
    }

    public static String staticSayHello(String param1, String param2) {

        System.out.println("staticSayHello " + param1 + param2);

        return param1 + param2;
    }
}
