package JDBC.JdbcTeamplate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:jdbc.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 添加，修改，删除
    @Test
    public void testUpdate(){
        // 1. 添加
        // 第一步 sql query
        String sql = "INSERT INTO t_emp VALUES(NULL,?,?,?)";
        // 第二步 调用template方法，传递参数
        int rows = jdbcTemplate.update(sql, "无名之辈",999,"未知");
        System.out.println("Affeted rows: " + rows);
    }

    @Test
    public void amend(){
        // 2. 修改
        // 第一步 sql query
        String sql = "UPDATE t_emp SET gender=? WHERE id=?";
        // 第二步 调用template方法，传递参数
        int rows = jdbcTemplate.update(sql, "女",4);
        System.out.println("Affeted rows: " + rows);
    }

    @Test
    public void delete(){
        // 2. 删除
        // 第一步 sql query
        String sql = "DELETE FROM t_emp WHERE id=?";
        // 第二步 调用template方法，传递参数
        int rows = jdbcTemplate.update(sql, 5);
        System.out.println("Affeted rows: " + rows);
    }

    // 返回对象
    @Test
    public void searchObject(){
        String sql = "SELECT * FROM t_emp where id=?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp);
    }

    // 返回集合
    @Test
    public void searchList(){
        String sql = "SELECT * FROM t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }

    // 返回单个值
    @Test
    public void searchSingle(){
        String sql = "SELECT COUNT(*) FROM t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("There are " + count + " employees in your company");
    }
}
