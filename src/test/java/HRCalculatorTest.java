import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pl.julia.HRCalculator;

public class HRCalculatorTest {

    @Test
    public void testValidMaxHR() {
        var result = HRCalculator.calculateMaxHR(25);
        assertEquals(195, result);
    }

    @Test
    public void testInvalidMinHR_ageTooHigh() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(500));
    }

    @Test
    public void testInvalidMinHR_ageTooLow() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(-1));
    }
}