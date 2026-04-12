package UC3;

public class UC3 {
   public static void main(String[] args) {

        String name;

        if (args.length > 0 && !args[0].isEmpty()) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello " + name);
    }
}
    
