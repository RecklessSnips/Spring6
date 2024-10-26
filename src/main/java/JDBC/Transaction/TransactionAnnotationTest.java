package JDBC.Transaction;

import JDBC.Transaction.Config.SpringConfiguration;
import JDBC.Transaction.Controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionAnnotationTest {
    private final ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(SpringConfiguration.class);
    private final BookController bookController =
            applicationContext.getBean("book", BookController.class);
    @Test
    public void testAnnotation(){
        bookController.buyBook(1,1);
    }

    @Test
    public void testCheckout(){
        Integer[] books = {1, 2};
        Integer userID = 1;
        bookController.checkout(userID, books);
    }
}
