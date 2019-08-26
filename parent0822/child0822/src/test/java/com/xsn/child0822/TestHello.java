package com.xsn.child0822;

import com.xsn.child0822.controller.HelloWorld;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = HelloWorld.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestHello {
    @Autowired
    private HelloWorld helloWorld;
    @Test
    public void test(){
        TestCase.assertEquals(helloWorld.hello(),1);
    }
}
