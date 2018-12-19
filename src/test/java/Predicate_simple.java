import java.util.function.Predicate;

public class Predicate_simple {
    public static void main(String[] args) {

        // Creating predicate
        Predicate<Integer> lesserThan = a -> ( a < 18);

        // Calling Predicate method
        System.out.println(lesserThan.test(2));
    }
}
