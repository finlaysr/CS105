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
        System.out.println(co.getSurnameSalaryBill("McGrew"));
        System.out.println("End of test1");
    }
}
