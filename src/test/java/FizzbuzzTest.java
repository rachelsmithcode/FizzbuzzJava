import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RachelSmith on 15/04/2016.
 */
public class FizzbuzzTest {

    @Test
    public void shouldReturnFizzIfNumberDivBy3(){
        assertEquals("fizz", Fizzbuzz.getResults(3));
    }


    @Test
    public void shouldReturnBuzzIfNumberDivBy5(){
        assertEquals("buzz", Fizzbuzz.getResults(5));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberDivBy3And5() {
        assertEquals("fizzbuzz", Fizzbuzz.getResults(15));
    }

}
