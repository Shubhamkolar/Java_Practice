import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// Program to count the frequency of the elements

public class CountFrequency {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(12, 11, 10, 1, 2, 1, 2, 614); 
        Map<Integer, Long> frequencyMap = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println("Frequency of the numbers are: " +frequencyMap);

        // Code for strings
        List <String> fruits = Arrays.asList("Apple", "Banana", "Chiku", "Banana", "Chiku", "Strawberry");
        Map<String, Long> frequencyFruits = fruits.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println("Frequency of fruits are: " + frequencyFruits);
    }   
}
