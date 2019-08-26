package com.xsn.child0822;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.Charset;
import java.util.List;

@SpringBootApplication

public class Child0822Application extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(Child0822Application.class, args);
    }

    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        StringHttpMessageConverter convert = new StringHttpMessageConverter(Charset.forName("utf-8"));

        return convert;
    }
//    重写configureMessageConverters 配置消息转换器
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //1、定义一个convert转换消息的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //2、添加fastjson的配置信息
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //3、在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);
        //4、将convert添加到converters中
        converters.add(fastConverter);
        converters.add(stringHttpMessageConverter());

        //5、追加默认转换器
        super.addDefaultHttpMessageConverters(converters);
    }
//    bean 注入
//    @Bean
//    public HttpMessageConverter httpMessageConverter(){
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        //2、添加fastjson的配置信息
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        //3、在convert中添加配置信息
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        //4、将convert添加到converters中
////        converters.add(fastConverter);
//        HttpMessageConverter<?> converter = fastConverter;
//        return (HttpMessageConverter) new HttpMessageConverters(converter);
//    }
}
