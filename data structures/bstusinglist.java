import java.util.ArrayList;
import java.util.List;

class Node {
    int value;
    int left;  // Index of the left child
    int right; // Index of the right child

    Node(int value) {
        this.value = value;
        this.left = -1;  // -1 indicates no child
        this.right = -1;
    }
}

class BinarySearchTree {
    List<Node> nodes;

    BinarySearchTree() {
        nodes = new ArrayList<>();
    }

    // Add a node to the BST
    void insert(int value) {
        if (nodes.isEmpty()) {
            nodes.add(new Node(value)); // Add root node
        } else {
            insertRecursive(0, value); // Start from the root at index 0
        }
    }

    private void insertRecursive(int currentIndex, int value) {
        Node currentNode = nodes.get(currentIndex);

        if (value < currentNode.value) {
            if (currentNode.left == -1) {
                currentNode.left = nodes.size(); // Set the left child index
                nodes.add(new Node(value));     // Add new node to the list
            } else {
                insertRecursive(currentNode.left, value); // Go to the left child
            }
        } else if (value > currentNode.value) {
            if (currentNode.right == -1) {
                currentNode.right = nodes.size(); // Set the right child index
                nodes.add(new Node(value));      // Add new node to the list
            } else {
                insertRecursive(currentNode.right, value); // Go to the right child
            }
        }
    }

    // Inorder Traversal (Left, Root, Right)
    void inorderTraversal() {
        inorderRecursive(0);
        System.out.println();
    }

    private void inorderRecursive(int currentIndex) {
        if (currentIndex == -1) {
            return; // No child
        }

        Node currentNode = nodes.get(currentIndex);
        inorderRecursive(currentNode.left);    // Visit left subtree
        System.out.print(currentNode.value + " "); // Visit root
        inorderRecursive(currentNode.right);   // Visit right subtree
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Display the BST in Inorder Traversal
        System.out.print("Inorder Traversal: ");
        bst.inorderTraversal(); // Output: 20 30 40 50 60 70 80
    }
}
