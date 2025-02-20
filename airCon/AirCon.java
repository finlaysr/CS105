public class AirCon {
    
    private int desiredTemp;
    private boolean on;
    
    public AirCon () {
        desiredTemp = 20;
        on = true;
    }
    
    //Getters
    public int getDesiredTemp () {
        return desiredTemp;
    }
    
    public void printTemp () {
        System.out.println("The desired temperature is " + desiredTemp);
        
        if (on) {
            System.out.println("The air conditioning unit is on");
        }
        else{
            System.out.println("The air conditioning unit is off");
        }
    }
    
    public boolean isOn () {
        return on;
    }
    
    //Setters
    public void increaseTemp () {
        desiredTemp += 2;
    }
    
    public void decreaseTemp () {
        desiredTemp -= 2;
    }
    
    public void increaseTemp (int amount) {
        desiredTemp += amount;
    }
    
    public void turnOn () {
        on = true;
    }
    
    public void turnOff () {
        on = false;
    }
}
