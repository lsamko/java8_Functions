package java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Bi_Function {
    public static void main(String[] args)
    {
        System.out.println(process("Hello World!", sr -> sr.toLowerCase()));
        //System.out.println(process2("Hello World!", 5,  (sr, i ) -> sr.substring(i)));
        System.out.println(process2("Hello World!", 3,  String :: substring));
    }

    private static String process(String sr, Function<String, String> doing) {
        return doing.apply(sr);
    }

    private static String process2(String sr, int i, BiFunction<String,Integer, String> doing) {
        return doing.apply(sr, i);
    }
}
