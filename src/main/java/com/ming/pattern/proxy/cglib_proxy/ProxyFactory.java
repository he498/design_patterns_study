package com.ming.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @version v1.0
 * @ClassNmae: ProxyFactory
 * @Description:
 *      代理对象工厂
 * @Author: Ming on 2022/8/1
 */

public class ProxyFactory implements MethodInterceptor {

    //声明火车站对象
    private TrainStation station = new TrainStation();

    public TrainStation getProxyObject(){
        //创建Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //System.out.println("方法执行了");
        //代理业务代码
        System.out.println("cglib代售点收取一定的服务费用");
        //要调用目标对象的方法
        Object obj = method.invoke(station,objects);

        return obj;
    }
}
