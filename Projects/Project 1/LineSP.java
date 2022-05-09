/*  
    Stephanie Parma
    Professor Shaffer - CSC-101

    This program will take input in form of the x and y coordinates of two points
    and calculates the distance between the two points. In addition, this program
    provides the x and y coordinates of the midpoint between the original points.   */

import java.util.*;                     //used for Scanner and math objects
import java.text.DecimalFormat;         //used for formatting decimals

public class LineSP {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);                    //Creates an object of the Scanner class 
        DecimalFormat df = new DecimalFormat("0.00");           //Creates an object of the Decimalformat class 

        System.out.print("This program will determine the distance between two points as well as \nthe x, y coordinates of the midpoint. \n\n");

        System.out.print("please enter a value for the first x: ");     //Prompts the user for the x value of the first point
        double xCoor1 = kb.nextDouble(); 

        System.out.print("please enter a value for the first y: ");     //Prompts the user for the y value of the first point   
        double yCoor1= kb.nextDouble(); 

        System.out.print("please enter a value for the second x: ");    //Prompts the user for the x value of the second point
        double xCoor2 = kb.nextDouble();

        System.out.print("please enter a value for the second y: ");    //Prompts the user for the y value of the second point
        double yCoor2 = kb.nextDouble();

        double distance = Math.sqrt(Math.pow(xCoor2 - xCoor1, 2) + Math.pow(yCoor2 - yCoor1, 2));                       //Calculates distance using distance formula and user inputted coordinates
        System.out.print("(x1, y1) = (" + xCoor1 + ", " + yCoor1 + ")\n(x2, y2) = (" + xCoor2 + ", " + yCoor2 + ")");   //Repeats user input back to the user
        System.out.print("\nDistance = " + df.format(distance));                                                        //States the calculated value

        double midpointX = (xCoor1 + xCoor2)/2;     //calculates the midpoint x-value
        double midpointY = (yCoor1 + yCoor2)/2;     //calculates the midpoint y-value

        System.out.print("\nMidpoint = (" + df.format(midpointX) + ", " + df.format(midpointY) + ")"); //Returns the calculated midpoint to the user
    }
}
