
/**
 * Class to represent a company's Employee
 */
public class Employee
{
    // instance variables - replace the example below with your own
    private String name;
    private int grade;
    private int salary;

    /**
     * Constructor for objects of class Employee
     */
    public Employee(String n, int g, int s)
    {
        name = n;
        grade = g;
        salary = s;
    }
    
    public String getName() {
        return name;   
    }

    /**
     * Return the grade of an employee
     */
    public int getGrade()
    {
        return grade;
    }
    
    /**
     * Return the salary of an employee
     */
    public int getSalary()
    {
        return salary;
    }
    
    /**
     * Print he details of an employee
     */
    public void employeeDetails()
    {
        System.out.println("Name: " + name + " Grade: " + grade + " Salary: " + salary);
    }
}
