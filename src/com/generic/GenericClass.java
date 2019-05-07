package com.generic;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-07
 * @Description: 泛型类的例子: 好处是类不同的类可以用来生成 像个工程类
 * @version: 1.0
 */
public class GenericClass<T> {
    private T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    // 泛型类的构造方法
    public GenericClass(T ob) {
        this.ob = ob;
    }

    public void showType() {
        System.out.println("T的实际类型是：" + ob.getClass().getName());
    }
}
