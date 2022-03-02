import java.util.*;

public class counter {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a number to count to: ");
        int endpoint = kb.nextInt();

        for (int i1 = 0; i1 < endpoint; i1++){
            System.out.print(i1+1 + " ");
        }

        System.out.println("\nEnter another number to count to: ");
        endpoint = kb.nextInt();
        int i2 = 0;

        while (i2 < endpoint){
            System.out.print(i2+1 + " ");
            i2++;
        }

    }    
}