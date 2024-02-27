package JDBC.Transaction.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "repo")
public class BookRepoImpl implements BookRepo{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void affectRow(int row){
        System.out.println("Affected rows: " + row);
    }
    // 根据id查询价格
    public Integer getBookPriceByID(Integer bookID) {
        // 准备sql语句
        String sql = "SELECT price FROM t_book WHERE book_id=?";
        // 通过template拿取数据
        Integer price = jdbcTemplate.queryForObject(sql, Integer.class, bookID);
        System.out.println("Price is " + price);
        return price;
    }

    // 更新图书库存 -1
    public void decreaseStock(Integer bookID) {
        String sql = "UPDATE t_book SET stock = stock - 1 WHERE book_id = ?";
        int row = jdbcTemplate.update(sql, bookID);
        affectRow(row);
    }

    // 更新用户余额
    public void updateUserBalance(Integer userID, Integer bookPrice) {
        String sql = "UPDATE t_user SET balance = balance - ? WHERE user_id = ?";
        int row = jdbcTemplate.update(sql, bookPrice, userID);
        affectRow(row);
    }
}
