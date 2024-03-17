package com.zrawberry;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSpeak() {
        Demo d = new Demo();
        String result = d.speak("zachary");
        Assert.assertEquals("hello zachary", result);
    }
}
