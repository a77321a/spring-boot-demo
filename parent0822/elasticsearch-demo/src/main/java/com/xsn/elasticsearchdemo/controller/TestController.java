package com.xsn.elasticsearchdemo.controller;

import com.xsn.elasticsearchdemo.model.UserInfo;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Component
@RestController
public class TestController {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @RequestMapping("/search")
    public String findDoc(){
//          构造搜索条件
        QueryBuilder queryBuilder = QueryBuilders.existsQuery("age");

        SearchQuery searchQuery =  new NativeSearchQueryBuilder().withQuery(queryBuilder).build();

        List<UserInfo> userList = elasticsearchTemplate.queryForList(searchQuery, UserInfo.class);

        for (UserInfo user:userList){
            System.out.println(user);
        }
        return "success";
    }
}
