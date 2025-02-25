// Do not delete these imports as they are needed for the tests.
// If you delete them some of the tests will fail.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HouseCostTest {

    @Test
    void testObtainFullCost() {
        HouseCost houseCost = new HouseCost(400001);
        assertEquals(402501, houseCost.ObtainFullCost());

        HouseCost houseCost2 = new HouseCost(400000);
        assertEquals(402500, houseCost2.ObtainFullCost());

        HouseCost houseCost3 = new HouseCost(399999);
        assertEquals(401499, houseCost3.ObtainFullCost());

        HouseCost houseCost4 = new HouseCost(200000);
        assertEquals(201500, houseCost4.ObtainFullCost());

        HouseCost houseCost5 = new HouseCost(199999);
        assertEquals(199999, houseCost5.ObtainFullCost());


        /*  ADD YOUR CODE HERE */

    }

}
