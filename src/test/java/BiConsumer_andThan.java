import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumer_andThan {
    public static void main(String[] args) {

        // Create first list
        List<Integer> listA = new ArrayList<>();
        listA.add(2);
        listA.add(6);
        listA.add(7);

        // Create second list
        List<Integer> listB = new ArrayList<>();
        listB.add(4);
        listB.add(1);
        listB.add(3);

        // BiConsumer to compare 2 lists of integers
        BiConsumer<List<Integer>, List<Integer>> equals = (list1, list2) ->
        {
            if (list1.size() != list2.size()) {
                System.out.println("False");
            } else {
                for (int i = 0; i < list1.size(); i++)
                    if (list1.get(i) != list2.get(i)) {
                        System.out.println("False");
                        return;
                    }
                System.out.println("True");
            }
        };
        // BiConsumer to print 2 lists
        BiConsumer<List<Integer>, List<Integer>> disp = (list1, list2) ->
        {
            list1.stream().forEach(a -> System.out.println(a + " "));
            System.out.println();
            list2.stream().forEach(a -> System.out.println(a + " "));
            System.out.println();
        };


        // Using addThen() method
        equals.andThen(disp).accept(listA, listB);


        //To demonstrate how an Exception in the after function is returned and handled.
        BiConsumer<List<Integer>, List<Integer> > equals1 = (list3, list4) ->
        {
            for (int i = 0; i < list3.size(); i++)
                if (list3.get(i) != list4.get(i)) {
                    System.out.println("False");
                    return;
                }
            System.out.println("True");
        };

        BiConsumer<List<Integer>, List<Integer>> display = (list3, list4) ->
        {
            list3.stream().forEach(a -> System.out.println(a + " "));
            System.out.println();
            list4.stream().forEach(a -> System.out.println(a + " "));
            System.out.println();
        };
        try {
            display.andThen(null).accept(listA, listB);
            display.andThen(equals1).accept(listA, listB);
        } catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
}