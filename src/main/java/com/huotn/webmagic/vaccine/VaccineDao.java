package com.huotn.webmagic.vaccine;


import com.huotn.webmagic.jdbcUtil.JdbcUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Description: VaccineDao
 * @Company: 深圳市东深电子股份有限公司
 * @Auther: leichengyang
 * @Date: 2019/6/28 0028
 * @Version 1.0
 */
public class VaccineDao extends JdbcUtil {

    public int add(Vaccine vaccine) {
        try {
            String sql = "INSERT INTO `vaccine` (`id`, `name` , `addr`, `tel`, `on_time`, `area_name`) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vaccine.getId());
            ps.setString(2, vaccine.getName());
            ps.setString(3,vaccine.getAddr());
            ps.setString(4, vaccine.getTel());
            ps.setString(5, vaccine.getOnTime());
            ps.setString(6, vaccine.getAreaName());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
