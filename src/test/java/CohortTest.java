

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort singleStudent;
    Cohort twoStudents;

    @Before
    public void start(){
        singleStudent = new Cohort();
        twoStudents = new Cohort();
        Student roland = new Student(1L, "roland");
        Student norma = new Student(5L, "norma");
        roland.addGrade(100);
        norma.addGrade(50);
        singleStudent.addStudent(roland);
        twoStudents.addStudent(roland);
        twoStudents.addStudent(norma);
    }

    @Test
    public void testCanAddStudents(){
        assertEquals(1, singleStudent.getStudents().size());
        assertEquals(2, twoStudents.getStudents().size());
    }

    @Test
    public void testCanGetStudent(){
        assertEquals("roland", singleStudent.getStudents().get(0).getName());
        assertEquals("norma", twoStudents.getStudents().get(1).getName());
    }

    @Test
    public void testAverageWorks(){
        assertEquals(100, singleStudent.getCohortAverage(), 0);
        assertEquals(75, twoStudents.getCohortAverage(), 0);
    }


}