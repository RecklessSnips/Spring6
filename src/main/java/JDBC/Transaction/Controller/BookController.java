package JDBC.Transaction.Controller;

import JDBC.Transaction.Service.BookService;
import JDBC.Transaction.Service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller(value = "book")
public class BookController {

    @Autowired
    @Qualifier("service")
    private BookService bookService;

    @Autowired
    @Qualifier(value = "checkout")
    private CheckoutService checkoutService;

    public void buyBook(Integer userID, Integer bookID){
        bookService.buyBook(userID, bookID);
    }

    public void checkout(Integer userID, Integer[] bookID){
        checkoutService.checkout(userID, bookID);
    }
}
