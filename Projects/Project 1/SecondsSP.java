/*  
    Stephanie Parma
    Professor Shaffer - CSC-101

    This program will take input in form of a number of seconds and convert
    it into the corresponding number of days, hours, minutes, and seconds. */

import java.util.*;     //used for the scanner class
public class SecondsSP {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of seconds and I will convert your value to days, hours, minutes, and seconds: ");       //prompts user for the number of seconds
        int time = kb.nextInt();

        int day = time / (24 * 3600); // time divided by number of hours in a day times the number of seconds in an hour
     
        time = time % (24 * 3600);
        int hours = time / 3600;    // time divided by number of seconds in an hour
     
        time %= 3600;
        int minutes = time / 60 ;   // time divided by number of minutes in an hour
     
        time %= 60;
        int seconds = time;         // time (seconds) 

        System.out.print(seconds + " seconds is equal to: " + day + " days, " + hours + " hours, " + minutes + " minutes " + seconds + " seconds ");
        // returns input 

    }
}
