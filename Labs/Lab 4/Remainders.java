import java.util.*;

public class Remainders{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);


        while (true){
            System.out.println("Please enter the dividend: ");
            int dividend = kb.nextInt();

            System.out.println("Please enter the divisor: ");
            int divisor = kb.nextInt();

            int remainder = dividend % divisor;

            switch(remainder){
                case 0: System.out.println(dividend + " is a multiple of " + divisor + ". The remainder is " + " 0.");
                        break;

                default: System.out.println(dividend + " is not a multiple of " + divisor + ". The remainder is " + remainder + ".");
                         break;

            }

        }

    }

}