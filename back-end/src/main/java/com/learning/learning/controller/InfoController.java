package com.learning.learning.controller;

import com.trace.trace.grpc.NewsRequest;
import com.trace.trace.grpc.NewsResponse;
import com.trace.trace.grpc.SearchServiceGrpc;
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
    @Autowired
    SearchServiceGrpc.SearchServiceBlockingStub searchServiceBlockingStub;


    @RequestMapping("/getNews/{title}/{content}/{type}/{year}/{page}")
    public String news(@PathVariable("title") String title, @PathVariable("content") String content, @PathVariable("type") String type, @PathVariable("year") String year, @PathVariable("page") String page) {
        log.info("Receive news request : title= " + title + "content= "+content+"type= "+type+"year= "+year+" page= " + page);
        long start = System.currentTimeMillis();
        NewsResponse response = this.searchServiceBlockingStub
                .searchNews(NewsRequest.newBuilder()
                        .setTitle(title).setContent(content).setType(type).setYear(year).setPage(page).build());
        long end = System.currentTimeMillis();
        log.info("Search result: " + response.getResponse());
        log.info("Retrieval time: " + (end - start));
        return response.getResponse();
    }
}