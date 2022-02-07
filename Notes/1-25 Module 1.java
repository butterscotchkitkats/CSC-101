class Practice {
    public static void main(String[] args){  // When a class is created, this line is needed
    }

// byte - takes up 8 bits (1 byte)
// short - takes up 16 bits (2 bytes)
// int - takes up 32 bits (4 bytes)

// Variables and Identifiers
// to create a variable, you need to declare the type of data that will be stored in it and you need to give it a name.

double cost = 9.99;

// If the variable name contains more than one word, then the nth word is capitalized. This is called camel case.

String greeting = new String("Hello");
}

// The "new" keyword creates the string followed by a repeat of the class name.

class StringClass{
public void main(String[] args){
    String greeting = new String("Hello");
    String name = new String("Candy");}

// Use .length() to obtain an int containing the length of the string

String greeting = ("Hello");
int theLength = greeting.length();


// the indexOf method will give you information about whether or nat a certain character is  present in a string as well as where it can be found.
// it returns an integer expressing the index of the character in the string

String text = "doorknob";
int dLocation = text.indexOf("d");

// If there are two or more instances of the value, Java will only determine the length of the first one. 
// If there are no instances of the value, Java will return an int of -1.

// The .substring() method also makes use of indexing, however you have to pass the index values in and then you'll get a String back.

String word = text.substring(0,5);
System.out.Print(word);

}

