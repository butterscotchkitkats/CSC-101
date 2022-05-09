/* 
Stephanie Parma
Professor Shaffer - CSC-101

This program creates an array of a user-specified length. It then sorts them into sub-arrays and presents the number of
even, odd, positive, and negative integers contained within the array. 
*/


import java.util.*;

public class CounterSP {
    public static void main(String[] args) {

        System.out.print("\nInteger Array Analyzer\n\nThis program will display and count the number of evens/odds and \npositive/negative values in a user-created array of integers.");
        Scanner kb = new Scanner(System.in);  //intialize scanner object
        int n = 0; 

        boolean done = false;

        while (done == false){
            try {
                System.out.println("\n\nHow many integers would you like to store in the array");
                n = Integer.parseInt(kb.nextLine());
                done = true;
            } catch (InputMismatchException e){
                System.out.println("Please enter a valid integer");
            }
        }                                       //Try Catch loop to check if n is an integer

        int mainArr[] = new int[n];             //intialize respective counters
        int oddCount = 0;
        int evenCount = 0;
        int negCount = 0;
        int posCount = 0;

        for (int i = 0; i < n; ++i){   //for reading array
            System.out.print("Enter number #" + (i+1) + ": ");
            mainArr[i] = kb.nextInt();
        }

        for (int i = 0; i<n; ++i){
            if (mainArr[i] % 2 == 0) {
                evenCount++;
            } if (mainArr[i] % 2 == 1 || mainArr[i] % 2 == -1 ) {
                oddCount++;
            } if (mainArr[i] >= 0){
                posCount++;
            } if (mainArr[i] < 0) {
                negCount++;
            }
        }                                          //Counts the number of respective elements within the array

        int[] odd = new int[oddCount];
        int[] even = new int[evenCount];
        int[] neg = new int[negCount];
        int[] pos = new int[posCount];             //Creates arrays with the length of the number of elements

        int evenC = 0;                  
        int oddC = 0;
        int posC = 0;
        int negC = 0;                              //Creates counters for the indexes of given arrays

        for (int i = 0; i < n; ++i){
            if (mainArr[i] % 2 == 0) {
                even[evenC] = mainArr[i];
                evenC++;
            } if (mainArr[i] % 2 == 1 || mainArr[i] % 2 == -1) {
                odd[oddC] = mainArr[i];
                oddC++;
            }  if (mainArr[i] >= 0){ 
                pos[posC] = mainArr[i];
                posC++;
            }
                if (mainArr[i] < 0) {
                neg[negC] = mainArr[i];
                negC++;
            }                                       //Assigns the elements to their respective arrays
        }

        System.out.println("\nThere are " + evenCount + " even numbers.");
        System.out.print("They are: ");

        for (int i=0; i<evenCount; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\n\nThere are " + oddCount + " odd numbers.");
        System.out.print("They are: ");

        for (int i=0; i<oddCount; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\n\nThere are " + posCount + " positive numbers.");
        System.out.print("They are: ");

        for (int i=0; i<posCount; i++) {
            System.out.print(pos[i] + " ");
        }

        System.out.println("\n\nThere are " + negCount + " negative numbers.");
        System.out.print("They are: ");

        for (int i=0; i<negCount; i++) {
            System.out.print(neg[i] + " ");
        }
    }                                                 //Presents the results
}
