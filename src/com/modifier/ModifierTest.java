package com.modifier;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-04-30
 * @Description: com.modifier
 * @version: 1.0
 */
public class ModifierTest {

    public static void main(String[] args) {
        ModifierClass modifierClass = new ModifierClass();
        String firstVal = modifierClass.getPrivateSting();
        System.out.println(firstVal);

        modifierClass.setPrivateSting("修改后的内容");
        String secVal = modifierClass.getPrivateSting();
        System.out.println(secVal);
        
        /*
            不可以在其他地方访问private修饰的变量
            System.out.println(modifierClass.privateSting);
        */
    }
}
