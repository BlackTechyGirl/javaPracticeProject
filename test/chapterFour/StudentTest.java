package chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;
    @BeforeEach
    public void setUp() {
        student = new Student("Martha", 80.0);
    }

    @Test
    public void studentExist(){
        assertNotNull("Martha", student.getName());
    }
    @Test
    public void studentHasAnAverage(){
        assertEquals(80.0, student.getAverage());
    }

    @Test
    public void studentHasLetterGrade(){
        assertEquals("B", student.getLetterGrade());
    }
}
