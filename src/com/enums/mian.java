package com.enums;

/**
 * @Auther: yangguoqiang01
 * @Date: 2020-03-18
 * @Description: com.enums
 * @version: 1.0
 */
public class mian {
    public static void main(String[] args) {
        System.out.println(Enum1.SPRING); // SPRING
        System.out.println(Enum1.values().length); // 4
        // Enum1.values() 是四个项目(SPRING SUMMER AUTUMN WINTER)组成的数组
        for (Enum1 e : Enum1.values()) {
            System.out.println(e); // SPRING SUMMER AUTUMN WINTER
        }

        System.out.println(Enum2.SPRING.getName()); // 春天
        System.out.println(Enum2.SPRING); // SPRING
        for (Enum2 e: Enum2.values()) {
            System.out.println("getName: ~~ " + e.getName()); // 春天 夏天 秋天 冬天
            System.out.println("e: ~~ " + e); // SPRING SUMMER AUTUMN WINTER
            System.out.println("toString: ~~ " + e.toString()); // SPRING SUMMER AUTUMN WINTER
            System.out.println("name: ~~ " + e.name()); // SPRING SUMMER AUTUMN WINTER
        }

        System.out.println(Enum3.SPRING.getName()); // 春天
        System.out.println(Enum3.SPRING.getNum()); // 1
        System.out.println(Enum3.SPRING); // SPRING
        System.out.println(Enum3.SPRING.name()); // SPRING
        System.out.println(Enum3.SPRING.toString()); // SPRING
        for (Enum3 e: Enum3.values()) {
            System.out.println("Enum3 getName: ~~ " + e.getName()); // 春天 夏天 秋天 冬天
            System.out.println("Enum3 getNum: ~~ " + e.getNum()); // 1 2 3 4
            System.out.println("Enum3 e: ~~ " + e); // SPRING SUMMER AUTUMN WINTER
            System.out.println("toString: ~~ " + e.toString()); // SPRING SUMMER AUTUMN WINTER
            System.out.println("name: ~~ " + e.name()); // SPRING SUMMER AUTUMN WINTER
        }
    }
}
