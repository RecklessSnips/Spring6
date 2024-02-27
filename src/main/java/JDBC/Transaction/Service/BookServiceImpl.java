package JDBC.Transaction.Service;

import JDBC.Transaction.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "service")
//Propagation.REQUIRED代表将所有有transactional的，放到一个事务中进行处理
//( 就像同一个购物车，如果💰够一次性付清，那么成功，否则一个都买不了 )
//@Transactional(propagation = Propagation.REQUIRED)
//Propagation.REQUIRED_NEW不管有无事务，都会开启一个新的事务，去处理
//( 就像一次次付款，能付得起的就买了，付不起的就买不了! )
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class BookServiceImpl implements BookService{

    @Autowired
    @Qualifier(value = "repo")
    private BookRepo bookRepo;

    @Override
    public void buyBook(Integer userID, Integer bookID){
        // 根据id查询价格
        Integer price = bookRepo.getBookPriceByID(bookID);
        // 图书库存-1
        bookRepo.decreaseStock(bookID);
        // 用户余额-1
        bookRepo.updateUserBalance(userID, price);
    }
}
