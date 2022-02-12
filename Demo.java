public class Demo {
    public static void main(String[] args) {
        String nname, name, fname, lname;
        int age;

        fname = "john edward"; lname = "cabrera"; nname = "Ed's";
        name = fname + " " + lname;

        age = 33;

        String[] plang = {"html", "php", "java"};

        System.out.println( nname + " first Java program!"); //first line to display
        System.out.println(name + "'s next Goal is to become Java Developer");
        System.out.println("Eat | Sleep | Code == Never stop && Focus on your Goals");
        System.out.println("I'm " + age + " years old");
        System.out.println("I know " + plang.length + " programming language");
        System.out.println("these are " + plang[0] + " " + plang[1] + " " + plang[2]);
    }
}