package Week3.Queues;

import java.util.Iterator;

public interface QueueInterface<T> {
    /** Adds a new entry to the back of this queue.
     @param newEntry  An object to be added. */
    public void enqueue(T newEntry);

    /** Removes and returns the entry at the front of this queue.
     @return  The object at the front of the queue.
     @throws  EmptyQueueException if the queue is empty before the operation. */
    public T dequeue() throws EmptyQueueException;

    /**  Retrieves the entry at the front of this queue.
     @return  The object at the front of the queue.
     @throws  EmptyQueueException if the queue is empty. */
    public T getFront() throws EmptyQueueException;

    /** Detects whether this queue is empty.
     @return  True if the queue is empty, or false otherwise. */
    public boolean isEmpty();

    /** Removes all entries from this queue. */
    public void clear() throws EmptyQueueException;

    public void display();
    public int size();

    public Iterator<T> iterator(); // end iterator
    public Iterator<T> getIterator();// end getIterator


}
