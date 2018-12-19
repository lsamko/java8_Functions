import java.util.function.Predicate;

public class Predicate_negate {
    public static Predicate<String> hasLengthOf10 = s -> s.length() >10;
public static void predicate_negate(){
    String lengthThan10 = "Blablabla....................................";
    boolean outcome = hasLengthOf10.negate().test(lengthThan10);
    System.out.println(outcome);
}

    public static void main(String[] args) {
        predicate_negate();
    }

}
