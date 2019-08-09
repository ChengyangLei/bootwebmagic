package com.huotn.webmagic.vaccine;

/**
 * @Description: Vaccine
 * @Company: 深圳市东深电子股份有限公司
 * @Auther: leichengyang
 * @Date: 2019/6/28 0028
 * @Version 1.0
 */
public class Vaccine {

    private String id;
    private String name;
    private String addr;
    private String tel;
    private String onTime;

    private String areaName;

    public Vaccine(String id, String name, String addr, String tel, String onTime, String areaName) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.tel = tel;
        this.onTime = onTime;
        this.areaName = areaName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOnTime() {
        return onTime;
    }

    public void setOnTime(String onTime) {
        this.onTime = onTime;
    }
}
