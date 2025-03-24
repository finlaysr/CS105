public class KidsAcc extends BasicAccount{
    int bonus;
    public KidsAcc(int acc, double bal, int bonus) {
        super(acc, bal);
        this.bonus = bonus;

    }

    public void setBonus(int newBonus){
        bonus = newBonus;
    }
    public int getBonus(){
        return bonus;
    }

    public void deposit(double deposit) {
        super.deposit(bonus+deposit);
    }
}
