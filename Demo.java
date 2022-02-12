public class Demo {
    public static void main(String[] args) {
        String nname, name, fname, lname;
        int age;
        boolean dev, x;
        double percent;

        fname = "john edward"; lname = "cabrera"; nname = "Ed's";
        name = fname + " " + lname;

        age = 33;

        percent = 100.00;

        String[] plang = {"TypeScript", "JavaSript", "php", "java"};
        String[] uid = {"adobe xd", "balsamiq", "figma"};

        dev = true; x = uid.length<plang.length;

        System.out.println( nname + " first Java program!"); //first line to display
        System.out.println(name + "'s next Goal is to become Java Developer");
        System.out.println("Eat | Sleep | Code == Never stop && Focus on your Goals");
        System.out.println("I'm " + age + " years old");
        System.out.println("I know " + plang.length + " programming language");
        System.out.println("these are " + plang[0] + " " + plang[1] + " " + plang[2] + " " + plang[3]);
        System.out.println("I also know " + uid.length + " UI Designing");
        System.out.println("these are " + uid[0] + " " + uid[1] + " " + uid[2]);
        System.out.println("Is " + fname + " is dev?");
        System.out.println("The answer is " + dev + " he is " + percent + "% Dev.");
        System.out.println("In total knowledge in programming are " + plang.length + " and in UI Design " + uid.length);
        System.out.println("Is he knowledgable in programming? the answer is " + x);
    }
}