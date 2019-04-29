package com.modifier;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-04-30
 * @Description: com.modifier
 * @version: 1.0
 * @tips: 静态变量: 无论一个类实例化多少对象，它的静态变量只有一份拷贝
 */
public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " +
                InstanceCounter.getCount() + " instances");

        // 这里创建了500次实例，因为同指向同一个静态变量，所以变量增加了。
        for (int i = 0; i < 500; ++i){
            new InstanceCounter();
        }

        System.out.println("Created " +
                InstanceCounter.getCount() + " instances");
    }
}
