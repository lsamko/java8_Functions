import java.util.Objects;
import java.util.function.Predicate;

public class Predicate_AND {
    public static Predicate<String> hasLength10 = s -> s.length() > 10;

    public  static void predicate_and(){
        Predicate<String> nonNullPredicate = Objects::nonNull;
        String nullString = null;

        boolean outcome = nonNullPredicate.and(hasLength10).test(nullString);
        System.out.println(outcome);

       String lengthGTThan10 = "Welcome to the machine";
    boolean outcome2 = nonNullPredicate.and(hasLength10).test(lengthGTThan10);
        System.out.println(outcome2);
    }

    public static void main(String[] args) {
        predicate_and();
    }
}
