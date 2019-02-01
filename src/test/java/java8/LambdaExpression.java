package java8;

import java.util.function.Function;

public class LambdaExpression {
    public static void main(String[] args) {
        System.out.println(process("Hello World!", sr -> sr.toLowerCase()));
    }

    private static String process(String sr, Function<String, String> doing) {
        return doing.apply(sr);
    }

}
