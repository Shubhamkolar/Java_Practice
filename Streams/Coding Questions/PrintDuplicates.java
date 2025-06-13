import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


// Program to print only the duplicates 

public class PrintDuplicates {
    
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(12, 12, 11, 22, 23, 4, 66, 7);
        List <Integer> printDuplicate = numbers.stream().filter(x -> Collections.frequency(numbers, x) > 1).collect(Collectors.toList());
        System.out.println(printDuplicate);
    }
}
