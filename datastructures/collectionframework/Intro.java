/*                        JAVA Collection framework



│
├── Collection Framework
│   ├── Interfaces: Collection, List, Set, Queue, Deque
│   ├── Implementations: ArrayList, HashSet, LinkedList...
│   ├── Algorithms: Collections.sort()
│   ├── Utilities: Comparator, Iterator, ListIterator, Spliterator



                                                       Iterable (I)
                                                           |
                                                           |
                                                       Collection (I)
                                                           |
                                                           |
           .........................................................................................................
           |                                               |                                                       |
           |                                               |                                                       |
        List (I)                                          Queue(I)---> PriorityQueue                            Set(I)
          |                                                 |                                                      |
          |-> ArrayList                                     |                                                      |-------> HashSet
          |                                                Dequeue(I)                                              |-------> LinkedHashSet
          |-> LinkedList --------------------------          |                                                     |
          |                                       |------------> ArrayDequeue                                   SortedSet(I)
          |-> Vector -> stack                                                                                      |-------> TreeSet






















* */