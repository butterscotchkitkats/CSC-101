import java.util.Scanner;

public class tables {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("How many rows would you like?: ");
        int rows = kb.nextInt();

        System.out.println("How many columns would you like?: ");
        int columns = kb.nextInt();

        System.out.println("What would you like the starting value to be?: ");
        int startValue = kb.nextInt();

        for (int i=0; i < columns; i++){
            System.out.print("\n");
            for (int j=0; j < rows; j++){
                System.out.print(startValue + " ");
                startValue++;
            }
        }
    }   
}
