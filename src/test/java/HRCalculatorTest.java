import org.junit.jupiter.api.Test;
import pl.julia.HRCalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HRCalculatorTest {
    @Test
    public void testValidMaxHR() {
        var result = HRCalculator.calculateMaxHR(25);
        assertEquals(195, result);
    }
}