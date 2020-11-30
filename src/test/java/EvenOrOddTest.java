import org.junit.Assert;
import org.junit.Test;

public class EvenOrOddTest {

    @Test
    public void shouldReturnOdd() {
        OddOrEven oddoreven = new OddOrEven();
        int[] numbers = {10,20,30,41};
        String results = oddoreven.getResults(numbers);
        Assert.assertEquals("odd", results);
    }
    @Test
    public void shouldReturnEven(){
        OddOrEven oddoreven = new OddOrEven();
        int[] numbers = {10,20,30,40};
        String results = oddoreven.getResults(numbers);
        Assert.assertEquals("even", results);
    }
}
