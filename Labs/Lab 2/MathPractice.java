import java.util.*;
import java.lang.Math;

class MathPractice{
    public static void main(String [] args){
        double double1;
        double double2;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Greetings <user>, please enter the first decimal: ");
        double1 = keyboard.nextDouble();
        System.out.println();

        System.out.print("Thank you, <user>, please enter the second decimal: ");
        double2 = keyboard.nextDouble();
        System.out.println();

        System.out.print("Your results:\n");
        System.out.println(double1 + " + " + double2 + " = " + (double1 + double2));
        System.out.println(double1 + " * " + double2 + " = " + (double1*double2));
        System.out.println(double1 + "^" + double2 + " = " + Math.pow(double1,double2));
        System.out.println(double1 + " - " + double2 + " = " + (double1 - double2) + " and " + double2 + " - " + double1 + " = " + (double2 - double1) + "\nThe smaller of the two numbers is " + Math.min(double1,double2));


    }
}