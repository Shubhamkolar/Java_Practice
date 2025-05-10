# Understand the key interfaces:

| Interface    | Description                                                       |
| ------------ | ----------------------------------------------------------------- |
| Collection   | Root interface of all collection classes                          |
| List         | Ordered, allows duplicates (`ArrayList`, `LinkedList`)            |
| Set          | No duplicates (`HashSet`, `LinkedHashSet`, `TreeSet`)             |
| Map          | Key-value pairs (`HashMap`, `TreeMap`, `LinkedHashMap`)           |
| Queue        | FIFO or priority-based access (`Queue`, `PriorityQueue`, `Deque`) |


# When to Use What?

| Collection Type   | Best When You Need                      |
| ----------------- | --------------------------------------- |
| ArrayList         | Fast random access, frequent read       |
| LinkedList        | Frequent inserts/removals from ends     |
| HashSet           | No duplicates, fast lookup              |
| TreeSet           | Sorted, no duplicates                   |
| HashMap           | Fast key-based lookup                   |
| TreeMap           | Sorted key-value map                    |
| PriorityQueue     | Custom priority ordering (min/max heap) |
| Stack / Deque     | LIFO operations                         |



# ArrayList vs LinkedList
ArrayList: Faster for get/set
LinkedList: Faster for insert/delete at head or tail


# HashSet vs TreeSet
HashSet: Unordered, faster (uses hashing)
TreeSet: Ordered (sorted), slower (uses Red-Black tree)


# HashMap vs TreeMap vs LinkedHashMap
HashMap: Unordered
TreeMap: Sorted by keys
LinkedHashMap: Maintains insertion order


# Comparable: Natural sorting (implement compareTo)
Comparator: Custom sorting logic

