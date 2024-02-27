package JDBC.Transaction.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "checkout")
public class CheckoutServiceImpl implements CheckoutService{

    // 注入bookService，买一本书的情况
    @Autowired
    @Qualifier(value = "service")
    private BookService bookService;

    @Transactional
    @Override
    public void checkout(Integer userID, Integer[] bookIDs) {
        for(Integer ids: bookIDs){
            bookService.buyBook(userID, ids);
        }
    }
}
