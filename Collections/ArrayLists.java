package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String [] args){
        
//  Generics only allow Reference types. When working with collections we have to pass references.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("The elements are: " + list);

        list.set(0, 100);
        list.set(1, 200);
        list.set(2,300);
        System.out.println("Elements after updating values: " + list);

//  You can pass any collection into arraylist and make a clone (add elements of list into list2)  
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(400);
        System.out.println("List2 elements are: " + list2);

//  A method to add all elements into the existing array
        list2.addAll(list);
        System.out.println("List2 elements after adding all elements using 'addAll' method: " + list2);

//  Method to get a sublist from an entire array using indexes
//  Unlike copying elements using constructor was not modifying the actual list but using sublist it will modify the original list
        List<Integer> list3 = list2.subList(0, 3);
        list3.set(0, 11);
        System.out.println("List3 elements after using sublist " +list3);

// When you want to convert the ARRAYLIST --> ARRAY then use this method
        List<Integer> convert = new ArrayList<>();
        convert.add(6);
        convert.add(1);
        convert.add(4);

// (new Integer[0]) => When you passed an array whose size is less than this araylist then new array is being created whose size is equivalent to this arraylist. 
// If passed greater than or greater size then it'll consider null values if not it need and create memory wastage. 
        Integer [] arr = convert.toArray(new Integer[0]); 
        for(int x : arr) // Automatic conversion is being done over here
                System.out.print(x + ", ");
    }
}
