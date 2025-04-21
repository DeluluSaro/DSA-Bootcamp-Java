package Trees;

public class BinarySearchTree {

    // Inner class to create tree nodes
    private class Node {
        int value;         // value of the node
        Node left;         // left child
        Node right;  
        int height;      // right child

        public Node(int value) {
            this.value = value; // assigning value to current node
        }
    }

    private Node root; // the root node of the tree

    // ✅ Function to insert value into the BST
    public void insert(int value) {
        root = insert(root, value); // insert starting from root
    }

    // Helper recursive function to insert value
    private Node insert(Node node, int value) {
        // If we reach a null position, create a new node
        if (node == null) {
            return new Node(value);
        }

        // If the value is smaller, go to the left subtree
        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        // If the value is greater, go to the right subtree
        else if (value > node.value) {
            node.right = insert(node.right, value);
        }

        // Return the node to connect with its parent
        return node;
    }

    // ✅ Function to display the tree in a readable format
    public void display() {
        display(root, "Root: ");
    }

    // Helper function to display nodes with indent
    private void display(Node node, String indent) {
        if (node == null) {
            return; // base case
        }

        // Print current node
        System.out.println(indent + node.value);

        // Print left and right children
        display(node.left, "Left of " + node.value + ": ");
        display(node.right, "Right of " + node.value + ": ");
    }

    // ✅ Function to search a value in BST
    public boolean search(int value) {
        return search(root, value);
    }

    // Helper recursive search function
    private boolean search(Node node, int value) {
        // Base case: reached the end
        if (node == null) {
            return false;
        }

        // If value is found
        if (node.value == value) {
            return true;
        }

        // Search in left or right subtree
        if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    // ✅ Function to check if tree is empty
    public boolean isEmpty() {
        return root == null;
    }


    public void insertArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
    }







}
