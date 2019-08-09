package com.huotn.webmagic;


import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.List;
import java.util.UUID;

/**
 * 获取学校幼儿园数据
 * @author code4crafer@gmail.com
 */
public class TestGetSchoolPageProcessor implements PageProcessor {
    public void process(Page page) {

        Html html = page.getHtml();
        List<String> questionList =  html.xpath("//*[@id=\"article\"]/div[4]/table/tbody/tr/td/table/tbody/tr").all();

        if(questionList != null && questionList.size() > 1)
        {
            //i=0是列名称，所以i从1开始
            for( int i = 1 ; i < questionList.size(); i++)
            {
                Html tempHtml =  Html.create("<table>"+questionList.get(i)+"</table>");
                String code = tempHtml.xpath("//tbody/tr[1]/td[1]/text()").toString();
                String name =  tempHtml.xpath("//tbody/tr[1]/td[2]/text()").toString();
                String type = tempHtml.xpath("//tbody/tr[1]/td[3]/text()").toString();
                String master = tempHtml.xpath("//tbody/tr[1]/td[4]/text()").toString();
                String address =  tempHtml.xpath("//tbody/tr[1]/td[5]/text()").toString();
                String mobile	 = tempHtml.xpath("//tbody/tr[1]/td[6]/text()").toString();
                String teacher = tempHtml.xpath("//tbody/tr[1]/td[7]/text()").toString();
                String gernaral =  tempHtml.xpath("//tbody/tr[1]/td[8]/text()").toString();
                School school = new School(UUID.randomUUID().toString(),code,name,type,master,address,mobile,teacher,gernaral,"1");
                new SchoolDao().add(school);

            }
        }

    }

    @Override
    public Site getSite() {
        return Site.me();
    }

    public static void main(String[] args) {
        Spider.create(new TestGetSchoolPageProcessor()).test("http://jyj.wuhan.gov.cn/news/2014430/n04422961.html");
    }
}
