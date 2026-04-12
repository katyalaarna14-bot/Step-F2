package UC5;

public class UC5 {
   public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }
    }
    
}
