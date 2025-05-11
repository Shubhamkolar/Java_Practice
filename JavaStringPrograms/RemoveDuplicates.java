public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Programming";

    //  Convert the string to a stream of characters, remove duplicates using a distinct()
    //  then append each character to a StringBuilder and collect as a final string.

        StringBuilder result = new StringBuilder();

        input.chars()   // Convert string to IntStream of character codes
             .distinct()    // Remove duplicates
             .forEach(c -> result.append((char) c)); // Append each unique character to result

        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + result.toString());
    }    
}
