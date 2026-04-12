package UC7;

public class UC7 {
      public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // Join all names using space as delimiter
            String names = String.join(" ", args);

            System.out.println("Hello, " + names);
        }
    }
}
    

