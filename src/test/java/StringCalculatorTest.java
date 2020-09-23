import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    void return_0_for_empty_string() {
        assertEquals(0, new StringCalculator().add(""));
    }
}