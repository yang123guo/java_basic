package com.collect;

import java.util.*;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-04
 * @Description: com.collect
 * @version: 1.0
 */
public class ArrayListTest {
    public static void main(String[] args) {

        //List<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();
        list.add("您好");
        list.add("羊羊羊");

        // 第一种遍历方法使用foreach遍历List
        for (String str : list) {  // 也可以改写for(int i=0;i<list.size();i++)这种形式
            System.out.println(str);
        }

        // 第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) { //这里也可以改写为  foreach(String str:strArray)这种形式
            System.out.println(strArray[i]);
        }

        //
        for (int i = 0; i < list.size(); i++) { //这里也可以改写为  foreach(String str:strArray)这种形式
            System.out.println(list.get(i));
        }

        //第三种遍历 使用 迭代器 进行相关遍历
        Iterator<String> ite = list.iterator();  // 获取迭代器
        while (ite.hasNext()) { // 判断下一个元素之后有值
            System.out.println(ite.next());
        }
    }
}
