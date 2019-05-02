package com.abst;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-03
 * @Description: com.abst
 * @version: 1.0
 */
public class Salary extends Employee {
    private double salary; //Annual salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println(getName() + "薪资是：" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        // 设置工资 setSalary 如果大于0 那么赋值
        System.out.println("Salary类的setSalary方法");
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }
}

