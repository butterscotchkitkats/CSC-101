import java.util.Scanner;

public class conversion {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int units;

        do {

            System.out.println("Would you like to convert cm to inches (1), inches to cm (2), or exit(3)?");
            units = kb.nextInt();

            if (units == 1){
                System.out.println("Please enter how many cm: ");
                Double cm = kb.nextDouble();
                System.out.println(cm + " centimeters is equal to " + cm/2.54 + " inches." );
                System.out.println(cm/.0328 + " is also equal to " + cm/0.0328 + " meters." );
            }

            else if (units == 2){
                System.out.println("Please enter how many inches: ");
                Double inches = kb.nextDouble();
                System.out.println(inches + " inches is equal to " + inches*2.54 + " centimeters." );
                System.out.println(inches*0.0254 + " is also equal to " + inches*0.0254 + " meters." );
            }

            else if (units == 3){
                return;
            }

            else {
                System.out.println("not a valid input");
            }

        } while (units != 3); 

    }
}
