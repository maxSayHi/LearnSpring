package bobo.learn.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by max on 17-2-16.
 */
public class TestIOC {
    @Test
    public void testIOC(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bobo/learn/ioc/bean.xml");
        User user = (User) classPathXmlApplicationContext.getBean("user");
        user.delUser();
        classPathXmlApplicationContext.destroy();
    }
}
