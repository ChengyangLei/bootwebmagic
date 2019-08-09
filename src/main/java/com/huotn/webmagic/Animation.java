package com.huotn.webmagic;

import java.util.Date;

/**
 * @Description: Animation
 * @Company: 深圳市东深电子股份有限公司
 * @Auther: leichengyang
 * @Date: 2019/7/24 0024
 * @Version 1.0
 */
public class Animation {

    private String id;

    private String linkUrl ;
    private String  imgUrl ;
    private String name  ;
    private String author ;
    private String introduce  ;
    private String tags  ;
    private String popularity ;
    private String rank  ;

    private Date createTime;

    public Animation(String id, String linkUrl, String imgUrl, String name, String author, String introduce, String tags, String popularity, String rank) {
        this.id = id;
        this.linkUrl = linkUrl;
        this.imgUrl = imgUrl;
        this.name = name;
        this.author = author;
        this.introduce = introduce;
        this.tags = tags;
        this.popularity = popularity;
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
