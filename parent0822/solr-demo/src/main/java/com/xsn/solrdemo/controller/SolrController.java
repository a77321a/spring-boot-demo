package com.xsn.solrdemo.controller;


import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SolrController {
    @Autowired
    private SolrClient solrClient;
    @RequestMapping("/solr")
    public String solrTes() throws IOException, SolrServerException {
        SolrDocument doc = solrClient.getById("*");
        return doc.toString();
    }
}
