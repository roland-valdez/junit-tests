import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class StudentTest {

    @Test
    public void constructorValid(){
        Student roland = new Student(1L, "roland");
        assertNotNull(roland);
        roland = null;
        assertNull(roland);

    }

    @Test
    public void constructorHasSetProperties(){
        Student roland = new Student(1L, "roland");
        assertEquals(1, roland.getId());
        assertNotEquals(2,roland.getId());
        assertEquals("roland", roland.getName());
        assertNotEquals("norma",roland.getName());
    }

    @Test
    public void testAddGradesWorks(){
        Student roland = new Student(1L, "roland");

        assertTrue(roland.getGrades().isEmpty());
        roland.addGrade(100);
        assertEquals(1, roland.getGrades().size());
        assertNotEquals(0, roland.getGrades().size());

    }

    @Test
    public void testGetGradeWorks(){
        Student roland = new Student(1L, "roland");
        roland.addGrade(100);
        roland.addGrade(50);
        assertSame(100, roland.getGrades().get(0));
        assertNotSame(50, roland.getGrades().get(0));
        assertSame(50, roland.getGrades().get(1));
        assertNotSame(100, roland.getGrades().get(1));

    }

    @Test
    public void testGetAverageWorks(){
        Student roland = new Student(1L, "roland");
        roland.addGrade(100);
        roland.addGrade(100);
        assertEquals(100, roland.getGradeAverage(), 0);
        roland.addGrade(0);
        roland.addGrade(0);
        assertEquals(50, roland.getGradeAverage(), 0);
        assertNotEquals(0, roland.getGradeAverage(), 0);
    }
}
