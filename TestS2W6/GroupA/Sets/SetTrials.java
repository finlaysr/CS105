// Do not delete these imports as they are needed for the tests.
// If you delete them some of the tests will fail.
import java.lang.reflect.*;
import java.util.HashSet;

/**
 * Class SetTrials - for use in CS.105 lab test
 */
public class SetTrials
{
    /* Insert code here to declare variables setA and setB
     * so that they can each refer to a HashSet of Person objects.
     */




    /**
     * Constructor for objects of class SetTrials
     */
    public SetTrials()
    {

        /* Insert code here to initialize setA as a new, empty HashSet
         * of Person objects. Similarly, initialize setB as a new,
         * empty HashSet of Person objects.
         */



    }

    /**
     * Removes all elements from setA that are also present in setB.
     */
    public void removeCommonElements(){

        /* Insert code here to remove all elements from setA
         * that are also present in setB. This can be done
         * using a single statement.
         *
         * Check the Java API for assistance - look at the methods inherited
         * by HashSet as well.
         *
         * Your code should work for any set contents, without depending on
         * specific elements in setA or setB.
         */






    }

    /**
     * Displays the contents of both sets (setA and setB)
     * by calling the displaySet method for each.
     */
    public void display(){
        System.out.println("Set A contains: ");
        displaySet(setA);
        System.out.println("Set B contains: ");
        displaySet(setB);
    }

    /**
     * Displays the contents of the set passed as parameter - do not
     * alter this method in the lab test
     */
    private void displaySet(HashSet<Person> aSet)
    {
        for (Person aPerson: aSet)
        {
            System.out.println(aPerson.getName() + " with IQ of "
                    + aPerson.getIQ());
        }
        System.out.println();
    }

    /**
     *Creates a new Person object with the given name and IQ
	 *and adds it to setA - do not alter this method
     *in the lab test
	 */
    public void addSetA(String name, int IQ){
        Person p = new Person(name, IQ);
        setA.add(p);
    }


    /**
     *Creates a new Person object with the given name and IQ
     *and adds it to setB - do not alter this method
     *in the lab test
     */
    public void addSetB(String name, int IQ){
        Person p = new Person(name, IQ);
        setB.add(p);
    }

    /**
     *Fills the sets with some sample data - do not alter this method
     *in the lab test
     */
    public void fillSets()
    {
        Person p = new Person("George Swooney", 130);
        setA.add(p);
        setB.add(p);
        p = new Person("Dyson Wilder", 140);
        setA.add(p);
        p = new Person("Norris Crump", 80);
        setB.add(p);
        p = new Person("Nicky Goldfish", 120);
        setA.add(p);
        setB.add(p);
        p = new Person("Angela Markle", 150);
        setA.add(p);
        p = new Person("Kyle Vogue", 110);
        setB.add(p);
    }
}

