package com.ming.pattern.memento.white_box;

/**
 * @version v1.0
 * @ClassNmae: RoleStateCaretaker
 * @Description:
 * @Author: Ming on 2022/8/12
 */

//备忘录对象管理对象
public class RoleStateCaretaker {
    //声明RoleStateMemento 类型的变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
