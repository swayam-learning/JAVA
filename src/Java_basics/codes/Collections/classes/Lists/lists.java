package Java_basics.codes.Collections.classes.Lists;

public class lists {
    public static void main(String[] args) {
        // lists are collections that maintain their elements in order and can contain duplicates
        // the elements in a list are ordered
        // Each element are position based , starting from index 0

        // Implementation of List

        // **ArrayList** : dynamic array internally it uses normal arrays , set to some default capacity
        // when the capacity is reached , it will create a new array of bigger size(50
        // % of it current capacity) and copies all the elements from the old array to the new array
        // As the old array is no longer used it will be garbage collected in the next garbage collection

        // **Vector** : is legacy class implements the list interface both vectors and arraylist are implemented
        // dynamically
        // Unlike the arraylist the vector class is thread safe meaning that concurrent calls to the vefctor will not
        // compromise its integrity

        // **Linked List**:implementation uses a doubly linked list
        // Insertions and deletions in a doubly linked list are very efficient

        // ArrayList v/s LinkedList
        // getting a element for arraylist is constant time performance but for linked list it is linear time access.
        // frequent deletions and insertions it is easier in linked list
        // overall arraylist is better ,but in concepts of stack and queues we use linked list
        // Linked list implements list and deque.



    }
}
