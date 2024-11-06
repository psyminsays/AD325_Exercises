package TreePackage;

public class BinaryTree implements BinaryTreeInterface {
    private BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    @Override
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private BinaryNode insertRec(BinaryNode root, int value) {
        if (root == null) {
            root = new BinaryNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    @Override
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(BinaryNode root, int value) {
        if (root == null) {
            return false;
        }
        if (value == root.value) {
            return true;
        }
        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
    }

    @Override
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private BinaryNode deleteRec(BinaryNode root, int value) {
        if (root == null) {
            return root;
        }
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.value = minValue(root.right);
            root.right = deleteRec(root.right, root.value);
        }
        return root;
    }

    private int minValue(BinaryNode root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    @Override
    public void inorderTraversal() {
        inorderRec(root);
    }

    private void inorderRec(BinaryNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    @Override
    public void preorderTraversal() {
        preorderRec(root);
    }

    private void preorderRec(BinaryNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    @Override
    public void postorderTraversal() {
        postorderRec(root);
    }

    private void postorderRec(BinaryNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value + " ");
        }
    }

    @Override
    public int size() {
        return sizeRec(root);
    }

    private int sizeRec(BinaryNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + sizeRec(root.left) + sizeRec(root.right);
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }
}
