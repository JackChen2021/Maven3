package com.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author JackChern @create 2021-07-18 21:54
 */
public class TestHello {
    @Test
    public void testAdd(){
        Hello hello = new Hello();
        int sum = hello.add(10, 20);
        Assert.assertEquals(30,sum);
    }
}
