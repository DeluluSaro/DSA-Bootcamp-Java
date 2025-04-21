package Trees;

public class AVL {

    private class Node {
        private int height;
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int num) {
        root = insert(num, root);
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }

        return node.height;
    }

    public boolean isBalancedTree() {
        return isBalancedTree(root);
    }

    private boolean isBalancedTree(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalancedTree(node.left)
                && isBalancedTree(node.right);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        System.out.println("Now the height is : " + node.height);

        return rotate(node);
    }

    private Node rotate(Node node) {

        if (height(node.left) - height(node.right) > 1) {
            // left side is bigger or left heavy it has 2 cases left-left and left-right

            // left-left case the height of the grandson is more than child hence "right
            // rotate" on the parent p
            if (height(node.left.left) - height(node.left.right) > 0) {

                return rightRotate(node);

            }

            // left-right case left roatte the child node and again right rotate the parent
            // node node
            if (height(node.left.left) - height(node.left.right) < 0) {

                node.left = leftRotate(node.left);
                return rightRotate(node);

            }

            
        }


        // right heavy or right side has more weight
        if (height(node.left) - height(node.right) < -1) {
            if (height(node.right.left) - height(node.right.right) < 0) {
                return leftRotate(node);
            }

            if (height(node.right.left) - height(node.right.right) > 0) {

                node.right = rightRotate(node.right);
                return leftRotate(node);

            }

        }

        return node;
    }

    private Node leftRotate(Node c){

        Node p=c.right;
        Node t2=p.left;
        p.left=c;
        c.right=t2;


        p.height=Math.max(height(p.left), height(p.right))+1;
        c.height=Math.max(height(c.left), height(c.right))+1;

        return p;



        
    }

    private Node rightRotate(Node p){

        Node c=p.left;
        Node t2=c.right;
        c.right=p;
        p.left=t2;

        p.height=Math.max(height(p.left), height(p.right))+1;
        c.height=Math.max(height(c.left), height(c.right))+1;

        

        return c;
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

}