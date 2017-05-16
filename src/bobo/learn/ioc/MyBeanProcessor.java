package bobo.learn.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by max on 17-2-23.
 */
public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        System.out.println("init before");
        return Proxy.newProxyInstance(MyBeanProcessor.class.getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("调用之前做的勾当..");
                Object delUser = method.invoke(bean, args);
                System.out.println("调用之后做的勾当..");
                return delUser;
            }
        });
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean, String s) throws BeansException {
        System.out.println("init after");
        return bean;
    }
}
