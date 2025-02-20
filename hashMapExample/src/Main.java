import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Float> products = new HashMap<>();
        Scanner getInput = new Scanner(System.in);
        System.out.println("Type a product then price, seperated by \", \" or type done");

        boolean done = false;
        while (!done) {
            System.out.print("Input: ");
            String input = getInput.nextLine().trim().toLowerCase();
            if (input.equals("done")) {
                done = true;
            } else {
                String[] parts = input.split(", ");
                System.out.println(Arrays.toString(parts));
                products.put(parts[0], Float.parseFloat(parts[1]));
            }
        }
        System.out.println(products);

        done = false;
        System.out.println("Type a product name to see it's price: ");
        while (!done) {
            System.out.print("Input: ");
            String input = getInput.nextLine().trim().toLowerCase();
            if (input.equals("done")) {
                done = true;
            } else {
                Float result = products.get(input);
                if (result == null) {
                    System.out.println("Could not find product");
                }
                else {
                    System.out.println(products.get(input));
                }
            }
        }
    }
}