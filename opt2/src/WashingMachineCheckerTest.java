import org.junit.Assert;
import org.junit.Test;

public class WashingMachineCheckerTest {

    @Test
    public void testIsWashingMachineValid_Case1() {
        boolean result = WashingMachineChecker.isWashingMachineValid(15.0, 1.0, false, 1.0);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case2() {
        boolean result = WashingMachineChecker.isWashingMachineValid(25.0, 1.0, false, 1.0);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case3() {
        boolean result = WashingMachineChecker.isWashingMachineValid(15.0, 1.25, false, 1.0);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case4() {
        boolean result = WashingMachineChecker.isWashingMachineValid(25.0, 1.25, false, 1.0);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case5() {
        boolean result = WashingMachineChecker.isWashingMachineValid(15.0, 1.0, true, 1.0);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case6() {
        boolean result = WashingMachineChecker.isWashingMachineValid(25.0, 1.0, true, 1.0);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case7() {
        boolean result = WashingMachineChecker.isWashingMachineValid(15.0, 1.25, true, 1.0);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case8() {
        boolean result = WashingMachineChecker.isWashingMachineValid(25.0, 1.25, true, 1.0);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case9() {
        boolean result = WashingMachineChecker.isWashingMachineValid(15.0, 1.0, false, 1.3);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case10() {
        boolean result = WashingMachineChecker.isWashingMachineValid(25.0, 1.0, false, 1.3);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsWashingMachineValid_Case11() {
        boolean result = WashingMachineChecker.isWashingMachineValid(15.0, 1.25, false, 1.3);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case12() {
        boolean result = WashingMachineChecker.isWashingMachineValid(25.0, 1.25, false, 1.3);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsWashingMachineValid_Case13() {
        boolean result = WashingMachineChecker.isWashingMachineValid(15.0, 1.0, true, 1.3);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case14() {
        boolean result = WashingMachineChecker.isWashingMachineValid(25.0, 1.0, true, 1.3);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case15() {
        boolean result = WashingMachineChecker.isWashingMachineValid(15.0, 1.25, true, 1.3);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case16() {
        boolean result = WashingMachineChecker.isWashingMachineValid(25.0, 1.25, true, 1.3);
        Assert.assertFalse(result);
    }
}
