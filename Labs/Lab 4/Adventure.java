import java.util.*;

public class Adventure {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("You see a hallway to the left and a large room to the right. \nWould you like to go left or right?: ");
        String choice = kb.nextLine();

        if (choice.equals("left")){
            System.out.print("Theres an open window to your right and another door to your left. \nWould you like to go left or right?: ");
            choice = kb.nextLine();

            if(choice.equals("left")){
                System.out.print("You open the door and encounter a bear. \nYou are surprised by the bear and are unable to defend yourself. You die.");
            }

            else if(choice.equals("right")){
                System.out.print("You jump out the window and plummet to the ground. \nYou die.");
            }   

            else{
                System.out.print("That was not a valid input. Goodbye.");
            }
        }

        else if (choice.equals("right")){
            System.out.print("Theres another hallway to your left and a room with a chest to your right. \nWould you like to go left or right?: ");
            choice = kb.nextLine();

            if(choice.equals("left")){
                System.out.print("You enter the hallway and follow it to the end. \nYou successfully navigate through the dungeon without any problems. Congratulations!");
            }

            else if(choice.equals("right")){
                System.out.print("You encounter a shadowy figure with a comically large sword. He draws his sword and engages you in combat. \nYou are unable to defend yourself. You die.");
            }   

            else{
                System.out.print("That was not a valid input. Goodbye.");
            }
        }

        else{
            System.out.print("That was not a valid input. Goodbye.");
        }
    }
}
    
