package com.yang;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-04-29
 * @Description: com.yang
 * @version: 1.0
 */
public class Puppy {

    // 构造函数
    public Puppy(String name) {
        System.out.println("小狗的名字是：" + name);
    }

    // control + enter 快速生成get和set方法
    int puppyAge;

    public int getPuppyAge() {
        System.out.println("小狗的年龄是：" + puppyAge);
        return puppyAge;
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy("tom");
        puppy.setPuppyAge(4);

        /**
         * 功能描述: get可以通过方法或者 . 的形式获取
         * @param:
         * @return:
         * @auther:
         * @date:
         */
        puppy.getPuppyAge();
        System.out.println("变量值：" + puppy.puppyAge);
    }

}
