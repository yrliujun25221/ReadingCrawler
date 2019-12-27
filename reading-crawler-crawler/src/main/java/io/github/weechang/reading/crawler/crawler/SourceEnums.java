package io.github.weechang.reading.crawler.crawler;

/**
 * @author zhangwei
 * date 2018/9/26
 * time 13:28
 */
public enum SourceEnums {

    /**
     * 笔趣阁
     */
    BIQUGE(1, "笔趣阁", "https://www.biqugexsw.com"),
    /**
     * 17K小说网
     */
    SHIQIK(2, "17K", "https://www.17k.com");

    private Integer key;
    private String name;
    private String url;

    SourceEnums(Integer key, String name, String url){
        this.key = key;
        this.name = name;
        this.url = url;
    }

    public Integer getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
