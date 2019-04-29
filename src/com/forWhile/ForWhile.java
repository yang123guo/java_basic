package com.forWhile;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-04-30
 * @Description: com.forWhile
 * @version: 1.0
 */
public class ForWhile {

    public static void main(String[] args) {
        for(int x = 10; x < 20; x++) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }

        int[] nums = {2, 4, 6, 66, 71, 9};
        for(int key : nums) {
            System.out.println("内容是：" + key);
        }

        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }

        for(int i : numbers ) {
            if( i == 30 ) {
                continue;
            }
            System.out.print(i);
            System.out.print("\n");
        }
    }
}
