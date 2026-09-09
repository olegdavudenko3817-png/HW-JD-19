import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumOne() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    void testSumTwo() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    void sumShouldThrowExceptionWhenInputIsZero() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
