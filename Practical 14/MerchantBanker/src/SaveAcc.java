public class SaveAcc extends BasicAccount{
    int interestRate;
    public SaveAcc(int acc, double bal, int rate) {
        super(acc, bal);
        interestRate = rate;
    }

    public void setRate(int newRate){
        interestRate = newRate;
    }

    public int getRate(){
        return interestRate;
    }

    public void addInterest(){
        deposit((double) interestRate /100*getBalance());
    }
}
