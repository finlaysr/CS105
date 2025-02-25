/**
 * A Student is a kind of Human but with an additional field
 * for registration number.
 */

// The class should be a subclass of Human
public class Student extends Human
{
    /** instance variable(s) */
    private String regNumber;

    /**
     * Constructor for objects of class Student
     *
     * @param aName the student's name
     * @param rNumber the student's registration number
     */
    public Student(String aName, String rNumber)
    {
        super(aName);
        regNumber = rNumber;
        // Provide the body for the constructor here.
        // Instance variables should be suitably initialised to
        // the values provided in the arguments.
        // The code here should make use of constructor chaining.




    }

    /**
     * Method to return the student's registration number
     *
     * @return     the registration number
     */
    public String getRegNumber()
    {
        return regNumber;
    }
}
