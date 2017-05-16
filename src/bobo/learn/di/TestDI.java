package bobo.learn.di;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by max on 17-2-16.
 */
public class TestDI {
    @Test
    public void testDi(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bobo/learn/di/bean.xml");
//        BookService bookServiceId = (BookService) classPathXmlApplicationContext.getBean("bookServiceId");
//        bookServiceId.addBook();
    }
}
