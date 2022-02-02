import java.util.Scanner;

class ReadStuff {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int number;
        String word;
        double decimal;

        System.out.print("Please input a whole number: ");
        number = keyboard.nextInt();
        System.out.println();

        System.out.print("Please input a word: ");
        word = keyboard.next();
        System.out.println();

        System.out.print("Please input a decimal: ");
        decimal = keyboard.nextDouble();
        System.out.println();
        
        System.out.println("Your inputted number = " + number);
        System.out.println("Your word = " + word);
        System.out.println("Your decimal = " + decimal);
    }
}