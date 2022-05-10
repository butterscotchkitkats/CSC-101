import java.util.*;
import java.text.DecimalFormat;
import java.lang.Math;

public class Pythagorean {
    public static void main(String[] args) {

        int sideA = 0;
        int sideB = 0;

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner kb = new Scanner(System.in);
        System.out.print("This program will determine the length of the hypotenuse of a triangle and the perimeter. ");
        
        boolean done = false; 

        while (done == false){
            try {
                System.out.print("\nEnter the length of side A (must be a positive value): ");
                sideA = kb.nextInt();
                if (sideA < 0) {
                    throw new IllegalArgumentException();
                }
                done = true;
            } catch (InputMismatchException e){
                System.out.println("Invalid entry. Must be a number");
                kb.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid entry. Must be a positive number");
                kb.nextLine();
            }
        }

        done = false;

        while (done == false) {
            try {
                System.out.print("\nEnter the length of side B (must be a positive value): ");
                sideB = kb.nextInt();
                if (sideB < 0) {
                    throw new IllegalArgumentException();
                }
                done = true;
            } catch (InputMismatchException e){
                System.out.println("Invalid entry. Must be a number");
                kb.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid entry. Must be a positive number");
                kb.nextLine();
            }
        }

        double sideC = (Math.sqrt((Math.pow(sideA,2) + Math.pow(sideB,2))));

        System.out.print("\nYou entered " + df.format(sideA) + " as the length of side A and " + df.format(sideB) + " as the length of side B. ");
        System.out.println("The length of side C is " + df.format(sideC));
        System.out.println("The perimeter of this triangle is: " + df.format(sideA + sideB + sideC));
    }
}


