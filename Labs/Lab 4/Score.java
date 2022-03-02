import java.util.*;

public class Score {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        while (true){

        System.out.print("\nThis program tells you how good your credit score is.\nPlease enter your credit score (between 300 and 800): ");
        int creditScore = kb.nextInt();

        if (creditScore >= 300 && creditScore <= 579){
            System.out.print("Poor Credit Score");
            
        } 

        else if (creditScore >= 580 && creditScore <= 669){
            System.out.print("Fair Credit Score");
            
        } 

        else if (creditScore >= 670 && creditScore <= 739){
            System.out.print("Good Credit Score");
            
        }

        else if (creditScore >= 740 && creditScore <= 799){
            System.out.print("Very Good Credit Score");
            
        } 

        else if (creditScore >= 800 && creditScore <= 850){
            System.out.print("Exceptional Credit Score");
        } 

        else {
            System.out.print("Not a valid score");
        }
    }
}
}
