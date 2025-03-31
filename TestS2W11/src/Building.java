public class Building
{
  private int windows;
  private double charge;

  public Building(int windows, double charge){
    this.windows = windows;
    this.charge = charge;
  }

  public double getTax(){
    return (double) windows * charge;
  }

}

