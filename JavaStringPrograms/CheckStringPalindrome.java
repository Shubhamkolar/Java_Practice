import java.util.Scanner;



//  What Is a Palindrome?
//  A palindrome is a word, phrase, number, or sequence of characters that reads the same 
//  forward and backward.

public class CheckStringPalindrome{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String original = sc.nextLine();

        original = original.toLowerCase();  // for Case-insensitive
        String reversed = new StringBuilder(original).reverse().toString();

        if(original.equals(reversed)){
            System.out.println("The String is a palindrome");
        } else{
            System.out.println("The String is NOT a palindrome");
        }

        sc.close();


        System.out.println("----------------------Checking the number is Palindrome or not?----------------------");
//  A program to check if a number is Palindrome or Not?    
        int number = 1221;  
        int org = number;   // Store the original number for later comparison
        int reverse = 0;    // Variable to store the reversed numbers

        while(number != 0){
            int digit = number % 10;            // Get the last digit
            reverse = reverse * 10 + digit;     // Append the digit to reverse number
            number = number / 10;
        }

        // Compare the reverse number with the original number
        if(org == reverse){
            System.out.println(org + " is a palindrome number.");
        } else {
            System.out.println(org + " is NOT a Palindrome");
        }

    }
}