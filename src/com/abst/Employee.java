package com.abst;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-02
 * @Description: com.abst
 * @version: 1.0
 */
public abstract class Employee {
    private String name;
    private String address;
    private int number;

    // 构造方法：
    public Employee(String name, String address, int number) {
        System.out.println("抽象类构造方法");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // 抽象类也有方法的实现
    public double computePay() {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    // 抽象类的方法是不执行的
    public void mailCheck() {
        System.out.println("抽象类的mailCheck");
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}
