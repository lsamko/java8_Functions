package java8;

import java.util.function.Function;

public class MethodReferences {
    public static void main(String[] args) {
        System.out.println(process("Hello World!", String :: toUpperCase));
    }

    private static String process(String sr, Function<String, String> doing) {
        return doing.apply(sr);
    }

}
