import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Person, Integer> people = new LinkedHashMap<>();

        people.put(new Person(17, "John"), 4);
        people.put(new Person(17, "John"), 4);

        System.out.println(people.keySet());
    }

}
