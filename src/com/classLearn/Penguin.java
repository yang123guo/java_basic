package com.classLearn;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-01
 * @Description: com.classLearn
 * @version: 1.0
 */
public class Penguin extends Animal {
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }
    public void move(){
        System.out.println("企鹅水里游");
    }
}
