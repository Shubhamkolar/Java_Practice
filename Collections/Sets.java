package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(2);
        System.out.println("Elements of set1 are: " + set1);

        set2.add(11);
        set2.add(1);
        set2.add(2);
        System.out.println("Elements of set2 are: " + set2);

        set1.retainAll(set2); // Common elements from set1 & set2
        System.out.println("After using retainAll on set1: " + set1);

        set2.removeAll(set1);
        System.out.println("Unique elements will be removed from set2: " + set2);
        
        set1.addAll(set2); // To perform UnionAll form both the sets

        set1.remove(2);
        System.out.println("Removing element 2 from set1 " + set1);

        set1.clear();
        System.out.println("After using clear() in the set1 " + set1);

//-------------------------------------LINKED HASHSET-------------------------------------

        Set<Integer> set3 = new LinkedHashSet<>();
        set3.add(0);
        set3.add(6);
        set3.add(1);
        set3.add(4);
        
        set3.add(1); // will be not added since its duplicate
        set3.add(4); // will be not added since its duplicate
        for(int x : set3){
            System.out.print(x + ", ");
        }

        

    }
}
