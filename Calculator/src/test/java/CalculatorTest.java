import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void hasNum1() {
        Calculator calculator = new Calculator(4,7,21,3);
        assertEquals(4, calculator.getNum1());
    }

    @Test
    public void hasNum2() {
        Calculator calculator = new Calculator(4,7,21,3);
        assertEquals(7, calculator.getNum2());
    }

    @Test
    public void hasNum3() {
        Calculator calculator = new Calculator(4,7,21,3);
        assertEquals(21, calculator.getNum3());
    }

    @Test
    public void hasNum4() {
        Calculator calculator = new Calculator(4,7,21,3);
        assertEquals(3, calculator.getNum4());
    }

    @Test
    public void hasAddResult() {
        Calculator calculator = new Calculator(4,7,21,3);
        assertEquals(11, calculator.Add(4,7));
    }

    @Test
    public void hasSubtractResult() {
        Calculator calculator = new Calculator(4,7,21,3);
        assertEquals(-3, calculator.Subtract(4,7));
    }

    @Test
    public void hasMultiplyResult() {
        Calculator calculator = new Calculator(4,7,21,3);
        assertEquals(28, calculator.Multiply(4,7));
    }

    @Test
    public void hasDivideResult() {
        Calculator calculator = new Calculator(4,7,21,3);
        assertEquals(7, calculator.Divide(21,3));
    }


}
