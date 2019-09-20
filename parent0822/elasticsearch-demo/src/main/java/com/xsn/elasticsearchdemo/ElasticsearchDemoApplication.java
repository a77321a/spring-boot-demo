package com.xsn.elasticsearchdemo;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeValidationException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.io.File;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ElasticsearchDemoApplication {

//    private boolean EsClusterName;

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchDemoApplication.class, args);
    }
//    @Bean(name="elasticsearchTemplate")
//    public ElasticsearchTemplate elasticsearchTemplate2() throws Exception {
//        return new ElasticsearchTemplate(createLocalNode().client());
//    }
//    @Bean
//    public Node createLocalNode() throws NodeValidationException {
//        final String tmpDir = System.getProperty("java.io.tmpdir");
//        Settings.Builder elasticsearchSettings =
//                Settings.builder()
//                        .put("cluster.name", EsClusterName)
//                        .put("path.data", new File(tmpDir, "data").getAbsolutePath())
//                        .put("path.logs", new File(tmpDir, "logs").getAbsolutePath())
//                        .put("transport.type","local")
//                        .put("http.enabled","false")
//                        .put("path.home", tmpDir);
//
//        final Node node = new Node(elasticsearchSettings.build());
//        node.start();
//
//        return node;
//    }
}
