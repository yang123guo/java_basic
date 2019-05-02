package com.polymorphic;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-02
 * @Description: com.polymorphic
 * @version: 1.0
 */
public class PloyTest {
    // 静态方法，参数是父类的类型
    public static void show(Animal a)  {
        a.eat();
        // 类型判断（多态）
        if (a instanceof Cat)  {  // 猫做的事情
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof Dog) { // 狗做的事情
            Dog c = (Dog)a;
            c.work();
        }
    }

    public static void main(String[] args) {
        // 以 Cat 对象调用 show 方法
        // Cat的eat方法， Cat的work方法
        show(new Cat());

        // 以 Dog 对象调用 show 方法
        // Dog的eat方法， Dog的work方法
        show(new Dog());

        // 上面的方法是多态的实现


        // 下面的方法：不用show执行同样的方法

        // 向上转型
        Animal a = new Cat();
        a.eat();               // 调用的是 Cat 的 eat

        // 向下转型
        Cat c = (Cat)a;
        c.work();
    }
}
