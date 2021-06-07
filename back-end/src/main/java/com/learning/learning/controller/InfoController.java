package com.learning.learning.controller;

import com.learning.learning.grpc.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Clivia-Han
 * @projectName: x-learning-system
 * @packageName: com.learning.learning.controller
 * @Description:
 * @create: 2021-04-26
 */
@Slf4j
@CrossOrigin("*")
@RestController
public class InfoController {
    /**
     * 从容器中获取调用GRpc stub
     */
    final SearchServiceGrpc.SearchServiceBlockingStub searchServiceBlockingStub;

    @Autowired
    public InfoController(SearchServiceGrpc.SearchServiceBlockingStub searchServiceBlockingStub) {
        this.searchServiceBlockingStub = searchServiceBlockingStub;
    }


    @RequestMapping("/getNews/{keyword}/{type}/{year}/{page}")
    public String news(@PathVariable("keyword") String keyword, @PathVariable("type") String type,
                       @PathVariable("year") String year, @PathVariable("page") String page) {
        log.info("Receive news request: keyword= " + keyword +"type= "+type+"year= "+year+" page= " + page);
        long start = System.currentTimeMillis();
        NewsResponse response = this.searchServiceBlockingStub
                .searchNews(NewsRequest.newBuilder()
                        .setKeyword(keyword).setType(type).setYear(year).setPage(page).build());
        long end = System.currentTimeMillis();
        log.info("Search result: " + response.getResponse());
        log.info("Retrieval time: " + (end - start));
        return response.getResponse();
    }

    @RequestMapping("/getGraph")
    public String graph(){
        log.info("Receive graph request");
        long start = System.currentTimeMillis();
        GraphResponse response = this.searchServiceBlockingStub
                .searchGraph(GraphRequest.newBuilder().build());
        long end = System.currentTimeMillis();
        log.info("Search result: " + response.getResponse());
        log.info("Retrieval time: " + (end - start));
        return response.getResponse();
    }

    @RequestMapping("/getWordCloud")
    public String wordCloud(){
        log.info("Receive wordCloud request");
        long start = System.currentTimeMillis();
        WordCloudResponse response = this.searchServiceBlockingStub
                .searchWordCloud(WordCloudRequest.newBuilder().build());
        long end = System.currentTimeMillis();
        log.info("Search result: " + response.getResponse());
        log.info("Retrieval time: " + (end - start));
        return response.getResponse();
    }

    @RequestMapping("/getCalender/{date}")
    public String news(@PathVariable("date") String date) {
        log.info("Receive news request: date= " + date);
        long start = System.currentTimeMillis();
        CalenderResponse response = this.searchServiceBlockingStub
                .searchCalender(CalenderRequest.newBuilder()
                        .setDate(date).build());
        long end = System.currentTimeMillis();
        log.info("Search result: " + response.getResponse());
        log.info("Retrieval time: " + (end - start));
        return response.getResponse();
    }
}