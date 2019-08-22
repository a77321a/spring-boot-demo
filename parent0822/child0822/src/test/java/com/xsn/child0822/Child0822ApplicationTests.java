package com.xsn.child0822;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloWorld.class)
public class Child0822ApplicationTests {

    private HelloWorld helloWorld;
    @Test
    public void contextLoads() {
        TestCase.assertEquals(helloWorld.hello(),1);
    }

}
