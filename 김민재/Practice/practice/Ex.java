import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("James", "Alice", "Thomas");
        List<Integer> level = Arrays.asList(10, 20, 15);
        List<Integer> power = Arrays.asList(3000, 4000, 3500);
        names.stream().forEach(n-> System.out.println(n));
        System.out.println();

    }
}
