package com.ming.pattern.singleton.demo5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/7/27
 */

public class Test {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);

    }


}
