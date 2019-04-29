package com.modifier;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-04-30
 * @Description: com.modifier
 * @version: 1.0
 */
public class FinalFuncTest extends FinalFunc{
    /**
     *    无法被覆盖
     *     public void getFinalName() {
     *         System.out.println("我特意来重写父类方法");
     *     }
     */

    public void getFinalVal() {
        System.out.println("我子类中重写了");
    }

    public static void main(String[] args) {
        FinalFuncTest finalFuncTest = new FinalFuncTest();
        finalFuncTest.getFinalName();
        finalFuncTest.getFinalVal();
    }
}
