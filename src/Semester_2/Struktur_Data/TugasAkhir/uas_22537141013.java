package Semester_2.Struktur_Data.TugasAkhir;

// Travis Zusa Zuve Saputra
// 22537141013

import java.util.Scanner;

public class uas_22537141013 {
    Node root;
    public static void main(String[] args) {
        uas_22537141013 binaryTree = new uas_22537141013(); // Buat objek binaryTree
        Scanner ui = new Scanner(System.in); // Buat objek Scanner
        int choice; // Pilihan menu
        while (true) {
            System.out.println("+-------------------+");
            System.out.println("|        Menu       |");
            System.out.println("+-------------------+");
            System.out.println("1. Insert Data");
            System.out.println("2. Search Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Traversal (Preorder, Inorder, Postorder)");
            System.out.println("5. Display Leaf Nodes");
            System.out.println("6. Display Minimum and Maximum Nodes");
            System.out.println("7. Display Binary Tree");
            System.out.println("8. Exit");
            System.out.print("?? Pilihan: ");
            choice = ui.nextInt();

            switch (choice) {
                case 1:
                    System.out.print(">> Insert Data: ");
                    int data = ui.nextInt();
                    binaryTree.insert(data);
                    System.out.println(">> Data " + data + " berhasil dimasukkan");
                    break;
                case 2:
                    System.out.print(">> Search Data: ");
                    int searchData = ui.nextInt();
                    binaryTree.search(searchData);
                    break;
                case 3:
                    System.out.print(">> Delete Data: ");
                    int deleteData = ui.nextInt();
                    binaryTree.delete(deleteData);
                    System.out.println(">> Data " + deleteData + " berhasil dihapus");
                    break;
                case 4:
                    System.out.println("+-------------------+");
                    System.out.println("|     Traversal     |");
                    System.out.println("+-------------------+");
                    binaryTree.traversal();
                    break;
                case 5:
                    binaryTree.printLeaf();
                    break;
                case 6:
                    binaryTree.printMinMaxValues();
                    break;
                case 7:
                    System.out.println("+-------------------+");
                    System.out.println("|    Binary Tree    |");
                    System.out.println("+-------------------+");
                    System.out.println("!! Tampilan dari Kiri ke Kanan ");
                    System.out.println("!! Root Berada di KIRI ");
                    System.out.println();
                    binaryTree.printLeft();
                    break;
                case 8:
                    System.out.println(">> Program selesai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("!! Pilihan tidak tersedia");
                    break;
            }
        } 
    }

    // Constructor
    public uas_22537141013() {
        root = null;
    }

    // Insert Data
    void insert (int data) {
        root = insertNode(root, data);
    }
    Node insertNode(Node root, int data) { // Recursive
        if (root == null) { // Jika root kosong
            root = new Node(data); // Buat node baru
            return root; // Return root
        }
        if (data < root.data) { // Jika data lebih kecil dari root
            root.leftChild = insertNode(root.leftChild, data); // Insert ke kiri
        } else if (data > root.data) { // Jika data lebih besar dari root
            root.rightChild = insertNode(root.rightChild, data); // Insert ke kanan
        }
        return root; // Return root
    }

    // Delete Data
    void delete(int data) {
        root = deleteNode(root, data);
    }
    Node deleteNode(Node root, int data) { // Recursive
        if (root == null) { // Jika root kosong
            return root; // Return root
        }
        if (data < root.data) { // Jika data lebih kecil dari root
            root.leftChild = deleteNode(root.leftChild, data); // Delete dari kiri
        } else if (data > root.data) { // Jika data lebih besar dari root
            root.rightChild = deleteNode(root.rightChild, data); // Delete dari kanan
        } else { // Jika data sama dengan root
            if (root.leftChild == null) { // Jika tidak ada node kiri
                return root.rightChild; // Return node kanan
            } else if (root.rightChild == null) { // Jika tidak ada node kanan
                return root.leftChild; // Return node kiri
            }
            root.data = minValue(root.rightChild); // Ganti data dengan data terkecil dari node kanan
            root.rightChild = deleteNode(root.rightChild, root.data); // Delete node kanan
        }
        return root; // Return root
    }

    // Traversal
    void traversal() {
        System.out.println("PRE-Order Traversal: ");
        System.out.print(">> ");
        preorderTraversal(root);
        System.out.println();
        System.out.println("IN-Order Traversal: ");
        System.out.print(">> ");
        inorderTraversal(root);
        System.out.println();
        System.out.println("POST-Order Traversal: ");
        System.out.print(">> ");
        postorderTraversal(root);
        System.out.println();
    }
    void preorderTraversal(Node root) { // Recursive Preorder Traversal
        if (root != null) { // Jika root tidak kosong
            System.out.print(root.data + " "); // Print data
            preorderTraversal(root.leftChild); // Traversal ke kiri
            preorderTraversal(root.rightChild); // Traversal ke kanan
        }
    }
    void inorderTraversal(Node root) { // Recursive Inorder Traversal
        if (root != null) { // Jika root tidak kosong
            inorderTraversal(root.leftChild); // Traversal ke kiri
            System.out.print(root.data + " "); // Print data
            inorderTraversal(root.rightChild); // Traversal ke kanan
        }
    }
    void postorderTraversal(Node root) { // Recursive Postorder Traversal
        if (root != null) { // Jika root tidak kosong
            postorderTraversal(root.leftChild); // Traversal ke kiri
            postorderTraversal(root.rightChild); // Traversal ke kanan
            System.out.print(root.data + " "); // Print data
        }
    }

    // Search Data
    void search(int data) {
        Node result = searchNode(root, data); // Cari data
        if (result != null) { // Jika data ditemukan
            System.out.println(">> Data ditemukan");
        } else {
            System.out.println(">> Data tidak ditemukan");
        }
    }
    Node searchNode(Node root, int data) { // Recursive
        if (root == null || root.data == data) { // Jika root kosong atau data sama dengan root
            return root;
        }
        if (root.data > data) { // Jika data lebih kecil dari root
            return searchNode(root.leftChild, data); // Cari dari kiri
        }
        return searchNode(root.rightChild, data); // Cari dari kanan
    }

    // Display Binary Tree
    void printLeft() { 
        printTreeLeftToRight(root, "", true, true); // Print dari kiri ke kanan
        System.out.println();
    }
    void printTreeLeftToRight(Node root, String prefix, boolean isLeft, boolean isRoot) { // Recursive
        if (root == null) { // Jika root kosong
            return;
        }
        String nodePrefix = isRoot ? "   " : (isLeft ? "└── " : "┌── "); // Membuat prefix
        printTreeLeftToRight(root.rightChild, prefix + (isLeft ? "    " : "    "), false, false); // Traversal ke kanan
        System.out.print(prefix); // Print prefix
        System.out.print(nodePrefix); // Print node prefix
        System.out.println(root.data); // Print data
        printTreeLeftToRight(root.leftChild, prefix + (isLeft ? "    " : "    "), true, false); // Traversal ke kiri
    }

    // Print Leaf Nodes
    void printLeaf() {
        System.out.println(">> Leaf Node: ");
        printLeafNode(root);
        System.out.println();
    }
    void printLeafNode(Node root) { // Recursive
        if (root == null) {
            return;
        }
        if (root.leftChild == null && root.rightChild == null) { // Jika node tidak memiliki child
            System.out.print(root.data + " "); // Print data
        }
        printLeafNode(root.leftChild);
        printLeafNode(root.rightChild);
    }

    // Print Minimum and Maximum Values
    void printMinMaxValues() {
        System.out.println(">> Min Value: " + minValue(root));
        System.out.println(">> Max Value: " + maxValue(root));
    }
    int minValue(Node root) { // Recursive
        int minv = root.data; // Set minv dengan data root
        while (root.leftChild != null) { // Jika node kiri tidak kosong
            minv = root.leftChild.data; // Set minv dengan data node kiri
            root = root.leftChild; // Traversal ke kiri
        }
        return minv; // Return minv
    }
    int maxValue(Node root) { // Recursive
        int maxv = root.data; // Set maxv dengan data root
        while (root.rightChild != null) { // Jika node kanan tidak kosong
            maxv = root.rightChild.data; // Set maxv dengan data node kanan
            root = root.rightChild; // Traversal ke kanan
        }
        return maxv; // Return maxv
    }
}

// Node
class Node {
    public int data; // Data
    public Node leftChild; // Node kiri
    public Node rightChild; // Node kanan
    
    public Node(int item) {
        data = item; // Set data
        leftChild = null; // Set node kiri
        rightChild = null; // Set node kanan
    }
}