// a main method must be present in the class if you want the class to run/execute
// the "new" keyword is used to create new objects, NOT PRIMITIVE DATA TYPES

/* The scanner class contains methods that allow us to capture a user's input from the keyboard and do something meaningful with it.
   To do this, you have to create a scanner object first */

import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    }
}

// You can use import java.util.* to import all classes within the java.util folder

// .next() gets first word from the keyboard
// .nextLine() gets the entire line
// .nextInt() gets whole numbers
// .nextDouble() gets doubles

/* Recommended use for Scanner:

1. Create the Scanner object and add the import statement
2. Print instructions for the user using one or more print statements
3. Create a variable that will store the data that the user types in.
4. Use the variable in your code */

class ScannerPractice {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your name?");
        String fullname = kb.next();
        System.out.print(fullname);
    }
}

// typecasting is when one value is converted into another type
// Java cannot cast a more precise value into a less precise value (ie double to int)

/* There are three types of division that you can do in Java:

    - Regular Division
    - Integer Division
    - Getting the remainder from Integer Division

*/