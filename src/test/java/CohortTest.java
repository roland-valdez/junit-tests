

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
//    Cohort singleStudent;
//    Cohort twoStudents;
//
//    @Before
//    public void start(){
//        singleStudent = new Cohort();
//        twoStudents = new Cohort();
//        Student roland = new Student(1L, "roland");
//        Student norma = new Student(5L, "norma");
//        roland.addGrade(100);
//        norma.addGrade(50);
//        singleStudent.addStudent(roland);
//        twoStudents.addStudent(roland);
//        twoStudents.addStudent(norma);
//    }

    @Test
//<<<<<<< HEAD
    public void testAddToListStudent() {
        Student norma = new Student (5L, "norma");
        norma.addGrade(100);
        norma.addGrade(100);
        assertEquals(2, norma.getGrades().size(), 0);
        Student roland = new Student(1L, "roland");
        roland.addGrade(50);
        assertEquals(1, roland.getGrades().size(), 0);
        Cohort singleStudent = new Cohort();
        singleStudent.addStudent(norma);
        assertEquals(1, singleStudent.getStudents().size());
        Cohort twoStudents = new Cohort();
        twoStudents.addStudent(norma);
        twoStudents.addStudent(roland);
        assertEquals(2, twoStudents.getStudents().size(), 0);

    }

    @Test
    public void testCanGetStudentList (){
        Student norma = new Student (5L, "norma");
        norma.addGrade(100);
        norma.addGrade(100);
        assertEquals(2, norma.getGrades().size(), 0);
        Student roland = new Student(1L, "roland");
        roland.addGrade(50);
        assertEquals(1, roland.getGrades().size(), 0);
        Cohort singleStudent = new Cohort();
        singleStudent.addStudent(norma);
        assertEquals("norma", singleStudent.getStudents().get(0).getName());
        Cohort twoStudents = new Cohort();
        twoStudents.addStudent(norma);
        twoStudents.addStudent(roland);
        assertEquals("norma", twoStudents.getStudents().get(0).getName());
        assertEquals("roland", twoStudents.getStudents().get(1).getName());
        assertNotEquals("roland", twoStudents.getStudents().get(0).getName());

    }

    @Test
    public void testCanGetAverage(){
        Student norma = new Student (5L, "norma");
        norma.addGrade(100);
        norma.addGrade(100);
        Student roland = new Student(1L, "roland");
        roland.addGrade(50);
        Cohort twoStudents = new Cohort();
        twoStudents.addStudent(norma);
        twoStudents.addStudent(roland);
        assertEquals(75, twoStudents.getCohortAverage(), 1);
        Student tatiana = new Student(1L, "tatiana");
        tatiana.addGrade(0);
        twoStudents.addStudent(tatiana);
        assertEquals(50, twoStudents.getCohortAverage(), 1);
        assertNotEquals(0, twoStudents.getCohortAverage(), 1);


//=======
//    public void testCanAddStudents(){
//        assertEquals(1, singleStudent.getStudents().size());
//        assertEquals(2, twoStudents.getStudents().size());
//    }
//>>>>>>> master
//
//    @Test
//    public void testCanGetStudent(){
//        assertEquals("roland", singleStudent.getStudents().get(0).getName());
//        assertEquals("norma", twoStudents.getStudents().get(1).getName());
//    }
//
//    @Test
//    public void testAverageWorks(){
//        assertEquals(100, singleStudent.getCohortAverage(), 0);
//        assertEquals(75, twoStudents.getCohortAverage(), 0);
//    }


}