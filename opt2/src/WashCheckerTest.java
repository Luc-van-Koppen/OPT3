import org.junit.Assert;
import org.junit.Test;

public class WashCheckerTest {

    @Test
    public void testIsWashValid_ValidWash() {
        boolean result = WashChecker.isWashValid(4, true, 15);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsWashValid_InvalidDuration() {
        boolean result = WashChecker.isWashValid(6, true, 10);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashValid_NotPaid() {
        boolean result = WashChecker.isWashValid(3, false, 12);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashValid_After6PM() {
        boolean result = WashChecker.isWashValid(5, true, 18);
        Assert.assertFalse(result);
    }
}