package work;
import java.util.Scanner;

class Node {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }
}

public class arvores {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite números para inserir na árvore (digite -1 para parar):");

        while (true) {
            System.out.print("Número: ");
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            tree.insert(value);
        }

        System.out.println("Valores inseridos na árvore em ordem:");
        tree.inOrderTraversal(tree.root);
    }
}
