import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;

// Program to reverse the elements

public class ReverseOrder {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List <Integer> reverseOrder = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder);
    }
}
