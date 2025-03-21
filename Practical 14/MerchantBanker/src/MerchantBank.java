import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class MerchantBank implements Account{
    ArrayList<BasicAccount> accounts;

    public MerchantBank() {
        accounts = new ArrayList<>();

    }

    public void openAccount(int accNum, char accType) {
        if (accType == 'B'){
            accounts.add(new BasicAccount(accNum, 0));
        } else if (accType == 'K'){
            accounts.add(new KidsAcc(accNum, 0.0, 1));
        } else {
            accounts.add(new SaveAcc(accNum, 0.0, 3));
        }
    }

    private BasicAccount findAcc (int accNum){
        for (BasicAccount b: accounts){
            if (b.getAccNumber() == accNum) {
                return b;
            }
        }
        return null;
    }

    public boolean deposit (int accNum, double amount) {
        BasicAccount b = findAcc(accNum);
        if (b == null) return false;

        b.deposit(amount);
        return true;
    }

    public boolean withdraw (int accNum, double amount) {
        BasicAccount b = findAcc(accNum);
        if (b == null) return false;

        b.withdraw(amount);
        return true;

    }

    public double balance (int accNum) {
        BasicAccount b = findAcc(accNum);
        if (b == null) return -1;

        return b.getBalance();
    }

    public double totalAssets () {
        return accounts.stream().map(BasicAccount::getBalance).reduce(0.0, Double::sum);
    }

    public void loadBank() {
        try (Scanner reader = new Scanner(new File("Files/merchantbanker.txt"))) {
            while (reader.hasNext()) {
                int accNum = reader.nextInt();
                char accType = reader.next().charAt(0);
                int accAmount = reader.nextInt();

                if (accType == 'B') {
                    accounts.add(new BasicAccount(accNum, 0));
                } else if (accType == 'K') {
                    accounts.add(new KidsAcc(accNum, 0, 0));
                } else if (accType == 'S') {
                    accounts.add(new SaveAcc(accNum, 0, 0));
                }
                accounts.getLast().deposit(accAmount);
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("Couldnae find the file");
        }
    }

    public void howMuchDosh() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Files/dosh.txt"))) {
            writer.write("Bank's total assets are: £" + totalAssets());
        }
        catch (IOException e){
            System.out.println("Couldnae write the file");
        }
    }

}
