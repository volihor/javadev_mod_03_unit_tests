package global.goit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {

    private static SumCalculator sumCalc;

    @BeforeEach
    void init() {
        sumCalc = new SumCalculator();
    }

    @Test
    void sumOneTest() {
        assertEquals(1, sumCalc.sum(1));
    }

    @Test
    void sumThreeTest() {
        assertEquals(6,sumCalc.sum(3));
    }

    @Test
    void sumZeroExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> sumCalc.sum(0));
//        assertEquals(0,sumCalc.sum(0));
    }
}