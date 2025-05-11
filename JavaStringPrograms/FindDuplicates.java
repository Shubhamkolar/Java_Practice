import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        
        String input = "Programming";
        System.out.println("Input is: Programming");

    //  Convert the input string to lowercase
         input = input.toLowerCase();

    // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        
    // Traverse the string and update character counts using getOrDefault
        for(char c : input.toCharArray()){
            // getOrDefault returns the current count of character c, or 0 if not present
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
    //  Print characters that appears more than once.
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("'" + entry.getKey() + "' occurred " + entry.getValue() + " times");
            }
        }
    }
    
}
