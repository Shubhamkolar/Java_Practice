# Queues:
The Queue interface extends the Collection interface with the following methods:
    - boolean add(E element)
    - boolean offer(E element)
Both elements insert the elements the queue, the return value indicates the success or failure of the operation i.e. true or false.
- add method inherited from the collection throws an illegal state exception if the queue is full but the offer method does not. 
- So always use offer method just if we don't want to run into unwawnted exceptions. 

Similarly for removing the elements we have poll and remove. Both are used to remove the elements but the poll method doesn't show 
no such element exception and returns null if the queue is empty or you have run out of items.
- remove will throw an exception. 
- Prefer poll to remove the elements

- E peek() => To peek an element without throwing an exception. 
- E element() => If there's no element then it'll throw exception
Always better to use peek() to get an current element.

=============================================================================================================================================
# Deque: 
- The Deque interface extends the Queue interface to allow double-ended queues. 
- It follows FIFO
- Elements can be inserted at or removed from either end.
- A deque can be used as FIFO queue, where elements added at the tail are presented at the head for inspection or removal in the same order, 
  thus implementing FIFO order.
- If you need to use STACK then use Deque. 

Adding elements:
- boolean offerFirst(E element)
- boolean offerLast(E element) Queue equivalent: offer()
- void push(E element) Synonym: addFirst()
- void addFirst(E element)
- void addLast(E element) Queue equivalent: add()

Removing Elements:
- E pollFirst() Queue equivalent: poll()
- E pollLast()
- E pop() Synonym: removeFirst()
- E removeFirst() Queue equivalent: remove()
- E removeLast()

Examine Elements:
- E peekFirst() Queue equivalent: peek()
- E peekLast()
- E getFirst() Queue equivalent: element()
- E getLast()

=============================================================================================================================================
# Priority Queue:
- Priority queue works on Priority
- The implementation is based on a priority heap, a tree like structure that yields an elemnent at the head of the queue according to the Priority
  ordering, which is defined either by the natural ordering of its elements or by a comparator.
- In the case of several elements having the same priority, one of them is chosen arbitrarily. 
- Elements of a PriorityQueue are not sorted. 
- The queue only gurantees that elements can be removed in priority order, and any traversal using an iterator does not.