import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by max on 17-5-16.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        classPathXmlApplicationContext.start();
        System.in.read();
    }
}
