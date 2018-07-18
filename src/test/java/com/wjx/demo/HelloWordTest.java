package com.wjx.demo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWordTest
{

    @Test
    public void test(){
        HelloWord helloWord = new HelloWord();
        String result = helloWord.test();
        assertEquals("demo",result);
    }

}
