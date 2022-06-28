package com.organisation;

public class demo {
    public static void main(String[] args) {
        System.out.println("hello world");
        // demo dm = new demo ();
        System.out.println("results="+addition(10,35));
        System.out.println("results="+subtraction(52,35));
    }
    static int addition (int x,int y){
        return x + y;
    }
    static int subtraction (int x,int y) {
        return x - y;
    }
}
