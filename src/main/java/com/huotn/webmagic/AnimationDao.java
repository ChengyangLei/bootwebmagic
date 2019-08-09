package com.huotn.webmagic;


import com.huotn.webmagic.jdbcUtil.JdbcUtil;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @Description: AnimationDao
 * @Company: 深圳市东深电子股份有限公司
 * @Auther: leichengyang
 * @Date: 2019/7/24 0024
 * @Version 1.0
 */
public class AnimationDao  extends JdbcUtil {

    public void add(List<Animation> animationList) {
            String sql = "INSERT INTO `tb_animation` (`id`, `linkUrl`, `imgUrl` , `name`, `author`, `introduce`, `tags`, `popularity`, `rank`,`createTime`) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            for (int i = 0; i < animationList.size(); i++) {
                Animation animation = animationList.get(i);
                ps.setString(1, animation.getId());
                ps.setString(2, animation.getLinkUrl());
                ps.setString(3, animation.getImgUrl());
                ps.setString(4, animation.getName());
                ps.setString(5, animation.getAuthor());
                ps.setString(6, animation.getIntroduce());
                ps.setString(7, animation.getTags());
                ps.setString(8, animation.getPopularity());
                ps.setString(9, animation.getRank());
                ps.setDate(10,new Date(new java.util.Date().getTime()));
                ps.addBatch();
            }
            ps.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
