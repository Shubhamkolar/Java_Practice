# Lists: 
1. Lists are collection that maintain their elements in order and can contain duplicates.
2. The elements in a list are ordered.
3. Each elements are positioned based, starting from index 0.

## List Methods:
// E stands for retrun type (any type) its just a placeholder for anytype.
1. E get(int index)
2. E set(int index, E element)
3. void add(int index, E element)
4. boolean addAll(int index, Collection<? extends E> c)
5. E remove(int index)

## Implentations of List:
Three implementations of the List interface are provided in the java.util package:-
1. ArrayList        2. LinkedList           3. Vector

==============================================================================================
# 1. ArrayLis:
- ArrayList is a dynamic array.
- To be used when we don't know what is going to be the size of the array.
- Internally it uses a normal array, set to some default capacity.
- When that capacity is reached, it will create a new array of bigger size (50% of its current 
  capacity) and copies all the elements from the old array to then new array. 
- New array's reference for its internal usage.
- As the old array is no longer use, it will be garbage collected in the next garbage collection.


-------------------------------------------------------------------------------------------------
# 2. Vector:
- The Vector class is a legacy class which implements the List interface. 
- The Vector and Arraylist classes are implemented using dynamically.
- resizable arrays, providing fast random access (i.e., position-based access) and fast.
- list traversal- very much like using an ordinary array.
- Unlike the Arraylist class, the Vector class is thread-safe, meaning that concurrent calls to the
  vector will not compromise its integrity.
- The Arraylist and Vector classes offer comparable performance, but Vectors suffer a slight 
  performance penalty due to synchronization.

----------------------------------------------------------------------------------------------------
# 3. LinkedList:
- The LinkedList implementation uses a doubly-linked list.
- Insertions and deletions in a doubly-linked list are very efficient.



