public class P16Test {
    public static void main(String[] args) {
        MerchantBank mb = new MerchantBank();
        mb.loadBank();
        System.out.println(mb.totalAssets()); // Writes to IntelliJ Console
        mb.howMuchDosh();
    }
}

