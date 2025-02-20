public class Person {
    // the student's full name
    private String name;
    // the student ID
    private final String id;

    public Person(String fullName, String personID) {
        name = fullName;
        id = personID;
    }

    /**
     * Return the full name of this student.
     */
    public String getName() {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName) {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getId() {
        return id;
    }

    public String getLoginName() {
        return name.substring(0,4) + id.substring(0,3);
    }

    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
