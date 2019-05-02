package com.polymorphic;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-02
 * @Description: com.polymorphic
 * @version: 1.0
 */
class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}
