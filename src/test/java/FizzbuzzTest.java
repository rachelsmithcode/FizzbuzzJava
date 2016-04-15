import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RachelSmith on 15/04/2016.
 */
public class FizzbuzzTest {

    @Test
    public void shouldReturn3IfNumberDivBy3(){
        assertEquals("fizz", Fizzbuzz.getResults(3));
    }

}