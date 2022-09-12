package com.ming.pattern.combination;

/**
 * @version v1.0
 * @ClassNmae: MenuItem
 * @Description:
 * @Author: Ming on 2022/8/8
 */

public class MenuItem extends MenuComponent{

    public MenuItem(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            if (i == level - 1) System.out.print(" -");
            else System.out.print("  ");
        }
        //打印菜单项名称
        System.out.println(name);
    }
}
