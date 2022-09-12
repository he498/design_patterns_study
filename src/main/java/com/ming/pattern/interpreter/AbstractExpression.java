package com.ming.pattern.interpreter;

/**
 * @version v1.0
 * @ClassNmae: AbstractExpression
 * @Description:
 * @Author: Ming on 2022/8/12
 */

//抽象表达式类
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}
