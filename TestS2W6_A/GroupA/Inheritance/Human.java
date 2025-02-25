/**
 * Class Human has a single field called name, a constructor and a getter for name.
 */
public class Human
{
    // instance variable
    private String name;

    /**
     * Constructor for objects of class Human
     * 
     * @param aName the human's name
     * */
    public Human(String aName)
    {
        // initialises instance variable
        name = aName;
    }

    /**
     * Method to return the human's name
     * 
     * @return     the human's name 
     */
    public String getName()
    {
        return name;
    }
}