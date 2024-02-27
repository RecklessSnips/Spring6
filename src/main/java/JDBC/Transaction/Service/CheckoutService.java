package JDBC.Transaction.Service;

// 掩饰事务的传播行为
public interface CheckoutService {
    //能够一次买多本书
    void checkout(Integer userID, Integer[] bookIDs);
}
