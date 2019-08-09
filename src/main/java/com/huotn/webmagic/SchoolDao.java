package com.huotn.webmagic;


import com.huotn.webmagic.jdbcUtil.JdbcUtil;

import java.sql.*;

/**
 * @Description: SchoolDao
 * @Company: 深圳市东深电子股份有限公司
 * @Auther: leichengyang
 * @Date: 2019/5/22
 * @Version 1.0
 */
public class SchoolDao extends JdbcUtil {




    public int add(School csdnBlog) {
        try {
            String sql = "INSERT INTO `school` (`id`, `code`, `name` , `type`, `master`, `address`, `mobile`, `teacher`, `gernaral`,`level`) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, csdnBlog.getId());
            ps.setString(2, csdnBlog.getCode());
            ps.setString(3,csdnBlog.getName());
            ps.setString(4, csdnBlog.getType());
            ps.setString(5, csdnBlog.getMaster());
            ps.setString(6, csdnBlog.getAddress());
            ps.setString(7, csdnBlog.getMobile());
            ps.setString(8, csdnBlog.getTeacher());
            ps.setString(9, csdnBlog.getGernaral());
            ps.setString(10, csdnBlog.getLevel());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static void main(String[] args) {
        int sum=259;
        System.out.println(sum%7);
    }

}
