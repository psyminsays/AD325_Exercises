package TreePackage;

public class BinaryNode {
    int value;
    BinaryNode left;
    BinaryNode right;

    // Constructor for creating a node with just a value
    public BinaryNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // Constructor for creating a node with a value and left and right children
    public BinaryNode(int value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
