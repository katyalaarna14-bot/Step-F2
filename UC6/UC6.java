package UC6;

public class UC6 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder result = new StringBuilder("Hello ");

            for (String name : args) {
                result.append(name).append(", ");
            }

           
            String output = result.substring(0, result.length() - 2);

            System.out.println(output);
        }
    }
    
}
