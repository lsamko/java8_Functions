import java.util.function.Predicate;

public class Predicate_OR {
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() > 10;
        }
    };

    public static void predicate_or(){
        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "Peter";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }

    public static void main(String[] args) {
        predicate_or();
    }
}
