package com.func;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-04-30
 * @Description: com.func
 * @version: 1.0
 */
public class FuncTest {

    /** 返回两个整数变量较大的值 */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }

    /** 方法的重载 */
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    // 可变参数
    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i <  numbers.length; i++){
            if (numbers[i] >  result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

    /** 主方法 */
    public static void main(String[] args) {
        int i = 5;
        int j = 2;

        // 方法可以不被类使用
        int k = max(i, j);
        double ki = max(2.4, 3.5);
        System.out.println( i + " 和 " + j + " 比较，最大值是：" + k);
        System.out.println( "比较大值是：" + ki);
    }
}
