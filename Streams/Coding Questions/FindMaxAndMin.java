import java.util.Arrays;
import java.util.List;

// Finding the Maximum and Minimum numbers

public class FindMaxAndMin {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(12, 11, 2, 614, 0);
        int maxNo = numbers.stream().max(Integer::compareTo).orElse(-1);
        System.out.println("Maximum number is: " + maxNo);

        int minNo = numbers.stream().min(Integer::compareTo).orElse(-1);
        System.out.println("Minimum number is: " + minNo);
    }

}
