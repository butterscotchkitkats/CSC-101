/*  
    Stephanie Parma
    Professor Shaffer - CSC-101
    Project 2

    This program will take input in the form of an integer to play rock paper scissors against a  
    computer which uses a randomly generated number to pick a move. The program will then return
    the number of games played, wins, losses, and ties.  */

import java.util.*;

public class GameSP {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in); 
        int userSelection;
        String cpuMove;
        String playerMove;
        int wins = 0;
        int losses = 0;
        int ties = 0;
        int games = 0;

        System.out.println("Let's play Rock, Paper, Scissors!");

        do {
            System.out.println("Please enter 1 for Rock, 2 for Paper, 3 for Scissors, or 0 to End.");
            userSelection = kb.nextInt();

            Random random = new Random();
            int randomNumber = random.nextInt(3);

            if (randomNumber == 0) {
                cpuMove = "rock";
            } else if (randomNumber == 1) {
                cpuMove = "paper";
            } else {
                cpuMove = "scissors";
            }

            if (userSelection == 1){
                playerMove = "rock";
            } else if (userSelection == 2) {
                playerMove = "paper";
            } else if (userSelection == 3){
                playerMove = "scissors";
            } else if (userSelection == 0){
                playerMove = "";
            } else {
                System.out.println("Not a valid input. Please try again.");
                playerMove = "";
            }
            
            if (cpuMove.equals(playerMove)){
                System.out.println("You chose " + playerMove + ". The computer chose " + cpuMove + ".");
                System.out.println("It's a tie!\n");
                ties+=1;
                games+=1;
            } else if (cpuMove.equals("paper") && playerMove.equals("scissors") || cpuMove.equals("scissors") && playerMove.equals("rock") || cpuMove.equals("rock") && playerMove.equals("paper")) {
                System.out.println("You chose " + playerMove + ". The computer chose " + cpuMove + ".");
                System.out.println("You win!\n");
                wins+=1;
                games+=1;
            } else if (cpuMove.equals("scissors") && playerMove.equals("paper") || cpuMove.equals("paper") && playerMove.equals("rock") || cpuMove.equals("rock") && playerMove.equals("scissors")) {
                System.out.println("You chose " + playerMove + ". The computer chose " + cpuMove + ".");
                System.out.println("You lose!\n");
                losses+=1;
                games+=1;
            }

        } while (userSelection != 0);

        System.out.println("You chose to exit. Your statistics are: ");
        System.out.println("You played " + games + " game(s).");
        System.out.println("You won " + wins + " time(s).");
        System.out.println("You lost " + losses + " time(s).");
        System.out.println("You tied " + ties + " time(s).");
        System.out.println("Thanks for playing! Goodbye!");
    }
}
