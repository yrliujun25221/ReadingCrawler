package io.github.weechang.reading.crawler.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * 笔趣阁
 * @author zhangwei
 * date 2018/9/25
 * time 17:29
 */
public class BiQuGeCrawler extends AbstractCrawler {

    @Override
    public String getPage(String url) {
        try {
            this.page = Jsoup.connect(url).get();

            this.getNext();
            this.getLast();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.getContent();
    }

    /**
     * 获取该页内容
     * @return
     */
    @Override
    protected String getContent(){
        Element cntEl = this.page.getElementById("content");
        // 八个空格，（制表符号）
        return cntEl.text().replaceAll("        ", "\n");
    }

    /**
     * 获取下一页链接
     */
    protected void getNext() {
        Element ul = page.getElementsByClass("page_chapter").get(0).child(0);
        Element nextHref = ul.child(2).child(0);
        this.nextUrl = nextHref.attr("abs:href");
    }

    /**
     * 获取上一页链接
     */
    protected void getLast() {
        Element ul = page.getElementsByClass("page_chapter").get(0).child(0);
        Element lastHref = ul.child(0).child(0);
        this.lastUrl = lastHref.attr("abs:href");
    }
}
