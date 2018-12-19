import java.util.function.BinaryOperator;

public class BinaryOperator_functions {
    public static void main(String[] args) {

        //1. maxBy()
        BinaryOperator<Integer> max = BinaryOperator
                .maxBy(
                        (a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1)
                );
        System.out.println(max.apply(20, 43));

        //2. minBy()

        BinaryOperator<Integer> min = BinaryOperator
                .minBy(
                        (c, d) -> (c > d) ? 1 : ((c == d) ? 0 : -1)
                );
        System.out.println(min.apply(-4, 12));
    }
}
