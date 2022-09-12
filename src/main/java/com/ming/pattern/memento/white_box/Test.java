package com.ming.pattern.memento.white_box;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/12
 */

public class Test {
    public static void main(String[] args) {
        System.out.println("-----------大战boss前------------");
        //创建游戏角色对象
        GameRole g1 = new GameRole();
        g1.initState();//初始状态操作
        g1.stateDisplay();
        //将状态备份
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(g1.saveState());
        System.out.println("-----------大战boss后------------");
        g1.fight();
        g1.stateDisplay();
        System.out.println("-----------恢复------------");
        g1.recoverState(roleStateCaretaker.getRoleStateMemento());
        g1.stateDisplay();
    }
}
