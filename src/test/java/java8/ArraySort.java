package java8;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        String[] names = {"Mr. John", "Dr. James", "Ms. Susi"};
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.split(" ")[1].compareTo(name2.split(" ")[1]);
            }
        });

        System.out.println(Arrays.toString(names));

        //----------------LAMBDA---------------------//

        String[] names2 = {"Mr. John", "Dr. James", "Ms. Susi"};
        Arrays.sort(names2, (name3, name4) ->
                name3.split("")[1].compareTo(name4.split(" ")[1]));
        System.out.println(Arrays.toString(names2));

        //-------------OR-----------------//

        Arrays.sort(names2, Comparator.comparing(name -> name.split(" ")[1]));
        System.out.println(Arrays.toString(names2));

    }
}
