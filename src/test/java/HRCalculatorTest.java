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

    @Test
    public void testWorkoutZone_Light() {
        assertEquals("Light", HRCalculator.getWorkoutZone(30, 90));
    }

    @Test
    public void testWorkoutZone_FatBurn() {
        assertEquals("Fat Burn", HRCalculator.getWorkoutZone(30, 124));
    }

    @Test
    public void testWorkoutZone_Aerobic() {
        assertEquals("Aerobic", HRCalculator.getWorkoutZone(30, 143));
    }

    @Test
    public void testWorkoutZone_Anaerobic() {
        assertEquals("Anaerobic", HRCalculator.getWorkoutZone(40, 150)); // Example from PDF
        assertEquals("Anaerobic", HRCalculator.getWorkoutZone(30, 160));
    }

    @Test
    public void testWorkoutZone_Max() {
        assertEquals("Max", HRCalculator.getWorkoutZone(30, 181));
    }

    @Test
    public void testWorkoutZone_AboveMax() {
        assertEquals("Above Max", HRCalculator.getWorkoutZone(30, 200));
    }
}