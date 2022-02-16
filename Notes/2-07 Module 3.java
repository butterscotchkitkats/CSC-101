import java.util.*;
import java.text.DecimalFormat;

public class practice {
    public static void main(String[] args){

        /* Clear the pipe (the buffer)
           int num = scan.nextInt
           scan.nextLine()

           A constant is a variable that can't be re-assigned later in the code
           to declare a constant, use FINAL in front of the variable.
           the data type is still necessary.
           the name of the constant should be in all caps and use underscores */
        
        final int DAYS_IN_YEAR = 365;
        final String MONTH = "February";

        // In Java, to express a value in scientific notation, replace the "x 10" part with E
        
        double number = 6.67E33;

        // The random class is located in java.util

        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println(num);

        // leaving the parenthesis blank will give you the full range of integers

        random.nextDouble();

        // gives you a more precise decimal
        // The DecimalFormat class allows you to formal doubles

        DecimalFormat twoPlaces = new DecimalFormat("0.00");
        DecimalFormat fourPlaces = new DecimalFormat("0.0000");

        
        


    }
}
