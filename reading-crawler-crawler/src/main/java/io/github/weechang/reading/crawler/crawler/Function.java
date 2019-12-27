package io.github.weechang.reading.crawler.crawler;

import java.util.Scanner;

/**
 * 逻辑功能控制类
 *
 * @author zhangwei
 * date 2018/9/26
 * time 13:11
 */
public class Function {

    // app配置
    private AppConfig config;
    // 爬虫类
    private AbstractCrawler crawler;

    /**
     * 入口
     * @param firstUrl 第一页的链接
     * @param sourceType 数据源
     */
    public Function(String firstUrl, Integer sourceType){
        this.crawler =  CrawlerFactory.build(sourceType);
        startView(firstUrl);
    }

    // 页面浏览
    private void startView(String pageUrl){
        String content = this.crawler.getPage(pageUrl);
        System.out.println(content);
        this.inputListener();
    }

    // 开始浏览
    private void inputListener(){
        System.out.println("*************");
        System.out.println("* " + config.lastPage + " 上一页   *");
        System.out.println("* " + config.exit + " 退出     *");
        System.out.println("* 其他 下一页 *");
        System.out.println("*************");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (config.lastPage.equalsIgnoreCase(input)){
            // 上一页
            startView(crawler.lastUrl);
        } else if (config.exit.equalsIgnoreCase(input)){
            // 退出
        } else {
            // 下一页
            startView(crawler.nextUrl);
        }
    }
}
