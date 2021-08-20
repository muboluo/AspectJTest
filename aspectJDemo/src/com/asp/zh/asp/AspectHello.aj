package com.asp.zh.asp;

public aspect AspectHello { // 定义Aspect方面类

    void around():call(void com.asp.zh.Hello.sayHello()){

        System.out.println("begin transition");

        proceed();

        System.out.println("end transition");

    }
}
