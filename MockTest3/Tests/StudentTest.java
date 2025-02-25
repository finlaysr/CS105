// IMPORTANT: Do not delete any of these lines bellow
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testGetGrade() {
        /* ADD YOUR CODE HERE */
        Student student1 = new Student("bob", 70);
        assertEquals("First", student1.getGrade());
        Student student2 = new Student("ben", 40);
        assertEquals("Pass", student2.getGrade());
        Student student3 = new Student("ben", 39);
        assertEquals("Fail", student3.getGrade());
    }

}