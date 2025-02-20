public class Main {
    public static void main(String[] args) {
        LabClass labClass = new LabClass(5);
        labClass.setTime("January 2021");
        labClass.setRoom("RC121");
        labClass.setInstructor(new Instructor("Bob", "123", "science"));
        labClass.enrollStudent(new Student("fin", "ABCD"));
        labClass.enrollStudent(new Student("ben", "EFGH"));
        labClass.printList();
    }
}