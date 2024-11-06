package TreePackage;
import java.util.NoSuchElementException;

/**
 * An interface for iterators that traverse tree data structures.
 * This interface provides methods for traversing the tree in various ways
 * and for performing operations while iterating over the tree elements.
 *
 * @param <T> the type of elements held in the tree
 */
public interface TreeIteratorInterface<T> {

    /**
     * Checks if there are more elements in the tree to iterate over.
     *
     * @return true if there are more elements, false otherwise
     */
    boolean hasNext();

    /**
     * Returns the next element in the tree.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if there are no more elements to iterate
     */
    T next();

    /**
     * Removes the last element returned by the iterator from the tree.
     * This is an optional operation and may not be supported by all tree iterators.
     *
     * @throws UnsupportedOperationException if the remove operation is not supported
     */
    void remove();

    /**
     * Resets the iterator to the beginning of the tree traversal.
     * This is useful if you want to restart the iteration from the root.
     */
    void reset();
}
