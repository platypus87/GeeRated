package com.company;

public class GeeMath {
    public static String power(){
        return "Hello World";
    }

    public static int power(int x){
        int exp = x;
        int retval=10;
        for(int i = 1; i < x; i++){
            retval*=10;
        }
        return retval;
    }
    public static String power(int b, int e){
        int base = b;
        int exp = e;
        String retval = "";
        String name = "Rowan";

        for(int i = 1; i < exp; i++){
            base*=b;
            System.out.println(name);
            name+="Rowan";
        }

        System.out.println(name);
        return retval+base;
    }

    public double add(double a, double b){
        return a+b;
    }
}
