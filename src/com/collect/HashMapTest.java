package com.collect;

import java.util.*;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-04
 * @Description: com.collect
 * @version: 1.0
 */
public class HashMapTest {

    public static void main(String[] args) {
        // Map<String, String> map = new HashMap<String, String>();
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        // map.keySet() 也有iterator()方法，返回值类型为 Iterator<String>
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();

            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");

        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }
    }
}
