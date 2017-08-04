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

    @Test
    public void should_say_99999999999999999_when_number_is_111111111111111110() {
        long actualResult = exam01.max_number(111111111111111110L);
        assertEquals(99999999999999999L, actualResult);
    }

    public void should_say_989999999999999999_when_number_is_899999999999999999() {
        long actualResult = exam01.max_number(899999999999999999L);
        assertEquals(989999999999999999L, actualResult);
    }

    public void should_say_599999999999999999_when_number_is_653161544328834058() {
        long actualResult = exam01.max_number(653161544328834058L);
        assertEquals(599999999999999999L, actualResult);
    }

    @Test
    public void should_say_0_when_number_is_0() {
        long actualResult = exam01.max_number(0);
        assertEquals(0, actualResult);
    }

    @Test
    public void should_say_1_when_number_is_1() {
        long actualResult = exam01.max_number(8);
        assertEquals(8, actualResult);
    }

    @Test
    public void should_say_45_when_number_is_45() {
        long actualResult = exam01.max_number(45);
        assertEquals(45, actualResult);
    }
}