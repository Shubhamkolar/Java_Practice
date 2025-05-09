package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String [] args){
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(6);
        linkedlist.add(1);
        linkedlist.add(4);

    // [6, 1, 4]
    // But it'll print [6, 1, 1]
    // next was returning the element first and then moving the index forward
    // previous first moves back and then returns the element.
        ListIterator<Integer> iterator = linkedlist.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());

    // next -> return items[index ++];
    // prev -> return items[-- index];

    }
}
