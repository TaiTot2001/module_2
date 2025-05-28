package CalculateNextDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {

    @Test
    void findNextDay() {

        String result = NextDayCalculator.findNextDay(1 , 1, 2018);
        assertEquals("2/1/2018", result);
    }
    @Test
    void findNextDay2() {
        String result = NextDayCalculator.findNextDay(31 , 1, 2018);
        assertEquals("1/2/2018", result);
    }
    @Test
    void findNextDay3() {
        String result = NextDayCalculator.findNextDay(30 , 4, 2018);
        assertEquals("1/5/2018", result);
    }
    @Test
    void findNextDay4() {
        String result = NextDayCalculator.findNextDay(28 , 2, 2018);
        assertEquals("1/3/2018", result);
    }
    @Test
    void findNextDay5() {
        String result = NextDayCalculator.findNextDay(29 , 2, 2020);
        assertEquals("1/3/2020", result);
    }
    @Test
    void findNextDay6() {
        String result = NextDayCalculator.findNextDay(31 , 12, 2018);
        assertEquals("1/1/2019", result);
    }
}
