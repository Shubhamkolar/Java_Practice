import java.util.Arrays;

public class CheckAnagrams {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

    // Convert both strings into character arrays
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

    // Sort both character arrays
    // If the strings are anagrams, their sorted character arrays will be identical
        Arrays.sort(c1);
        Arrays.sort(c2);

    // Compare the sorted character arrays if they match, the strings are anagrams!
        if(Arrays.equals(c1, c2)){
            System.out.println("Both the strings are Aangrams!");
        } else{
            System.out.println("The String are NOT Aangrams");
        }
    }
    
}
