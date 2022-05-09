import java.util.*;

public class OppositeCase {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter some words: ");
        String originalInput = kb.next().toString();
        StringBuilder newInput = new StringBuilder(originalInput);

        for (int i=0; i<originalInput.length();i++){

            if (Character.isLowerCase(originalInput.charAt(i))) {
                newInput.setCharAt(i, Character.toUpperCase(originalInput.charAt(i)));
            } else if (Character.isUpperCase(originalInput.charAt(i))) {
                newInput.setCharAt(i, Character.toLowerCase(originalInput.charAt(i)));
            } else if (){
                
            }
            
            else {
                newInput.setCharAt(i, originalInput.charAt(i));
            }
        }
        System.out.println("Output: " + newInput);
    }
}