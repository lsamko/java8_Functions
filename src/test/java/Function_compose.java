import java.util.function.Function;

public class Function_compose {
    public static void main(String[] args) {


        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // However treble the value given to half function
        half = half.compose(a -> 3 * a);

        // apply the function to get the result
        System.out.println(half.apply(3));


        //To demonstrate when NullPointerException is returned.
        try {
            half.compose(null);
        } catch (Exception e) {
            System.out.println("Exception thrown " + e);
        }
    }
}
