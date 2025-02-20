/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2011.07.31
 */
public class Student extends Person
{
    // the student's full name

    private int credits;

    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String name, String personID) {
        super(name, personID);
        credits = 0;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints) {
        credits += additionalPoints;
    }

    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits() {
        return credits;
    }


}
