package com.huotn.webmagic.jdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Description: JdbcUtil
 * @Company: 深圳市东深电子股份有限公司
 * @Auther: leichengyang
 * @Date: 2019/6/28 0028
 * @Version 1.0
 */
public class JdbcUtil {

    public Connection conn = null;
    public Statement stmt = null;

    public JdbcUtil() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/user_tb?"
                    + "user=root&password=root&useUnicode=true&characterEncoding=UTF8";
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
