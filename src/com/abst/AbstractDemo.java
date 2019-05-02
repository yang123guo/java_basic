package com.abst;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-03
 * @Description: com.abst
 * @version: 1.0
 */
public class AbstractDemo {
    public static void main(String [] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        s.mailCheck();

        e.mailCheck();
    }
}
