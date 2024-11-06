package TreePackage;

public class Main {

    public static void main(String[] args) {

        // Create a few nodes directly using BinaryNode
        BinaryNode node1 = new BinaryNode(10);
        BinaryNode node2 = new BinaryNode(20);
        BinaryNode node3 = new BinaryNode(30);
        BinaryNode node4 = new BinaryNode(40);
        BinaryNode node5 = new BinaryNode(50);

        // Connect the nodes to form a tree structure manually
        node2.left = node1;  // node2 has node1 as left child
        node2.right = node3; // node2 has node3 as right child

        node4.left = node2;  // node4 has node2 as left child
        node4.right = node5; // node4 has node5 as right child

        // Now, node4 is the root of this tree
        System.out.println("Inorder Traversal of the tree:");
        inorderTraversal(node4); // Expected output: 10 20 30 40 50
        System.out.println();

        System.out.println("Preorder Traversal of the tree:");
        preorderTraversal(node4); // Expected output: 40 20 10 30 50
        System.out.println();

        System.out.println("Postorder Traversal of the tree:");
        postorderTraversal(node4); // Expected output: 10 30 20 50 40
        System.out.println();

        // Let's create a BinaryTree object and use its insert method
        BinaryTree tree = new BinaryTree();

        // Insert elements into the tree using BinaryTree methods
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder Traversal (after insertions) of BinaryTree:");
        tree.inorderTraversal(); // Expected output: 20 30 40 50 60 70 80
        System.out.println();

        // Search for a value
        int searchValue = 40;
        System.out.println("Search for value " + searchValue + ": " + tree.search(searchValue)); // Expected: true

        // Search for a value that doesn't exist
        searchValue = 100;
        System.out.println("Search for value " + searchValue + ": " + tree.search(searchValue)); // Expected: false

        // Get the size of the tree
        System.out.println("Size of the tree: " + tree.size()); // Expected: 7

        // Delete a node and then print the tree again
        tree.delete(30);
        System.out.println("Inorder Traversal after deleting 30:");
        tree.inorderTraversal(); // Expected output: 20 40 50 60 70 80
        System.out.println();

        // Check if the tree is empty
        System.out.println("Is the tree empty? " + tree.isEmpty()); // Expected: false
    }

    // Inorder Traversal (Left, Root, Right)
    public static void inorderTraversal(BinaryNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    // Preorder Traversal (Root, Left, Right)
    public static void preorderTraversal(BinaryNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // Postorder Traversal (Left, Right, Root)
    public static void postorderTraversal(BinaryNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }
}
