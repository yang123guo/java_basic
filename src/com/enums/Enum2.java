package com.enums;

/**
 * @Auther: yangguoqiang01
 * @Date: 2020-03-18
 * @Description: com.enums
 * @version: 1.0
 */
public enum Enum2 {
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"),
    WINTER("冬天");

    private String name;

    // 因为有String作为参数，所以此构造函数不能省略
    // 枚举构造器修饰符是 private，会自动补充上
    Enum2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
