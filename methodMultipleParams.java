public class methodMultipleParams {
    static void myMethod(String count, int enumn) {
        System.out.println(count + " " + enumn + "% done Coding!");
    }
    public static void main(String[] args) {
        myMethod("John is done", 90);
        myMethod("Edo is done", 50);
        myMethod("Jack is done", 10);
    }
}
