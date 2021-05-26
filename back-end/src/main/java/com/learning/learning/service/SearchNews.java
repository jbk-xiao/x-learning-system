package com.learning.learning.service;

import com.learning.learning.dao.RedisDao;
import com.learning.learning.entity.ListAndPage;
import com.learning.learning.entity.News;
import com.learning.learning.mapper.NewsMapper;
import com.learning.learning.util.CreateJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.QueryMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: Clivia-Han
 * @projectName: x-learning-system
 * @packageName: com.learning.learning.service
 * @Description:
 * @create: 2021-04-26
 */
@Slf4j
@Component
public class SearchNews {
    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private RedisDao redisDao;

    private final CreateJson json = new CreateJson();

    public String searchNews(String title, String content, String type, String year, String page) {
        //分页检索，每次返回二十条新闻
        log.info("Start searching news");
        //redis方法，传入一个(title,page)，返回list
        ListAndPage lp = redisDao.getIDListOnPage(title, content, type, year, Integer.parseInt(page));
        log.info("searchNewsByTitle result:" + lp.getList().toString());
        //mysql方法
        String jsonInfo = "";
        try {
            jsonInfo += "{\"totalRecords\":"+lp.getPageNum()+",";
            jsonInfo += "\"lists\":";
            jsonInfo += json.toJson(newsMapper.selectNewsByNewsIds(lp.getList()));
            jsonInfo += "}";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonInfo;
    }
}
