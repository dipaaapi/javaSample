public class Demo {
    public static void main(String[] args) {
        String nickName, name, fname, lname, knowledge;
        int age, techStack, uidesign, plang, max, min, todo1, todo2, todo3, enumn;
        boolean dev, x, qualified;
        double percent;

        // string section
        fname = "John Edward"; lname = "cabrera"; nickName = "ed"; knowledge = "Is he knowledgeable in programming? the answer is ";
        name = fname + " " + lname;

        // double section
        percent = 100.00;

        // array section
        String[] programmingLanguage = {"TypeScript", "JavaSript", "php", "java"};
        String[] uid = {"adobe xd", "balsamiq", "figma"};
        String[] todo = {"eat", "sleep", "code"};

        // integer section
        age = 33; uidesign = uid.length; plang = programmingLanguage.length; todo1 = todo[0].length(); todo2 = todo[1].length(); todo3 = todo[2].length(); enumn = 1;

        // boolean section
        dev = true; x = uidesign<plang; techStack = uid.length + programmingLanguage.length; qualified = uidesign < plang;

        // math method
        max = Math.max(uidesign, plang);
        min = Math.min(uidesign, plang);

        // display start here
        System.out.println( nickName + "'s first Java program!"); //first line to display
        System.out.println(name + "'s next Goal is to become Java Developer");
        System.out.println(todo[0] + " | " + todo[1] + " | "  + todo[2] + " | == Never stop && Focus on your Goals");
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
        System.out.println("Since " + nickName + " is " + qualified + " Dev he can do codings");
        if (uidesign > plang) {
            System.out.println(nickName.toUpperCase() + " is true UI Designer");
        } else {
            System.out.println(nickName.toUpperCase() + " is true Programmer");
        };
        switch(todo1) {
            case 1:
            System.out.println("Eating is important to acquired nutrients that our body need.");
            break;
            case 2:
            System.out.println(todo1 + "ing is essentially need to regenerate energy to continue your daily task.");
            break;
            case 3:
            System.out.println("Coding is the most important to learn new programming language");
            break;
            default:
            System.out.println("Nothing just playing games.");
        };
        while (enumn < 4) {
            System.out.println(enumn + " code!");
            enumn++;
        };
        do {
            System.out.println(enumn + " grind!");
            enumn++;
        }
        while (enumn < 4);
        for (int i = 1; i < 4; i++) {
            System.out.println(i + " goal!!");
        };
        for (int i = enumn; i < 10; i++) {
            if (i == 0) {
                System.out.println("this is it!");
                break;
            }
            System.out.println("display anything related to my skills");
        }
    }
}