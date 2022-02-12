package com.company;

public class Change {

    String name;
    int age;
    boolean isAwesome;

    public Change(String n, int a, boolean awesome){
        this.name = n;
        this.age = a;
        this.isAwesome = awesome;
    }

    public String getName(){
        return this.name;
    }

    public String toString(int x){
        int num = x;
        String retval;

        switch(num){
            case 1 : retval = "one";
                break;
            case 2 : retval = "two";
                break;
            case 3 : retval = "three";
                break;
            case 4 : retval = "four";
                break;
            case 5 : retval = "five";
                break;

            default: retval = "none matched";
        }
        return retval;
    }
}
