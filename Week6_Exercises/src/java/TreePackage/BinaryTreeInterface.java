package TreePackage;

/**
 * This interface defines the basic operations of a binary tree.
 * Any class that implements this interface must provide implementations for the specified methods.
 * The operations include inserting elements, searching for values, deleting nodes,
 * traversing the tree in different orders, and querying the size and emptiness of the tree.
 */
public interface BinaryTreeInterface {

    /**
     * Inserts a new value into the binary tree.
     *
     * @param value The value to be inserted into the tree.
     * @throws IllegalArgumentException If the value cannot be inserted (e.g., invalid input).
     */
    void insert(int value);

    /**
     * Searches for a value in the binary tree.
     *
     * @param value The value to search for in the tree.
     * @return {@code true} if the value is found in the tree, {@code false} otherwise.
     */
    boolean search(int value);

    /**
     * Deletes the first occurrence of the specified value from the binary tree.
     *
     * @param value The value to be deleted from the tree.
     * @throws IllegalArgumentException If the value is not found in the tree or cannot be deleted.
     */
    void delete(int value);

    /**
     * Performs an inorder traversal of the tree.
     * Inorder traversal visits the left subtree, the root, and then the right subtree.
     * Typically used to return the nodes of a binary search tree in ascending order.
     */
    void inorderTraversal();

    /**
     * Performs a preorder traversal of the tree.
     * Preorder traversal visits the root, then the left subtree, and finally the right subtree.
     */
    void preorderTraversal();

    /**
     * Performs a postorder traversal of the tree.
     * Postorder traversal visits the left subtree, the right subtree, and finally the root.
     */
    void postorderTraversal();

    /**
     * Returns the size of the binary tree, i.e., the number of nodes in the tree.
     *
     * @return The number of nodes in the tree.
     */
    int size();

    /**
     * Checks if the binary tree is empty.
     *
     * @return {@code true} if the tree contains no nodes, {@code false} otherwise.
     */
    boolean isEmpty();
}
