package bobo.learn.di;

/**
 * Created by max on 17-2-16.
 */
public class BookServiceImpl implements BookService{
    public BookDaoImpl bookDao;
    @Override
    public void addBook() {
        bookDao.addBook();
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }

    public void myInit(){
        System.out.println("初始化...");
    }

    public void myDestroy(){
        System.out.println("销毁...");
    }
}
