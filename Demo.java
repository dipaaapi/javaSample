public class Demo {
    public static void main(String[] args) {
        String nickName, name, fname, lname, knowledge;
        int age, techStack, uidesign, plang, max, min;
        boolean dev, x;
        double percent;

        fname = "john edward"; lname = "cabrera"; nickName = "ed"; knowledge = "Is he knowledgeable in programming? the answer is ";
        name = fname + " " + lname;

        percent = 100.00;
        
        String[] programmingLanguage = {"TypeScript", "JavaSript", "php", "java"};
        String[] uid = {"adobe xd", "balsamiq", "figma"};
        
        age = 33; uidesign = uid.length; plang = programmingLanguage.length;
        dev = true; x = uidesign<plang;
        techStack = uid.length + programmingLanguage.length;

        max = Math.max(uidesign, plang);
        min = Math.min(uidesign, plang);

        System.out.println( nickName + "'s first Java program!"); //first line to display
        System.out.println(name + "'s next Goal is to become Java Developer");
        System.out.println("Eat | Sleep | Code == Never stop && Focus on your Goals");
        System.out.println("I'm " + age + " years old");
        System.out.println("I know " + programmingLanguage.length + " programming language");
        System.out.println("these are " + programmingLanguage[0] + " " + programmingLanguage[1] + " " + programmingLanguage[2] + " " + programmingLanguage[3]);
        System.out.println("I also know " + uid.length + " UI Designing");
        System.out.println("these are " + uid[0] + " " + uid[1] + " " + uid[2]);
        System.out.println("Is " + fname.toUpperCase() + " is dev?");
        System.out.println("The answer is " + dev + " he is " + percent + "% Dev.");
        System.out.println("In total knowledge in programming are " + programmingLanguage.length + " and in UI Design " + uid.length);
        System.out.println(knowledge + " " + x);
        System.out.println(knowledge.indexOf("programming") + " is the age where I started \nmy dream to become an \tI.T.");
        System.out.println("though my techstack in UI Designing is " + min);
        System.out.println("but my techstack in programming language is " + max);
        System.out.println("that is why when I start my carrier in tech industry I gain " + techStack + " total in techstacks");
        System.out.println("The square root of ("+ techStack + ") techstack is " + Math.sqrt(techStack) + " I'm just saying hahaha");
        System.out.println("At least the number of techstack that I need to learn is " + (int)Math.random()*2);
    }
}