import java.util.*;
import java.text.DecimalFormat;

public class DinnerBill {
   public static void main(String[] args){

    DecimalFormat df = new DecimalFormat("0.00");
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Please enter the bill amount: ");
    double bill = keyboard.nextDouble();
    System.out.print("Please enter the number of people: ");
    int people = keyboard.nextInt();

    double tax = bill*0.08875;
    double tip = (bill + tax)*0.2;

    double finalBill = bill + tax + tip;

    System.out.println("Original Bill: $" + df.format(bill));
    System.out.println("Tax: $" + df.format(tax));
    System.out.println("Tip: $" + df.format(tip));
    System.out.println("Total Bill: $" + df.format(finalBill));
    System.out.println("Amount per person: $" + df.format(finalBill / people));

   }
}
