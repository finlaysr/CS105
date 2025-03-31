import java.util.*;
/**
 * Class to test Company class.
 */
public class TestCompany
{
    
    public void TestQ1()
    {
        Company co = new Company(20);
        co.addEmployee(new Employee("Pugh", 1, 10000));
        co.addEmployee(new Employee("Pugh", 2, 12500));
        co.addEmployee(new Employee("Barney McGrew", 3, 15000));
        co.addEmployee(new Employee("Cuthbert", 2, 12900));
        co.addEmployee(new Employee("Dibble", 1, 10030));
        co.addEmployee(new Employee("Grub", 2, 12700));
        co.printDetails();
        System.out.println("End of test1");
    }
    
    public void TestQ2()
    {
        Company co = new Company(21);
        co.addEmployee(new Employee("Pugh", 1, 10000));
        co.addEmployee(new Employee("Pugh", 2, 12500));
        co.addEmployee(new Employee("Barney McGrew", 3, 15000));
        co.addEmployee(new Employee("Cuthbert", 2, 12900));
        co.addEmployee(new Employee("Dibble", 1, 10030));
        co.addEmployee(new Employee("Grub", 2, 12700));
        System.out.println(co.salaryBill());
        if (co.salaryBill() == 73130)
            System.out.println("OK");
        else
            System.out.println("Error! Should be 73130");    
        System.out.println("End of test2");
    }
    
    public void TestQ3()
    {
        Company co = new Company(22);
        co.addEmployee(new Employee("Pugh", 1, 10000));
        co.addEmployee(new Employee("Pugh", 2, 12500));
        co.addEmployee(new Employee("Barney McGrew", 3, 15000));
        co.addEmployee(new Employee("Cuthbert", 2, 12900));
        co.addEmployee(new Employee("Dibble", 1, 10030));
        co.addEmployee(new Employee("Grub", 2, 12700));
        ArrayList<Employee> g2s = co.gradeTwos();
        Iterator<Employee> it = g2s.iterator();
        while(it.hasNext())
        {
            Employee emp = it.next();
            emp.employeeDetails();
        }
        System.out.println("End of test3");
    }    
}
