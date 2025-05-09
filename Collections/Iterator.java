package Collections;

// Iterable<T> is a core interface in Java from the java.lang package that allows an object to be iterated using a for-each loop.
// Implementing Iterable lets you loop through your collection in a clean and readable way using enhanced for-each loops.

public class Iterator {
    public static void main(String [] args){
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Iterator<Integer> iterator = list.iterator();
        // while(iterator.hasNext())
        //      System.out.println(iterator.next());

        for(int x : list)
            System.out.println(x);
    }
}
