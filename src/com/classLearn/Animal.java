package com.classLearn;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-01
 * @Description: com.classLearn
 * @version: 1.0
 */
public class Animal {
    private String name;
    private int id;
    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println(name + "正在吃");
    }
    public void sleep(){
        System.out.println(name + "正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
    public void move(){
        System.out.println("动物可以移动");
    }
}
