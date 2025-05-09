package hashmap;

public class OurMapTest {
    public static void main(String [] args){

        OurMap<Integer, String> nameToLen = new OurMap<>();
        nameToLen.put(1, "aa");
        nameToLen.put(6, "Shubham");
        nameToLen.put(5, "acdef");
        nameToLen.put(3, "Shubh");
        nameToLen.put(5, "abc");

        System.out.println(nameToLen.get(5));
        System.out.println(nameToLen.get(1));
        System.out.println(nameToLen.get(6));
        System.out.println(nameToLen.get(3));
        System.out.println(nameToLen.get(5));

        
    }
}