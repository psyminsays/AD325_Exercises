package TreePackage;

public class BinaryNodeTest {

    public static void main(String[] args) {

        // Test 1: Create a node with just a value
        BinaryNode node1 = new BinaryNode(10);
        System.out.println("Node1 value: " + node1.value); // Expected: 10
        System.out.println("Node1 left: " + node1.left); // Expected: null
        System.out.println("Node1 right: " + node1.right); // Expected: null
        System.out.println();

        // Test 2: Create a node with a value and left & right children
        BinaryNode node2 = new BinaryNode(20);
        BinaryNode node3 = new BinaryNode(30);
        BinaryNode node4 = new BinaryNode(40);

        // Set node2's left and right children
        BinaryNode node5 = new BinaryNode(50, node3, node4); // node3 as left child, node4 as right child
        System.out.println("Node5 value: " + node5.value); // Expected: 50
        System.out.println("Node5 left child: " + node5.left.value); // Expected: 30
        System.out.println("Node5 right child: " + node5.right.value); // Expected: 40

        // Test 3: Check node1 and node5's children
        node2.left = node1;  // node2 has node1 as left child
        node2.right = node5; // node2 has node5 as right child

        System.out.println("Node2 value: " + node2.value); // Expected: 20
        System.out.println("Node2 left child: " + node2.left.value); // Expected: 10
        System.out.println("Node2 right child: " + node2.right.value); // Expected: 50
        System.out.println();

        // Test 4: Check a root node with children
        BinaryNode root = new BinaryNode(100, node2, node5); // root node with node2 as left and node5 as right
        System.out.println("Root value: " + root.value); // Expected: 100
        System.out.println("Root left child: " + root);
    }
}