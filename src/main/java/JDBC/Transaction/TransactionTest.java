package JDBC.Transaction;

import JDBC.Transaction.Controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// classpath:jdbc.xml 不能有空格！
@SpringJUnitConfig(locations = "classpath:jdbc.xml")
public class TransactionTest{

    @Autowired
    @Qualifier(value = "book")
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(1, 1);
    }

    @Test
    public void testCheckout(){
        Integer[] books = {1, 2};
        Integer userID = 1;
        bookController.checkout(userID, books);
    }
}
