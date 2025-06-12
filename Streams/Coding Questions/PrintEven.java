import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEven{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
        List <Integer> ans = list.stream(). filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(ans);
    }
}