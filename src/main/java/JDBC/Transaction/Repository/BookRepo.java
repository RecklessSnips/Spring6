package JDBC.Transaction.Repository;

public interface BookRepo {

    Integer getBookPriceByID(Integer bookID);
    void decreaseStock(Integer bookID);
    void updateUserBalance(Integer userID, Integer bookPrice);
}
