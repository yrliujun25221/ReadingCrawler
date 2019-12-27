package io.github.weechang.reading.crawler.crawler;

/**
 * @author zhangwei
 * date 2018/9/26
 * time 10:07
 */
public class CrawlerFactory {

    public static AbstractCrawler build(Integer key){
        //默认笔趣阁
        AbstractCrawler abstractCrawler = new BiQuGeCrawler();
        switch (key){
            //笔趣阁
            case 1:
                abstractCrawler = new BiQuGeCrawler();
            //17K小说网
            case 2:
                abstractCrawler = new ShiQiKCrawler();
            default:
                abstractCrawler = new BiQuGeCrawler();
        }
        return abstractCrawler;
    }
}
