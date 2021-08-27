/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.time.Year;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int curAge = Integer.parseInt(strIO("What is your current age? ", sc));
        int retAge = Integer.parseInt(strIO("At what age would you like to retire? ", sc));
        int diffAge= retAge - curAge;
        if( diffAge <= 0) {
            System.out.println("you can already retire!");
            return;
        }else {
            System.out.println("You have " + diffAge + " years left until you can retire.");
        }
        int curYear= Integer.parseInt(Year.now().toString());
        System.out.println("It is " + curYear + ", so you can retire in "+(curYear + diffAge));
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
