package com.strict;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-07
 * @Description: com.strict
 * @version: 1.0
 */
public class StrictTest {
    static {
        System.out.println("Demo2_Student 静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("我是main方法");

        Strict s1 = new Strict();
        Strict s2 = new Strict();
    }
}
