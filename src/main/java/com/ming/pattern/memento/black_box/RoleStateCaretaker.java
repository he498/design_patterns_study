package com.ming.pattern.memento.black_box;



/**
 * @version v1.0
 * @ClassNmae: RoleStateCaretaker
 * @Description:
 * @Author: Ming on 2022/8/12
 */

//备忘录对象管理对象
public class RoleStateCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
