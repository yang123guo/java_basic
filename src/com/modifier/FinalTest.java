package com.modifier;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-04-30
 * @Description: com.modifier
 * @version: 1.0
 */
public class FinalTest {

    final int VAL = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

    public void changeValue(){
        // VAL = 12; // 将输出一个错误
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        // finalTest.changeValue();
        System.out.println(TITLE + "工龄是：" + BOXWIDTH + "年");
    }
}
