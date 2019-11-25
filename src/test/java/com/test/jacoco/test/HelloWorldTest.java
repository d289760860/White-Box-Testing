package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();

        //Condition 1
        hw.Method3(6,-1,-1);
        hw.Method3(1,1,1);
        hw.Method3(6,1,1);

        //Condition 2
        hw.Method3(1,-1,-3);

        //Condition 3
        hw.Method3(5,-1,-1);
        hw.Method3(1,1,-1);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */

    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        hw.Method4(0,1,1,2,2);
        //hw.Method4(1,1,2,3,2);
        hw.Method4(1,1,2,2,2);
        hw.Method4(5, 2, 3, 3, 2);
        try {
            hw.Method4(3, 2, 3, 3, 2);
        }
        catch(Exception e) {}
        try {
            hw.Method4(1, 2, 3, 4, 2);
        }
        catch(Exception e) {}
    }

    @Test
    public void testBug(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(5);
        assertEquals(true,a);
        boolean b = hw.bug(0);
        assertEquals(false,b);
    }

    @Test
    public void testMiniCalculator(){
        HelloWorld hw = new HelloWorld();
        double res = hw.miniCalculator(1.5,2.5,'+');
        assertEquals(4,res,0);
        res = hw.miniCalculator(3.5,2.5,'-');
        assertEquals(1,res,0);
        res = hw.miniCalculator(2,2.5,'*');
        assertEquals(5,res,0);
        res = hw.miniCalculator(1.5,3,'/');
        assertEquals(0.5,res,0);
        res = hw.miniCalculator(1.5,0,'/');
        assertEquals(Double.NaN,res,0);
        hw.miniCalculator(1,2,'?');
    }


    @Test
    public void testIsTriangle() {
        HelloWorld hw = new HelloWorld();
        boolean res = hw.isTriangle(-1,2,3);
        assertEquals(res,false);
        res = hw.isTriangle(1,-3,3);
        assertEquals(res,false);
        res = hw.isTriangle(1,3,-3);
        assertEquals(res,false);
        res = hw.isTriangle(1,1,3);
        assertEquals(res,false);
        res = hw.isTriangle(1,3,1);
        assertEquals(res,false);
        res = hw.isTriangle(3,1,1);
        assertEquals(res,false);
        res = hw.isTriangle(3,3,3);
        assertEquals(res,true);
    }

    @Test
    public void testIsBirthday() {
        HelloWorld hw = new HelloWorld();
        boolean res = hw.isBirthday(1870,1,1);
        assertEquals(res,false);
        res = hw.isBirthday(2020,5,1);
        assertEquals(res,false);
        res = hw.isBirthday(2015,-1,1);
        assertEquals(res,false);
        res = hw.isBirthday(2009,15,3);
        assertEquals(res,false);
        res = hw.isBirthday(1999,3,-3);
        assertEquals(res,false);
        res = hw.isBirthday(2000,4,60);
        assertEquals(res,false);

        res = hw.isBirthday(2019,3,5);
        assertEquals(res,true);
        res = hw.isBirthday(2019,10,6);
        assertEquals(res,false);
        res = hw.isBirthday(2000,2,30);
        assertEquals(res,false);
        res = hw.isBirthday(2000,2,15);
        assertEquals(res,true);
        res = hw.isBirthday(2001,2,29);
        assertEquals(res,false);
        res = hw.isBirthday(2001,2,28);
        assertEquals(res,true);

        res = hw.isBirthday(2001,4,31);
        assertEquals(res,false);
        res = hw.isBirthday(2001,4,30);
        assertEquals(res,true);
        res = hw.isBirthday(2001,5,31);
        assertEquals(res,true);
    }
}
