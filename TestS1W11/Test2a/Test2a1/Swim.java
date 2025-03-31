public class Swim{

    private double[] times;
    
    public Swim()
    {
        // complete the constructor
        times = new double[10];
        System.out.println(times.length);
    }
    
    public int winner()
    {
        // complete this method and modify the line below
        int min = 0;
        for (int i = 0; i < times.length; i++){
            
            if (times[i] < times[min]){
                min = i;
            }
            
        }
        
        return min+1;
    }


    // Do Not Modify Anything Below This Line

    public void recordResults(int lane, double time) {
        times[lane - 1]=time;
    }
    
    public int size(){
    return times.length;
    }

    public double check(int n){
    return times[n];
    }
}
