import org.fest.assertions.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PrintNumberGameTest {
    private int number;
    private String expected;

    public PrintNumberGameTest(int number, String expected) {
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
        Assertions.assertThat(PrintNumberGame.printNumber(number)).isEqualTo(expected);
    }
}

