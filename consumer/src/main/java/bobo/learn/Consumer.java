package bobo.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by max on 17-5-16.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        classPathXmlApplicationContext.start();

        User userServiceInterface = (User) classPathXmlApplicationContext.getBean("userServiceInterface");
        userServiceInterface.addUser("I am consumer! Who called me??");

        System.in.read();
    }
}
