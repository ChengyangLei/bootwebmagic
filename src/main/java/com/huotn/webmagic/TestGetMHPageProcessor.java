package com.huotn.webmagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 获取学校幼儿园数据
 *
 * @author code4crafer@gmail.com
 */
public class TestGetMHPageProcessor implements PageProcessor {
    public void process(Page page) {

        Html html = page.getHtml();
        List<String> questionList = html.xpath("/html/body/div[4]/div").all();

        List<Animation> animationList = new ArrayList();

        if (questionList != null && questionList.size() > 1) {
            //i=0是列名称，所以i从1开始
            String linkUrl0="https://c23525041.qrmanhua.com";
            for (int i = 0; i < questionList.size(); i++) {
                Html tempHtml = Html.create("<div>" + questionList.get(i) + "</div>");
                String linkUrl = tempHtml.xpath("//div/div[1]/a/@href").toString();
                String  imgUrl= tempHtml.xpath("//div/div[1]/a/div[1]/img/@data-original").toString();
                String name = tempHtml.xpath("//div/div[1]/a/div[2]/div[1]/text()").toString();
                String author = tempHtml.xpath("//div/div[1]/a/div[2]/div[2]/text()").toString();
                String introduce = tempHtml.xpath("//div/div[1]/a/div[2]/div[3]/text()").toString();
                String tags = tempHtml.xpath("//div/div[1]/a/div[2]/div[4]/span/text()").toString();
                String popularity = tempHtml.xpath("//div/div[1]/a/div[2]/div[5]/text()").toString();
                String rank = tempHtml.xpath("//div/div[1]/a/div[3]/div/text()").toString();
                Animation animation = new Animation(UUID.randomUUID().toString(),linkUrl0+linkUrl,imgUrl,name,author,introduce,tags,popularity,rank);
                animationList.add(animation);
            }
                new AnimationDao().add(animationList);
        }

    }

    @Override
    public Site getSite() {
        return Site.me();
    }

    public static void main(String[] args) {
        String[] suffixArray = {"free", "sell", "new", "end"};
        for (int i = 0; i < suffixArray.length; i++) {
            String s = suffixArray[i];
            Spider.create(new TestGetMHPageProcessor()).test("https://c23525041.qrmanhua.com/rank/more/id/"+s);
        }
    }
}
