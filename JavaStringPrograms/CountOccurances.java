

public class CountOccurances{
    public static void main(String[] args) {
        
        String str = "ShubhamKolar";
        char targetChar = 'a';          // The character to count
        int count = 0;                  // Counter variable

        // Convert the string to lowercase if case-insensitive count is needed 
        // str = str.toLowerCase();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == targetChar){
                count++;
            }
        }
        System.out.println("character " + targetChar + " occured " + count + " times in the string " + str);
    
//  Program using filter() Method
        System.out.println("--------------Program using filter() method--------------");
        String name = "ShubhamKolar";
        char findChar = 'a';

        int find = (int) name.chars().filter(c -> c == findChar).count();
        System.out.println("The count of char " +  findChar + " in name " + name + " is " + find);
    }

}