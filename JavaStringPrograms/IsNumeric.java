public class IsNumeric {
    public static void main(String[] args) {
        String input = "614";

    // Using build-in method matches() with regex
        if(input.matches("\\d+")){
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string does NOT contain only digits.");
        }
    }
    
}
