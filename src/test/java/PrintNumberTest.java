import org.fest.assertions.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PrintNumberTest {
    private int number;
    private String expected;

    public PrintNumberTest(int number, String expected) {
        this.number = number;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, "Fizz"},
                {5, "Buzz"},
                {15, "FizzBuzz"}
        });
    }

    @Test
    public void test() {
        Assert.assertEquals(expected, Train.printNumber(number));
    }

    @Test
    public void print_fizz_test() {
        Assert.assertEquals("Fizz", Train.printNumber(3));
    }

    @Test
    public void print_buzz_test() {
        Assert.assertEquals("Buzz", Train.printNumber(10));
    }

    @Test
    public void print_fizz_buzz_test() {
        Assert.assertEquals("FizzBuzz", Train.printNumber(15));
    }

    @Test
    public void print_number_test() {
        //given
        int number = 1;
        //when
        String result = Train.printNumber(number);
        //then
        Assertions.assertThat(result).isEqualTo("1");
//        Assert.assertEquals("1", Train.printNumber(1));
    }
}
