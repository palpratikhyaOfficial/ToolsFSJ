package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest 
{

   
    @Test
    public void testSumWithPositive() 
    {
        App app=new App();
        int expected=300;
        int actual=app.sum(100, 200);
        assertEquals(expected,actual);
    }
    @Test
    public void testSumWithMixedValues() 
    {
        App app=new App();
        int expected=100;
        int actual=app.sum(-100, 200);
        assertEquals(expected,actual);
    }
    @Test
    public void testWithZeros() 
    {
        App app=new App();
        int expected=0;
        int actual=app.sum(0,0);
        assertEquals(expected,actual);
    }
    
}
