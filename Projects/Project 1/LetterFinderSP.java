/*  
    Stephanie Parma
    Professor Shaffer - CSC-101

    This program will take input in form of a sentence or phrase and calculates the 
    index of the given character as well as finds given substrings.   */
    
import java.util.*;                 //used for Scanner object

public class LetterFinderSP {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);    //creates Scanner object

        System.out.print("Please enter a sentence or phrase: ");    //prompts user for input in the form of a sentence or phrase
        String phrase = kb.nextLine(); 

        System.out.print("Please enter a single character: ");      //prompts user for input in the form of a single character
        String character = kb.nextLine();

        int charIndex = phrase.indexOf(character);                  //finds the first instance of the given character in the given string

        System.out.println("The index of the first " + character + " is " + charIndex);                         //returns index of first instance of character
        System.out.println("The substring before " + character + " is: " + phrase.substring(0,charIndex));      //returns substring before first character
        System.out.println("The length of this substring is: " + phrase.substring(0,charIndex).length());       //returns length of substring
        System.out.println("The substring after n is: "+ phrase.substring(charIndex+1));                        //returns substring after first character
        System.out.println("The length of this substring is: " + phrase.substring(charIndex+1).length());       //returns length of substring
    }
}