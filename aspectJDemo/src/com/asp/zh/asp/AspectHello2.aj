package com.asp.zh.asp;

// 1 定义 aspect 方面类
public aspect AspectHello2 {

    // 2 定义连接点函数
    pointcut methods():execution(* com.asp.zh.Hello.sayHello());

    // 3 定义通知函数
    before(): methods(){
        System.out.println("before methods");
    }

}
