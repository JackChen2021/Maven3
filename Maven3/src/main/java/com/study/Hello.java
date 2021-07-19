package com.study;

/**
 * @author JackChern @create 2021-07-18 21:52
 */
public class Hello {
    public int add(int a,int b){
        return a + b;
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.add(10, 20));
    }
}
