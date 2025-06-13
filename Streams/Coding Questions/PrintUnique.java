import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUnique {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(11, 22, 11, 22, 614);
        List <Integer> unique = numbers.stream().filter(x -> Collections.frequency(numbers, x) == 1).collect(Collectors.toList());
        System.out.println("Unique element is: " + unique);
    }
}
