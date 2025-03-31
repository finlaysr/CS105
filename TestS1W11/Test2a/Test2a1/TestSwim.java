public class TestSwim{

    public void TestQ1()
    {
	Swim gala = new Swim();
	if (gala.size() == 10)
	    System.out.println("OK!");
	else
	    System.out.println("Error! - Should return 10");
    System.out.println("Test 1 Complete");
	}
	
	public void TestQ2()
    {
	Swim gala = new Swim();
	for(int i = 1; i < 6; i++)
	    gala.recordResults(i, 25 - 0.12 * i);
	for(int i = 6; i < 11; i++)
	    gala.recordResults(i, 24.5 + 0.12 * i);	
	if(gala.winner() == 5)
	    System.out.println("OK!");
	else
	    System.out.println("Error! - Should return 5");
    System.out.println("Test 2 Complete");
	}
}
