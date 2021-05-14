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
    public void isArrayListEmpty(){
        Student roland = new Student(1L, "roland");

        assertTrue(roland.getGrades().isEmpty());
        roland.addGrade(100);
        assertFalse(roland.getGrades().isEmpty());

    }
}
