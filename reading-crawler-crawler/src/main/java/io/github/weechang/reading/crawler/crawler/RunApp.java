package io.github.weechang.reading.crawler.crawler;

/**
 * 项目入口
 * @author zhangwei
 * date 2018/9/21
 * time 17:31
 */
public class RunApp {

    public static void main(String[] args) {
        //先找一本具体小说哪一章的链接
        String firstUrl = "https://www.biqiugexsw.com/1_1394/2814621.html";
        //再次切换数据源
        new Function(firstUrl, SourceEnums.BIQUGE.getKey());
    }

}
