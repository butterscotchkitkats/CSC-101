import java.util.*;

public class Pythagorean{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("This program will determine the length of the hypotenuse of a triangle and the perimeter. ");
        
        boolean done = true; 
        
        while (done == true){
            try{
                System.out.print("Enter the length of side A (must be a positive value): ");
                int sideA = kb.nextInt();
                done = false;
            }
            catch (InputMismatchException e){
                System.out.print("Invalid entry. Must be a number");
            }
        }

        while (done == true){
            try{
                System.out.print("Enter the length of side B (must be a positive value): ");
                int sideB = kb.nextInt();
                done = false;
            }
            catch (InputMismatchException e){
                System.out.print("Invalid entry. Must be a number");
            }
        }

        while (done == true){
            try{
                System.out.print("Enter the length of side C (must be a positive value): ");
                int sideC = kb.nextInt();
                done = false;
            }
            catch (InputMismatchException e){
                System.out.print("Invalid entry. Must be a number");
            }
        }        
    }
}