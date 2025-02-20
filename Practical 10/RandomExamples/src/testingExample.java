public class testingExample {
    public boolean isBetween(int start, int end, int value) {
        return start <= value && value <= end;
    }

    public static void main(String[] args) {
        testingExample test = new testingExample();
        System.out.println(test.isBetween(2, 5, 3));
    }
}
