package io.github.weechang.reading.crawler.crawler;

import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * 说明：17K小说网爬取器
 * @author liujun25221 liujun@yunrong.cn
 * @date 2019/12/27 14:12
 */
public class ShiQiKCrawler extends AbstractCrawler {

    public String getPage(String url) {
        try {
            page = Jsoup.connect(url).get();

            this.getNext();
            this.getLast();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.getContent();
    }

    protected String getContent() {
        return null;
    }

    protected void getNext() {

    }

    protected void getLast() {

    }
}
