import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class UpperCase {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("shubham", "tejam", "ketan", "ravya", "Rohya");
        List<String> upperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
