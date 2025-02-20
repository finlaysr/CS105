import java.util.*;
/**
 * Class to represent a Company.
 * 
 */
public class Company
{
    private Employee[] drones;
    private int employees;

    /**
     * Constructor for objects of class Company
     */
    public Company(int n)
    {
        drones = new Employee[n];
        employees = 0;
    }

    /**
     * Add employees to company
     */
    public void addEmployee(Employee e)
    {
        drones[employees] = e;
        employees++;
    }
    
    /**
     * Print details of company's employees
     */ 
    public void printDetails()
    {
        // Complete this method
        for (int i=0; i<employees; i++){
            drones[i].employeeDetails();
        }
        
    }
    
    /**
     * Calculate company's total salary bill
     */
    public int salaryBill() {
        int total = 0;
        for (int i=0; i<employees; i++){
            total += drones[i].getSalary();
        }
        return total;
    }
    
    /**
     * Find all grade 2 employees
     */
    public ArrayList<Employee> gradeTwos() {
        // Complete this method and modify the line below
        ArrayList<Employee> twos = new ArrayList<>();
        for (int i=0; i<employees; i++){
            if (drones[i].getGrade() == 2){
                twos.add(drones[i]);
            }
        }
        return twos;
    }
    
    /**
     * Print total salary cost for all staff with given surname
     * @param surname surname to search for
     */
    public int getSurnameSalaryBill(String surname) {
        return drones.stream()
            .filter(s -> (s.getName().contains(surname)))
            .map(s -> s.getSalary())
            .reduce(0, (total, count) -> total + count);
        // Complete this method and modify the line below
    }
    

}
