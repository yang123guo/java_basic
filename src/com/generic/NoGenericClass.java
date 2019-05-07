package com.generic;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-07
 * @Description: 不用泛型<> 只能定义Object类型了
 * @version: 1.0
 */
public class NoGenericClass {

    private Object ob; // 定义一个通用类型成员

    public NoGenericClass(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }

    public void setOb(Object ob) {
        this.ob = ob;
    }

    public void showTyep() {
        System.out.println("T的实际类型是: " + ob.getClass().getName());
    }

}
