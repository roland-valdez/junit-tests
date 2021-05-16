import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
public class CohortTest {



    @Test
    public void testAddToListStudent(){
        Student roland = new Student(1L, "roland");
        List<Student> students = new ArrayList<Student>();
        assertTrue(students.isEmpty());
        students.add(roland);
//        Cohort.addStudent(roland);
//        students.addStudent(roland);
//        assertEquals(1, students.size());

    }
    @Test
    public void testGetListStudents(){

    }

}
