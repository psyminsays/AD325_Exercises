package TreePackage;

/**
 * This interface defines the core operations that can be performed on a tree.
 *
 * @param <T> the type of elements held in the tree
 */
public interface TreeInterface<T> {

    /**
     * Checks if the tree is empty.
     *
     * @return true if the tree is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the tree.
     *
     * @return the number of elements in the tree
     */
    int size();

    /**
     * Inserts a value into the tree.
     *
     * @param value the value to be inserted into the tree
     */
    void insert(T value);

    /**
     * Removes a value from the tree.
     *
     * @param value the value to be removed from the tree
     * @return true if the value was successfully removed, false if the value was not found
     */
    boolean remove(T value);

    /**
     * Checks if the tree contains a specific value.
     *
     * @param value the value to search for in the tree
     * @return true if the tree contains the value, false otherwise
     */
    boolean contains(T value);

    /**
     * Returns the value of the root node.
     *
     * @return the value of the root node
     * @throws IllegalStateException if the tree is empty
     */
    T getRootValue();

    /**
     * Performs a pre-order traversal of the tree.
     * In pre-order traversal, the root node is visited first, followed by the left subtree and right subtree.
     */
    void preOrderTraversal();

    /**
     * Performs an in-order traversal of the tree.
     * In in-order traversal, the left subtree is visited first, followed by the root node, then the right subtree.
     */
    void inOrderTraversal();

    /**
     * Performs a post-order traversal of the tree.
     * In post-order traversal, the left and right subtrees are visited first, followed by the root node.
     */
    void postOrderTraversal();

    /**
     * Returns the height of the tree.
     * The height of the tree is the length of the longest path from the root to a leaf node.
     *
     * @return the height of the tree
     */
    int height();

    /**
     * Clears the tree, removing all elements.
     */
    void clear();

    /**
     * Returns the depth of a specific node in the tree.
     * The depth is the number of edges from the root to the node.
     *
     * @param value the value of the node whose depth is to be found
     * @return the depth of the node, or -1 if the node is not found
     */
    int getDepth(T value);
}

