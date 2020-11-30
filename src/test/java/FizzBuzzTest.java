import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzIfTheNumberDivisibleBy3(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String results = fizzbuzz.getResults(3);
        Assert.assertEquals("fizz",results);

    }

    @Test
    public void shouldReturnBuzzIfTheNumberIsDivisibleBy5(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String results = fizzbuzz.getResults(5);
        Assert.assertEquals("buzz", results);
    }

    @Test
    public void shouldReturnFizzBuzzIfTheNumberIsDivisibleBy15(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String results = fizzbuzz.getResults(15);
        Assert.assertEquals("fizzbuzz", results);
    }

}
