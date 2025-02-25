/**
 * Class HouseCost - a class to calculate the full cost of a house
 * in Javaland after adding tax.
 */
public class HouseCost
{
    /** instance variables */
    private int costBeforeTax;

    /**
     * constructor for objects of class HouseCost
     */
    public HouseCost(int basicCost)
    {
        costBeforeTax = basicCost;
    }

    /** instance method */

    /**
     * The full cost is returned. It is the basic cost plus
     * the tax. Tax of 2,500 beans is due 
     * to be paid on house purchases of 400,000 beans or more;
     * tax of 1,500 beans is due to be paid on house 
     * purchases of lower price but of 200,000 beans or more; 
     * and no tax is to be paid on houses of lower cost
     */
    public int ObtainFullCost()
    {
        int tax = 0;
        if (costBeforeTax >= 400000)
            tax = 2500;
        else if (costBeforeTax >= 200000)
            tax = 1500;
        return costBeforeTax + tax;
    }
}