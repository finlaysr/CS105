public interface Account {
    public void openAccount(int accNum, char accType);
    public boolean deposit (int accNum, double amount);
    public boolean withdraw (int accNum, double amount);
    public double balance (int accNum);
    public double totalAssets ();
}
