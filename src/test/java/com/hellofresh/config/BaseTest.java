package com.hellofresh.config;

import org.testng.Assert;

public class BaseTest {

    public void verifyTrue(Boolean object, String message){
        Assert.assertTrue(object,message);
    }

    public void verifyNotNull(Object object, String message){
        Assert.assertNotNull(object,message);
    }

    public void verifyEqual(Object actual, Object expected, String message){
        Assert.assertEquals(actual, expected, message);
    }
}
