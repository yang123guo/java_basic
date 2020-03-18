package com.enums;

/**
 * @Auther: yangguoqiang01
 * @Date: 2020-03-18
 * @Description: com.enums
 * @version: 1.0
 */
public enum Enum3 {
    SPRING(1, "春天"),
    SUMMER(2, "夏天"),
    AUTUMN(3, "秋天"),
    WINTER(4, "冬天");
    private int num;
    private String name;
    Enum3(int num, String name) {
        this.num = num;
        this.name = name;
    }
    public static String getNameByIndex(int num) {
        for (Enum3 e : Enum3.values()) {
            if (e.getNum() == num) {
                return e.getName();
            }
        }
        return null;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
