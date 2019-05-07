package com.generic;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-07
 * @Description: com.generic
 * @version: 1.0
 */
public class GenericClassTest {

    public static void main(String[] args) {

        // 注意这个泛型类的使用：
        GenericClass<Integer> intOb = new GenericClass<>(88);
        intOb.showType();
        intOb.setOb(12);
        System.out.println(intOb.getOb());

        GenericClass<String> strOb = new GenericClass<>("hello");
        strOb.showType();
        System.out.println(strOb.getOb());

        System.out.println("分割线 ------------");

        NoGenericClass noIntOb = new NoGenericClass(new Integer(88));
        noIntOb.showTyep();
        System.out.println(noIntOb.getOb());

        NoGenericClass noStringOb = new NoGenericClass(new String("aaaa"));
        noStringOb.showTyep();
        System.out.println(noStringOb.getOb());

    }
}
