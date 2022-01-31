class AboutMe {
    public static void main(String[] args) {
        String name = new String("Stephanie Parma");
        String town = new String("Rochester");
        int age = 20;
        double gpa = 0.69;

        System.out.println("My name is " + name + " and I live in " + town + ". \nI am " + age + " years old and my GPA is " + gpa);

        int number = town.length();
        System.out.println("My town has " + number + " letters.");
    }
}
