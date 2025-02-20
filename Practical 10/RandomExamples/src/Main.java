import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * This random class does some random things
 *
 * @author Finlay Robb
 * @version 1.0 (27/01/2025)
 */


/**
 * This constructor creates a new RandomExamples class
 */
public class Main {


    static Random randomGen = new Random();
    ArrayList<String> options = helper();


    /**
     * Does some tests
     * @param args does nothing
     */
    public static void main(String[] args) {

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(getYesNoResponse());
        }
    }


    private static ArrayList<String> helper(){
         return new ArrayList<>(Arrays.asList("A", "b", "Cd"));
    }


    /**
     * prints one random number
     */
    public static void printOneRandom() {
        System.out.println(randomGen.nextInt());
    }

    /**
     * prints an amount of random numbers equal to howMany
     * @param howMany how many random numbers to print
     */
    public static void printMultiRandom(int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.println(randomGen.nextInt());
        }
    }

    /**
     * returns a number from 0 to 6
     * @return {@code int} from 0 to 6
     */
    public static int throwDice() {
        return randomGen.nextInt(1, 7);
    }

    /**
     * Returns yes, no or maybe
     * @return {@code String} yes, no or maybe
     */
    public static String getYesNoResponse() {
        String[] options = {"yes", "no", "maybe"};
        return options[randomGen.nextInt(3)];
    }

    /**
     * Returns on of the responses
     * @return {@code String}
     */
    public String getResponse() {
        return options.get(randomGen.nextInt(options.size()));
    }


}