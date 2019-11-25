package com.test.jacoco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	else if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	else {
    		System.out.println("Condition 3");
    	}
    	return 0;
    }
    public int Method4(int a, int b, int c, int d, float e) {
    	if(a == 0) {
    		return 0;
    	}
    	int x = 0;
    	if((a == b) || ((c == d) && (bug(a)))) {
    		 x = 1; 
    	}
    	e = 1/x;
    	return 0;
    }
    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    
    public boolean isTriangle(int a, int b, int c) {
    	/**
    	 * TODO: You need to complete this method to determine whether  a
    	 * triangle is formed or not when given the input edge a, b and c.
    	 */
    	if (a <=0  || b <=0 || c<= 0)
    	    return false;
    	if (a+b>c && a+c>b && b+c>a)
    	    return true;
    	else
    	    return false;
    }
    public boolean isBirthday(int year, int month, int day) {
    	/**
    	 * TODO: You need to complete this method to determine whether a 
    	 * legitimate date of birth between 1990/01/01 and 2019/10/01 is 
    	 * formed or not when given the input year, month and day.
    	 */
        int [] bigger = new int[]{1,3,5,7,8,10,12};
    	//List<Integer> bigger = new ArrayList<Integer>(Arrays.asList(1,3,5,7,8,10,12));
        if(year < 1990 || year > 2019)
            return false;
        if(month <=0 || month > 12)
            return false;
        if(day <= 0 || day > 31)
            return false;
        if(year == 2019 && month >= 10)
            return false;
        if(month==2)
            if(year%4 == 0 && day > 29)
                return false;
            else if(year%4 != 0 && day > 28)
                return false;
        System.out.println(Arrays.binarySearch(bigger, month));
        if(Arrays.binarySearch(bigger, month)<=0 && day > 30)
            return false;
        return true;
    	
    }
    public Double miniCalculator(double a, double b, char op) {
    	/**
    	 * TODO: You need to complete this method to form a small calculator which 
    	 * can calculate the formula: "a op b", the op here can be four basic  
    	 * operation: "+","-","*","/". 
    	 */
    	double result = 0.0;
    	if(op == '+')
    	    return a + b;
    	else if(op == '-')
    	    return a - b;
    	else if(op == '*')
    	    return a * b;
    	else if(op == '/' && b != 0)
    	    return a / b;
    	else
    	    return Double.NaN;
    }
    
}
