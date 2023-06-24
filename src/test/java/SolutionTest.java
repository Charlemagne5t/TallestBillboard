import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void tallestBillboardTest1() {
        int[] rods = {1, 2, 3, 6};
        int expected = 6;
        int actual = new Solution().tallestBillboard(rods);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tallestBillboardTest2() {
        int[] rods = {1, 2, 3, 4, 5, 6};
        int expected = 10;
        int actual = new Solution().tallestBillboard(rods);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tallestBillboardTest3() {
        int[] rods = {1, 2};
        int expected = 0;
        int actual = new Solution().tallestBillboard(rods);
        Assert.assertEquals(expected, actual);
    }
}
