package com.ming.pattern.decorator;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/7
 */

public class Test {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.cost());
        System.out.println("===================");
        //在上面炒饭中加鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost());
        System.out.println("===================");
        //再加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost());
        //加一个培根
        food = new Bacon(food);
        System.out.println(food.getDesc() + " " + food.cost());


    }
}
