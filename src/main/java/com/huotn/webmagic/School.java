package com.huotn.webmagic;

/**
 * @Description: School
 * @Company: 深圳市东深电子股份有限公司
 * @Auther: leichengyang
 * @Date: 2019/5/22
 * @Version 1.0
 */
public class School {

    private String id;
    private String code;
    private String name;
    private String type;
    private String master;
    private String address;
    private String mobile;
    private String teacher;
    private String gernaral;
    private String level;

    public School(String id, String code, String name, String type, String master, String address, String mobile, String teacher, String gernaral, String level) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.type = type;
        this.master = master;
        this.address = address;
        this.mobile = mobile;
        this.teacher = teacher;
        this.gernaral = gernaral;
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getGernaral() {
        return gernaral;
    }

    public void setGernaral(String gernaral) {
        this.gernaral = gernaral;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
