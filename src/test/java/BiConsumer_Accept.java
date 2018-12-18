import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumer_Accept {
    public static void main(String[] args) {

        // Create the first list
        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(5);
        listA.add(8);


        // Create the second list
        List<Integer> listB = new ArrayList<>();
        listB.add(3);
        listB.add(9);
        listB.add(2);

        // BiConsumer to compare both lists
        BiConsumer<List<Integer>, List<Integer>>
                equals = (list1, list2) ->
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
        equals.accept(listA, listB);
    }
}
