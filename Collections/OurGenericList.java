package Collections;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T> {

    private T[] items;
    private int size;

    public OurGenericList(){
        size = 0;
        items = (T[])new Object[100];
    }

    public void add(T item)
    {
        items[size ++] = item;
    }

    public T getItemAtIndex(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator(){
        return new OurGenericListInterator(this);
    }

    private class OurGenericListInterator implements Iterator<T>
    {
        private OurGenericList<T> list;
        private int index = 0;
        
        public OurGenericListInterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println("has next called");
            return index < list.size;
        }

        @Override
        public T next() {
            System.out.println("next called");
            return list.items[index ++];
        //  The above single line can be written same as below 
        //  int item = list.items[index];
        //  index++;
        //  return item;
        }
    }
}
