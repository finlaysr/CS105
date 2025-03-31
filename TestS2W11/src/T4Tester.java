import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class T4Tester
{
  public void test1() {
    Building b0 = new Building(8, 21.6);
    System.out.println("Council tax for building is: " + b0.getTax());
    // Output should be: 172.8 */
  }
  
  public void test2() {
	Flat f0 = new Flat(7, 18.5);
    System.out.println("Council tax for flat is: " + f0.getTax());
    // Output should be: 54.5 */
  }
  
  public void test3() {
    //DECLARE ArrayList district here.
    ArrayList<Building> district = new ArrayList<>();


    district.add(new Building(12, 15.30));
    district.add(new Flat(11, 16.5)); 
    district.add(new Building(10, 17.0));
    district.add(new Flat(9, 17.5));
    
    double totalTax = 0.0;
    
 	//DEFINE FOR LOOP here.
    for (Building b : district){
      totalTax += b.getTax();
    }

    System.out.println("Total tax for district is: " + totalTax);
    // Output should be: 542.6 */
   
  }  
  
  public void test4() {

	// Insert your code to read from file here.

    // Output should be: Total tax for district is: ???
    // The question marks should be replaced with your value.
    // For the given example, the value should be: 665.0.
    // Note the file used in the class test has different values
    // to buildings.txt. However, it still uses the same format.

    double totalTax = 0.0;

    try (Scanner reader = new Scanner(new File("src/buildings.txt"))) {
      while (reader.hasNext()) {
        char type = reader.next().charAt(0);
        int windows = reader.nextInt();
        double charge = reader.nextDouble();

        if (type == 'B') {
          totalTax += new Building(windows, charge).getTax();
        } else if (type == 'F') {
          totalTax += new Flat(windows, charge).getTax();
        }
      }
    }

    catch (FileNotFoundException e) {
      System.out.println("File not found :(");
    }

    System.out.println("Total tax for district is: " + totalTax);

  }
}


