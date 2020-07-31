package dynamicproxymode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @ClassName UserProxy@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
 * @Date 2020/7/31 11:35
 **/
public class UserProxy implements InvocationHandler {
    private Object object;
    public UserProxy(Object target) {
        this.object = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK接口动态代理-开始保存用户");
        Object result = method.invoke(object, args);
        System.out.println("JDK接口动态代理-保存用户结果: " + result);
        System.out.println();
        return result;
    }
    public Object getInstance() {
        Object o = Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
        return o;
    }

}
