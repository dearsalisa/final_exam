import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exam01Test {

    Exam01 exam01 = new Exam01();

    @Test
    public void should_say_8_when_number_is_8() {
        long actualResult = exam01.max_number(8);
        assertEquals(8, actualResult);
    }

    @Test
    public void should_say_9_when_number_is_10() {
        long actualResult = exam01.max_number(10);
        assertEquals(9, actualResult);
    }

    @Test
    public void should_say_19_when_number_is_20() {
        long actualResult = exam01.max_number(20);
        assertEquals(19, actualResult);
    }

    @Test
    public void should_say_129_when_number_is_132() {
        long actualResult = exam01.max_number(132);
        assertEquals(129, actualResult);
    }
}