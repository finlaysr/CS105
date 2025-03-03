public class GoldAcc extends SaveAcc{
    double minBalance;

    public GoldAcc(int acc, double bal, int rate, double minBalance) {
        super(acc, bal, rate);
        this.minBalance = minBalance;
    }


    public void setMinBalance(double minB){
        minBalance = minB;
    }

    public double getMinBalance(){
        return minBalance;
    }

    public boolean withdraw(double amount) {
        if (getBalance() >= amount+minBalance) {
            super.withdraw(amount);
            return true;
        } else
            return false;
    }
}
