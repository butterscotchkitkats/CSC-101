/* Stephanie Parma
Professor Shaffer - CSC-101

This program stores an array and then checks user-inputted answers against the stored array.
*/

import java.util.Scanner;

public class TestGradeSP {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        char[] answerKey = {'b','d','a','a','c','a','b','a','c','d','b','c','d','a','d','c','c','b','d','a'}; //stores the answer key in an array
        char userChar, checkValue;
        int counter = 0;  
        double result;     
        String decision;    

        System.out.println("This is the answer key to Professor Shaffer’s super hard test. Enter the response for each question to see your final score. Enter A/a, B/b, C/c, or D/d.");
        for(int i = 0; i < 20 ; ++i){
            System.out.println("Answer to Question " + (i+1) + "?");
            userChar = kb.next().charAt(0);
            checkValue = Character.toLowerCase(userChar);               //gets user input

            while(checkValue != 'a' && checkValue != 'b' && checkValue != 'c' && checkValue != 'd'){    // checks if input is valid 
                System.out.println("Invalid Input");
                System.out.println("Answer to Question " + (i+1) + "?");
                userChar = kb.next().charAt(0);
                checkValue = Character.toLowerCase(userChar);
            }
            if(checkValue == answerKey[i]){         //Tells the user whether or not their input matches the stored value. 
                counter++;      
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect.");
            }
        }if(counter < 12){                          //Tells the user whether they've failed or passed the test
            decision = "failed";
        }else{
            decision = "passed";
        }
        result = (counter/(20.0))*100;
        System.out.println("You answered " + counter + " out of 20 questions correctly. Your grade is " + result + "%. You " + decision + "!");
    }                                               
}                                                   //Presents the results of the test