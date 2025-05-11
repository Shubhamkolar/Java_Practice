

public class ReverseString{
    public static void main(String[] args) {
        
        String original = "Shubham";
        System.out.println("Orginal String is: " + original);
        String reversed = new StringBuilder(original).reverse().toString(); // .toString() converts the StringBuilder object back to a String type.
        System.out.println("Reversed String is: " + reversed);

        System.out.println("------------------Using a normal loop------------------");
    //  Using a Loop (Manual Way)
        String orginal1 = "Ram";
        System.out.println("Original string: " +  orginal1);
        String reverse1 = "";
        for(int i=orginal1.length()-1; i>=0; i--){
            reverse1 += orginal1.charAt(i); // concatenate i reverse
        }
        System.out.println("Reverse string using normal loop: " + reverse1);
    }
}