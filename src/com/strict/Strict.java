package com.strict;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-07
 * @Description: com.strict
 * @version: 1.0
 */
public class Strict {
    static {
        System.out.println("Student 静态代码块");
    }

    {
        System.out.println("Student 构造代码块");
    }

    public Strict() {
        System.out.println("Student 构造方法");
    }
}
