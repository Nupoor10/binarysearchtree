class BinarySearchTree {
    class Node {
      int key;
      Node left, right;
  
      public Node(int item) {
        key = item;
        left = right = null;
      }
    }
  
    Node root;
  
    BinarySearchTree() {
      root = null;
    }
  
    void insert(int key) {
      root = insertKey(root, key);
    }
  
    Node insertKey(Node root, int key) {
      if (root == null) {
        root = new Node(key);
        return root;
      }

      if (key < root.key)
        root.left = insertKey(root.left, key);
      else if (key > root.key)
        root.right = insertKey(root.right, key);
  
      return root;
    }
  
    void inorder() {
      inorderTrav(root);
    }

    void inorderTrav(Node root) {
      if (root != null) {
        inorderTrav(root.left);
        System.out.print(root.key + " -> ");
        inorderTrav(root.right);
      }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
    
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);
    
        System.out.print("Inorder traversal of the binary search tree: ");
        tree.inorder();

      }
    }
    