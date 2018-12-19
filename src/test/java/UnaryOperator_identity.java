import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperator_identity {
    public static void main(String[] args) {

        // Instantiate the UnaryOperator interface
        UnaryOperator<Boolean> op = UnaryOperator.identity();

        // Apply identify() method
        System.out.println(op.apply(true));

//  these methods inherited from Function<T, T>:
// 1. accept

        UnaryOperator<Integer> xor = a -> a ^ 1;
        System.out.println(xor.apply(3));


// 2.addThen()

        UnaryOperator<Integer> xor1 = b -> b ^ 1;
        UnaryOperator<Integer> and = b -> b & 1;
        Function<Integer, Integer> compose = xor1.andThen(and);
        System.out.println(compose.apply(2));

        //3.compose()

        Function<Integer, Integer> compose1 = xor1.compose(and);
        System.out.println(compose.apply(3));
    }
}
