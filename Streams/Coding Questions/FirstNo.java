import java.util.Arrays;
import java.util.List;

// Find the first element greater than 10

public class FirstNo {
    
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(1, 2, 3, 10, 22, 33, 44);
        int findFirst = numbers.stream().filter(n -> n > 10).findFirst().get();
        System.out.println(findFirst);
    }
}
