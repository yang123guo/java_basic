package com.yang;

public class HelloWorld {

    /**
     * 功能描述:
     * @param:
     * @return:
     * @auther:
     * @date:
     */
    int a = 1;

    public int test(int num) {
        return a + num;
    }

    // 静态的私有变量
    private static double salaty;

    // 常量
    public static final String TYPE = "工程师";

    public static void main(String[] args) {
        final String NAME = "我是name，是一个常量";
        System.out.println(NAME);

        HelloWorld hello = new HelloWorld();
        System.out.println(hello.test(2));

        salaty = 10.0;

        System.out.println(TYPE + "薪资是：" + salaty);
    }
}
