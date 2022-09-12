package com.ming.pattern.interpreter;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/12
 */

public class Test {
    public static void main(String[] args) {
        //创建环境对象
        Context context = new Context();
        //创建多个变量对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        //将变量存储到环境对象中
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);
        //获取抽象语法树 a + b - c + d
        AbstractExpression expression = new Minus(a,new Plus(new Minus(b,c),d)); // a - [(b - c) + d]
        //解释
        int result = expression.interpret(context);
        System.out.println(expression);
        System.out.println(result);
    }
}
