package com.modifier;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-04-30
 * @Description: com.modifier
 * @version: 1.0
 */
public class FinalFunc {
    public final void getFinalName() {
        System.out.println("我是一个final修饰的方法，不能被子类重写");
    }
    public void getFinalVal() {
        System.out.println("我是一个可以被子类重写");
    }
}
