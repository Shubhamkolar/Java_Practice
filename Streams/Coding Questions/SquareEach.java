import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEach {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // .map(n -> n * n) squares each number.
        List <Integer> squareNos = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squareNos);

    }
}
