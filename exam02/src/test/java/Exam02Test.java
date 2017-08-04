import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exam02Test {
    Exam02 exam02 = new Exam02();

    @Test
    public void buy_1A_should_price_100 () {
        exam02.addOrder('A');
        int actualResult = exam02.calculateMoney();
        assertEquals(100, actualResult);
    }

    @Test
    public void buy_1A_1B_should_price_190() {
        exam02.addOrder('A');
        exam02.addOrder('B');
        int actualResult = exam02.calculateMoney();
        assertEquals(190, actualResult);
    }

    @Test
    public void buy_1A_1B_1C_should_price_190() {
        exam02.addOrder('A');
        exam02.addOrder('B');
        exam02.addOrder('C');
        int actualResult = exam02.calculateMoney();
        assertEquals(270, actualResult);
    }

    @Test
    public void buy_1A_1B_1C_1D_should_price_190() {
        exam02.addOrder('A');
        exam02.addOrder('B');
        exam02.addOrder('C');
        exam02.addOrder('D');
        int actualResult = exam02.calculateMoney();
        assertEquals(320, actualResult);
    }

    @Test
    public void buy_1A_1B_1C_1D_1E_should_price_190() {
        exam02.addOrder('A');
        exam02.addOrder('B');
        exam02.addOrder('C');
        exam02.addOrder('D');
        exam02.addOrder('E');
        int actualResult = exam02.calculateMoney();
        assertEquals(425, actualResult);
    }

}
