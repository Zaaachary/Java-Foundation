package com.zrawberry;

import org.junit.Test;
import org.junit.Assert;


public class DemoTest{
    @Test
    public void testSpeak() {
        Demo d = new Demo();
        String ret = d.speak("maven");
        Assert.assertEquals("hello maven", ret);
    }   
}