import java.util.*;

public class AboutYou {
    public static void main(String [] args){
        String name;
        String town;
        int age;
        double gpa;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = keyboard.next();
        System.out.println();

        System.out.print("Where do you live? ");
        town = keyboard.next();
        System.out.println();

        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        System.out.println();

        System.out.print("What is your gpa? ");
        gpa = keyboard.nextDouble();
        System.out.println();

        System.out.print("Your name is " + name + " and you live in " + town + ". You are\n" + age + "years old and your GPA is " + gpa + ".");
        int number = town.length();
        System.out.println("Your town has " + number + " letters.");
        
    }
    
}
