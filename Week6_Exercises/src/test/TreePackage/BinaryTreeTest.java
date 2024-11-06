package TreePackage;

public class BinaryTreeTest {
    public static void main(String[] args) {
        // Create a new BinaryTree
        BinaryTree tree = new BinaryTree();

        // Test insertion
        System.out.println("Inserting values into the tree...");
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Inorder Traversal
        System.out.print("Inorder Traversal: ");
        tree.inorderTraversal(); // Should print: 20 30 40 50 60 70 80
        System.out.println();

        // Preorder Traversal
        System.out.print("Preorder Traversal: ");
        tree.preorderTraversal(); // Should print: 50 30 20 40 70 60 80
        System.out.println();

        // Postorder Traversal
        System.out.print("Postorder Traversal: ");
        tree.postorderTraversal(); // Should print: 20 40 30 60 80 70 50
        System.out.println();

        // Test searching for existing and non-existing values
        System.out.println("Searching for value 40: " + (tree.search(40) ? "Found" : "Not Found"));
        System.out.println("Searching for value 100: " + (tree.search(100) ? "Found" : "Not Found"));

        // Test size
        System.out.println("Size of the tree: " + tree.size()); // Should print: 7

        // Test if tree is empty
        System.out.println("Is the tree empty? " + (tree.isEmpty() ? "Yes" : "No"));

        // Test deletion
        System.out.println("Deleting value 20...");
        tree.delete(20);
        System.out.print("Inorder Traversal after deletion: ");
        tree.inorderTraversal(); // Should print: 30 40 50 60 70 80
        System.out.println();

        // Test deletion of node with two children
        System.out.println("Deleting value 30 (has two children)...");
        tree.delete(30);
        System.out.print("Inorder Traversal after deletion: ");
        tree.inorderTraversal(); // Should print: 40 50 60 70 80
        System.out.println();

        // Final size check after deletions
        System.out.println("Size of the tree after deletions: " + tree.size()); // Should print: 5
    }
}
