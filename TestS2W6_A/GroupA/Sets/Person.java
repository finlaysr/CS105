/**
 * Class Person - This class should not be altered in the lab test.
 */
public class Person
{
    /* instance variables */
    private String name; 
    private int IQ;

    /**
     * constructor for objects of class Person
     */
    public Person(String name, int IQ)
    {
        super();
        this.name = name;
        this.IQ=IQ;
    }


    /* instance methods */

    /**
     * returns the person's name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * returns the person's IQ
     */
    public int getIQ()
    {
        return IQ;
    }
    
    /**
     * updates the person's IQ
     */
    public void setIQ(int IQ)
    {
        this.IQ = IQ;
    }
}