import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "Shubham";

    //  Create a LinkedList to store character counts while preserving insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        
    //  Count the occurances of each character
        for(char c : input.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

    //  Find the first character with a count of 1
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First non-repeated character is: " + entry.getKey());
                return;
            }
        }

    //  If no non-repeated character is found
        System.out.println("No non-repeated character found.");
    }
}
