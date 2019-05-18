package es.francisco.fizzbuzz;

public class FizzBuzz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";

    public String convert(int number) {
        if (divisibleBy(15, number)) return FIZZ + BUZZ;
        if (divisibleBy(3, number)) return FIZZ;
        if (divisibleBy(5, number)) return BUZZ;
        return String.valueOf(number);
    }

    private boolean divisibleBy(int factor, int number) {
        return number % factor == 0;
    }
}
