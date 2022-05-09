/*  
    Stephanie Parma
    Professor Shaffer - CSC-101

    This program will take input in form of a series of doubles which will be checked for validity.
    It will then compute the roots of the equation assembled from the numbers provided. */

import java.util.*;
import java.text.DecimalFormat;

public class QuadraticSP {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        boolean valid_a = false;
        boolean valid_b = false;
        boolean valid_c = false;

        System.out.print("Enter a value for 'a': ");
        double a = kb.nextDouble();

        while (valid_a != true){
            try {
                if (a == 0){
                    System.out.println("value can not be equal to 0.");
                    a = kb.nextDouble();
                }

                else{
                    valid_a = true;
                }
            } catch (InputMismatchException e){
                System.out.println(e);
                System.out.println("not a valid input. Please try again:");
                kb.next();
            }
        }

        System.out.print("Enter a value for 'b': ");
        double b = kb.nextDouble();

        while (valid_b != true){
            try {
                if (b == 0){
                    System.out.println("value can not be equal to 0");
                    b = kb.nextDouble();
                } else{
                    valid_b = true;
                }
            } catch (InputMismatchException e){
                System.out.println(e);
                System.out.println("not a valid input. Please try again:");
                kb.next();
            }
        }

        System.out.print("Enter a value for 'c': ");
        double c = kb.nextDouble();

        while (valid_c != true){
            try {
                if (c==0){
                    System.out.println("value can not be equal to 0.");
                    c = kb.nextDouble();
                } else{
                    valid_b = true;
                }
            }
            catch (InputMismatchException e){
                System.out.println(e);
                System.out.println("not a valid input. Please try again:");
                kb.next();
            }
        }

        System.out.println("Your Equation is " + a + "x^2 + " + b + "x + " + c );
        double d = b*b - 4*a*c;

        if (d < 0){
            System.out.print("no real answers.");
        }

        else {  
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("X: " + df.format(x1));
            System.out.println("X: " + df.format(x2));
        }
    }
}