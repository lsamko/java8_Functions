package java8;

import java.util.function.Function;

public class Concat {

    public static void main(String[] args)
    {
       final String prefix = "MR. ";
        System.out.println(process("Hello World!", sr -> prefix.concat(sr)));
        System.out.println(process("Hello World!", prefix::concat));
    }

    private static String process(String sr, Function<String, String> doing) {
        return doing.apply(sr);
    }

}
