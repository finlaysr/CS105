import java.util.*;
/**
 * Class to represent a Company.
 * 
 */
public class Company
{
    private ArrayList<Employee> drones;

    /**
     * Constructor for objects of class Company
     */
    public Company(int n)
    {
        drones = new ArrayList<>();
    }

    /**
     * Add employees to company
     */
    public void addEmployee(Employee e)
    {
        drones.add(e);
    }
    
    /**
     * Print total salary cost for all staff with given surname
     * @param surname surname to search for
     */
    public int getSurnameSalaryBill(String surname)
    {
        // Complete this method and modify the line below
        return 0;
    }
    
}
