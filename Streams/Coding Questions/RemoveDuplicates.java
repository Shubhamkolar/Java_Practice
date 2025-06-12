import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicates {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 614);
        List <Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }
}
