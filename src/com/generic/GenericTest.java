package com.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-06
 * @Description: com.generic
 * @version: 1.0
 */
public class GenericTest {

    public static void main(String[] args) {
        /*
        List arrList = new ArrayList();
        arrList.add("aaaa");
        arrList.add(100);

        for(int i = 0; i < arrList.size(); i ++) {
            // 报错java.lang.Integer cannot be cast to java.lang.String
            String item = (String)arrList.get(i);
            System.out.println("泛型测试：" + item);
        }*/

        List<String> arrList = new ArrayList<String>();
        arrList.add("aaaa");
        arrList.add("1000");
        arrList.add("dege");
        for(String item : arrList) {
            System.out.println("泛型测试：" + item);
        }
    }
}
