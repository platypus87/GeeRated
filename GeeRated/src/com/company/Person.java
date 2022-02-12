package com.company;

public class Person {

    private String name = "None Entered";
    private int age = 1;
    private boolean isAwesome;


    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}
    public boolean getIsAwesome(){return this.isAwesome;}


    public Person(){

    }


    public Person(String n, int a){
        this.name = n;
        this.age = a;
    }

    public Person(int a, boolean bool){
        this.age = a;
        this.isAwesome = bool;
    }

    public Person(String n, int a, boolean awesome){
        this.name = n;
        this.age = a;
        this.isAwesome = awesome;
    }

    public void addAge(int x){
        this.age = this.age+x;
    }



    public void setAwesome(){
        this.isAwesome = true;
    }

    public void setAwesome(boolean tf){
        this.isAwesome = tf;
    }

}
