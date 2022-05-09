public class PasswordSP {   
      public static boolean isValid(String password){
        if (!((password.length() >= 8)
              && (password.length() <= 15))) {
            return false;
        }
 
        if (true) {
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                String str1 = Integer.toString(i);
                if (password.contains(str1)) {
                    count = 1;
                }
            }

            if (count == 0) {
                return false;
            }
        }

        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) {
            return false;
        }
 
        if (true) {
            int count = 0;
            for (int i = 65; i <= 90; i++) {
                char c = (char)i;
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
 
        if (true) {
            int count = 0;
 
            for (int i = 97; i <= 122; i++) {

                char c = (char)i;
                String str1 = Character.toString(c);
 
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        System.out.Print("Enter a password to see if it satisfies all of the rules.");
        String password = kb.nextLine();
 
        if (isValid(password)) {
            System.out.println(password + "\nThis is a valid password.");
        }
        else {
            System.out.println(password + "\nInvalid Password Choice");
        }
    }
}