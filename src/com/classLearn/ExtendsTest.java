package com.classLearn;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-01
 * @Description: com.classLearn
 * @version: 1.0
 */
public class ExtendsTest {

    public static void main(String[] args) {
        Penguin penguin = new Penguin("小企鹅", 11111);
        Mouse mouse = new Mouse("小耗子", 22222);
        penguin.eat();
        mouse.sleep();

        // 重写Override
        penguin.move();
        mouse.move();
    }
}
