// Do not delete these imports as they are needed for the tests.
// If you delete them some of the tests will fail.
import java.util.HashSet;

public class Fruits {

    /* Insert code here to declare the variable fruitSet
     * so that it can refer to a HashSet of Strings objects.
     */

    private HashSet<String> fruitSet;

    /* Insert code here to initialize fruitSet as a new, empty HashSet
     * of String objects.
     */
    public Fruits(){
        fruitSet = new HashSet<>();
    }

    public void addFruit(String name){
        fruitSet.add(name);
    }

    public void removeFruit(String name){
        fruitSet.remove(name);
    }

    public void removeAllFruits(){
        fruitSet.clear();
    }

    /** This method iterates through the fruitSet and
     * prints each fruit name to the console.
     */
    public void display(){
        for (String aFruit: fruitSet)
        {
            System.out.println(aFruit);
        }
    }

}
