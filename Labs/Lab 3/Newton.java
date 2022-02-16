import java.util.*;
import java.text.DecimalFormat;

public class Newton {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        final double GRAVITY = 6.674e-11;

        System.out.println("This program will calculate the force between two objects using Newton’s Universal Gravitation Equation.");

        System.out.println("Enter the mass of the first object: ");
        double mass1 = keyboard.nextDouble();

        System.out.println("Enter the mass of the second object: ");
        double mass2 = keyboard.nextDouble();

        System.out.println("Enter the distance from the center of object 1 to the center of object 2 in meters: ");
        double distance = keyboard.nextDouble();

        System.out.println("\nThe gravitational force between the two objects is " + GRAVITY*((mass1*mass2)/distance) + " Newtons");

    }
}