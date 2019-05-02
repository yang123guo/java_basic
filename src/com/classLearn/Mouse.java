package com.classLearn;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-01
 * @Description: com.classLearn
 * @version: 1.0
 */
public class Mouse extends Animal {
    public Mouse(String myName, int myid) {
        super(myName, myid);
    }
    public void move(){
        // 应用super类的方法 super执行父类的方法
        super.move();
        System.out.println("老鼠钻墙角");
    }
}
