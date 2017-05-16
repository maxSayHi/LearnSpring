package bobo.learn.ioc;

/**
 * Created by max on 17-2-16.
 */
public class UserImpl implements User{
    @Override
    public void delUser() {
        System.out.println("User deleted!");
    }

    public void myInit() {
        System.out.println("init!!!!!");
    }

    public void myDestory() {
        System.out.println("destory!!!!!");
    }

}
