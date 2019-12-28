import java.util.ArrayList;
import java.util.List;

public class Train {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(printNumber().get(i));
        }
    }

    public static List<String> printNumber() {
        List<String> numbers = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbers.add("FizzBuzz");
            } else if (i % 3 == 0) {
                numbers.add("Fizz");
            } else if (i % 5 == 0) {
                numbers.add("Buzz");
            } else {
                numbers.add(String.valueOf(i));
            }
        }
        return numbers;
    }

    public static String printNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
