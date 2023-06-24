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

    @Test
    public void tallestBillboardTest4() {
        int[] rods = {61,45,43,54,40,53,55,47,51,59,42};
        int expected = 275;
        int actual = new Solution().tallestBillboard(rods);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tallestBillboardTest5() {
        int[] rods = {1,2,4,8,16,32,64,128,256,512,50,50,50,150,150,150,100,100,100,123};
        int expected = 1023;
        int actual = new Solution().tallestBillboard(rods);
        Assert.assertEquals(expected, actual);
    }

}
