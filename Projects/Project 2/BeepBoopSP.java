/*  
    Stephanie Parma
    Professor Shaffer - CSC-101
    Project 2

    This program will take input in form of an integer which the program will count up to and will 
    replace the numbers divisible by certain numbers with sounds. */

import java.util.*;

public class BeepBoopSP {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);   
        System.out.print("Please enter a positive whole number: ");

        int userNumber =  kb.nextInt();
        int counter = 1;

        while (counter < userNumber+1){
            if (counter % 3 == 0 && counter % 5 == 0 && counter % 4 == 0){
                System.out.println("Shazam");
            }
            else if (counter % 3 == 0 && counter % 5 == 0){
                System.out.println("Blammo");
            }
            else if (counter % 4 == 0 && counter % 5 == 0){
                System.out.println("Pow");
            }
            else if (counter % 3 == 0 && counter % 4==0){
                System.out.println("Ding");
            }
            else if (counter % 3 == 0){
                System.out.println("Beep");
            }
            else if (counter % 4 == 0){
                System.out.println("Boop");
            }
            else if (counter % 5 == 0){
                System.out.println("Blip");
            }
            else {
                System.out.println(counter);
            }
            counter+=1;
        }
    }   
}
