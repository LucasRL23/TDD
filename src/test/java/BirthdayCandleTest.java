import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BirthdayCandleTest {
    @Test
    public void testMaxCandleHeight() {
        BirthdayCandle birthdayCandle = new BirthdayCandle();
        int[] candleHeights = {4, 4, 1, 3};
        int result = birthdayCandle.countMaxHeightCandles(candleHeights);
        assertEquals(2, result);
    }
}
