import org.junit.Assert;
import org.junit.Test;


public class MainTest {

    @Test
    public void sumOfOneToN1() {
        //Given
        Main main = new Main();

        //When
        int expected = main.sumOfOneToN(4, "sum");
        int actual = 10;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumOfOneToN2() {
        //Given
        Main main = new Main();

        //When
        int expected = main.sumOfOneToN(4, "product");
        int actual = 24;

        //Then
        Assert.assertEquals(expected, actual);
    }
}