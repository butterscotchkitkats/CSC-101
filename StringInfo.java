public class StringInfo {
    public static void main(String[] args) {
        String quote = new String("Heavy is the head that eats the crayon.");
        int length = quote.length();
        int spaceLocation = quote.indexOf(" ");
        String substring = quote.substring(0,5);
        String lastFiveCharacters = quote.substring(quote.length() - 5, quote.length());
        
        System.out.println("The quote: " + quote);
        System.out.println("The length of this quote is " + length + " characters.");
        System.out.println("The first space is at index " + spaceLocation);
        System.out.println("The first 5 characters are " + substring);
        System.out.println("The last 5 characters are " + lastFiveCharacters);



    }
}
