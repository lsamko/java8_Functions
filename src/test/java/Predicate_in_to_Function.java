import java.util.function.Predicate;


public class Predicate_in_to_Function {
    static void pred(int number, Predicate<Integer> predicate) {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }

    public static void main(String[] args) {
        pred(8, (i) -> i > 7);
    }
}