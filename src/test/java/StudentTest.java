import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class StudentTest {

    @Test
    public void isLongNumber(){
        long number = 500;
        assertTrue(Long.class.isInstance(number));

    }

//    public void isUnique(){
//        for
//        assertTrue();
//    }
    @Test
    public void String(){
        String word = "";
        assertTrue(String.class.isInstance(word));
        assertFalse(String.class.isInstance(null));
        assertTrue(String.class.isInstance(""));
        assertFalse(String.class.isInstance(15));
    }
    @Test
    public void isGradesInt(){
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(50);
        grades.add(11);
        for (Integer grade : grades){
            assertTrue(Integer.class.isInstance(grade));
        }
    }

}
