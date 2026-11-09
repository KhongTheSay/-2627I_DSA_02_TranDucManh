import java.util.*;

 class Tree {
    // List of node data values:
    Vector<Integer> values;
    // Total number of nodes in the tree:
    private int count;
    
    Tree() {
        this.values = new Vector<Integer>();
        this.count = 0;
    }
    
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node() {
            this.data = -1;
            this.left = null;
            this.right = null;
        }
    }

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
            return isValid(root, -1, 10001);
        }

    boolean isValid(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data <= min || node.data >= max) {
            return false;
        }

        return isValid(node.left, min, node.data) 
            && isValid(node.right, node.data, max);
    }
 }