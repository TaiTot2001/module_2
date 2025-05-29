package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {

    @Test
    void testFizz() {
        String result = FizzBuzzTranslate.translate(6);
        assertEquals("Fizz",result);
    }
    @Test
    void testBuzz() {
        String result = FizzBuzzTranslate.translate(5);
        assertEquals("Buzz",result);
    }
    @Test
    void testFizzBuzz() {
        String result = FizzBuzzTranslate.translate(15);
        assertEquals("FizzBuzz",result);
    }
    @Test
    void testNoFizzAndBuzz() {
        String result = FizzBuzzTranslate.translate(8);
        assertEquals(8+"",result);
    }
}
