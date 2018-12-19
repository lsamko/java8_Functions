import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_in_Collection {
    String name, role;

    Predicate_in_Collection(String a, String b) {
        name = a;
        role = b;
    }

    String getName() {
        return name;
    }

    String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Predicate_in_Collection{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Predicate_in_Collection> predicate_in_collections = new ArrayList<>();
        predicate_in_collections.add(new Predicate_in_Collection("John", "admin"));
        predicate_in_collections.add(new Predicate_in_Collection("Peter", "member"));
        List admins = process(predicate_in_collections, (Predicate_in_Collection p) -> p.getRole().equals("admin"));
        System.out.println(admins);
    }

    public static List<Predicate_in_Collection> process(List<Predicate_in_Collection> predicate_in_collections,
                                                        Predicate<Predicate_in_Collection> predicate) {
        List<Predicate_in_Collection> result = new ArrayList<>();
        for (Predicate_in_Collection pr
                : predicate_in_collections) {
            if (predicate.test(pr))
                result.add(pr);
        }
        return result;
    }

}
