package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static String tooLow(){
        return "You picked a number that is too low, dummy!";
    }

    public static int askForNum(){
        int guess = -1;
        boolean loopBool = false;
        Scanner sc = new Scanner(System.in);

//        while(loopBool){
//            try{
//                guess = sc.nextInt();
//            }catch (InputMismatchException e){
//                System.out.println("Wrong type");
//                loopBool = false;
//            }
//        }

        do {
            try {
                guess = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("wrong type dummy");

            }

        }while(loopBool);

        return guess;
    }

    public static String endGame(int guesses){
        String retval ="";

        if(guesses<7){
            retval ="Congrats you won in "+guesses+" guesses";
        }else{
            retval = "You suck again!";
        }
            return retval;
    }

    public static char playAgain(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Play again? y or n");
        char retChar = sc.next().charAt(0);
        return retChar;
    }

    public static void main(String[] args) {

        int randNum;
        int guess=-1;
        int ctr;
        char keepPlaying;
        Random randomNumber = new Random();

        int maxNum = 20;

        //outer loop for running multiple games
        do {
            randNum = randomNumber.nextInt(maxNum);
            ctr  = 0;//reset ctr to 0 each game iteration

            //guessing portion of the game
            do {
                System.out.println("Please enter a guess between 1 and "+maxNum);
                guess = askForNum();

                //compare guess to number
                if (guess < randNum) {
                    ctr++;
                    System.out.println(tooLow());
                } else if (guess > randNum) {
                    ctr++;
                    System.out.println("Too high");
                }else
                ctr++;
                //end of "guessing" loop

            } while (guess != randNum);
            //end of "game" loop

            System.out.println(endGame(ctr));
            keepPlaying = playAgain();
            maxNum*=10;

        } while (keepPlaying != 'n');
        //end of main method
    }
}

//
//        while(y<10){
//            System.out.println(y);
//            y++;
//        }

//    for(int i = 0; i<=10; i++){
//        System.out.println(i);
//    }







//        Person Heather = new Person("Rowan",21,true);
//        Person Mart = new Person();
//
//        Car martsCar = new Car(2021,"White","Subaru","Outback");
//        Car defCar = new Car();
//        Vehicle newVeh = new Vehicle();
//
//        System.out.println("New Vehicle Tires "+newVeh.tires);
//        System.out.println("Default Car's Tires "+defCar.tires);
//        newVeh.color = "Green";
//        System.out.println(newVeh.color);
//        System.out.println(martsCar.toString());



//        System.out.println(Heather.getIsAwesome());
//        System.out.println(Heather.getAge());
//        Heather.setAge(28);
//        System.out.println(Heather.getAge());
//        Heather.addAge(22);
//        System.out.println(Heather.getAge());
//
//        System.out.println(Mart.getIsAwesome());
//        Mart.setAwesome();
//        System.out.println(Mart.getIsAwesome());
//        Mart.setAwesome(false);
//        System.out.println(Mart.getIsAwesome());



//        var name = Math.PI;
//        var number = change.toString(4);
//        var bool = true;
//        var PI = Math.PI;

//        System.out.println(bool);
//        System.out.println();
//        change.toString(5);
//        System.out.println(change.name);

//        System.out.println(change.toString(7));
//        System.out.println(change.toString(1));
//        System.out.println(change.toString(3));
//        System.out.println(change.toString(71));