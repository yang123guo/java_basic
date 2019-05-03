package com.interf;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-03
 * @Description: com.interf
 * @version: 1.0
 */
public class MammalInt implements Animal {
    // 实现eat方法
    public void eat() {
        System.out.println("Mammal eats");
    }

    // 实现travel方法
    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String args[]){
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
        m.noOfLegs();
    }
}
