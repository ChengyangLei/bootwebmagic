package com.huotn.webmagic;

import com.huotn.webmagic.vaccine.Vaccine;
import com.huotn.webmagic.vaccine.VaccineDao;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.List;
import java.util.UUID;

/**
 * 获取疫苗数据
 *
 * @author code4crafer@gmail.com
 */
public class TestGetVaccinePageProcessor implements PageProcessor {
    public void process(Page page) {

        Html html = page.getHtml();
        //区信息
        List<String> areaList = html.xpath("/html/body/div[5]/div/div[2]/div[1]/ul/li/text()").all();
        List<String> vaccineTableList = html.xpath("/html/body/div[5]/div/div[2]/div[2]/div").all();


        if (areaList != null && vaccineTableList.size() > 0) {
            for (int i = 1; i <= vaccineTableList.size(); i++) {
                List<String> vaccineTrList = html.xpath("/html/body/div[5]/div/div[2]/div[2]/div[" + i + "]/table/tbody/tr").all();
                String areaName = areaList.get(i - 1);
                for (int j = 0; j < vaccineTrList.size(); j++) {
                    Html tempHtml = Html.create("<table>" + vaccineTrList.get(j) + "</table>");
                    String num = tempHtml.xpath("//tbody/tr[1]/td[1]/text()").toString();
                    String name = tempHtml.xpath("//tbody/tr[1]/td[2]/text()").toString();
                    String addr = tempHtml.xpath("//tbody/tr[1]/td[3]/text()").toString();
                    String tel = tempHtml.xpath("//tbody/tr[1]/td[4]/text()").toString();
                    String onTime = tempHtml.xpath("//tbody/tr[1]/td[5]/text()").toString();
                    Vaccine vaccine = new Vaccine(UUID.randomUUID().toString(), name, addr, tel, onTime, areaName);
                    new VaccineDao().add(vaccine);
                }
            }
        }

    }

    @Override
    public Site getSite() {
        return Site.me();
    }

    public static void main(String[] args) {
        Spider.create(new TestGetVaccinePageProcessor()).test("https://www.whcdc.org/index.php/show/18.html");
    }
}
