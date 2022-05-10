import java.util.*;
import java.text.DecimalFormat;
import java.lang.Math;

public class Average {
    public static void main(String[] args) {

        int sum = 0;
        double average = 0;
        double input = 0;
        Scanner kb = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        for (int i = 0; i < 5; i++){
            try {
                System.out.print("Enter number #" + (i+1) + ": ");
                input = kb.nextInt();
                if (input < 0){ 
                    throw new IllegalArgumentException();
                } else {
                    sum += input;
                }
            } catch (IllegalArgumentException e){
                System.out.println("Value must be positive.");
                i-=1;
                kb.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Wrong Data Type.");
                i-=1;
                kb.nextLine();
            }
        }

        average = sum;

        System.out.print("The sum is " + sum + " and the average of your 5 numbers is " + df.format(average/5) + ".");
    }
    
}
