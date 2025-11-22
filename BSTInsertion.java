
class TreeNode {
    
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {

        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BSTInsertion {

    public static TreeNode insertIntoBST_Iterative(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode current = root;

        while (true) {

            if (val < current.val) {

                if (current.left != null) {
                    current = current.left;
                }

                else {
                    current.left = new TreeNode(val);
                    break;
                }
            }

            else {

                if (current.right != null) {

                    current = current.right;
                }

                else {
                    current.right = new TreeNode(val);
                    break;
                }
            }
        }

        return root;
    }

    public static TreeNode insertIntoBST_Recursive(TreeNode root, int val) {

        if (root == null) {

            return new TreeNode(val);
        }

        if (val < root.val) {

            root.left = insertIntoBST_Recursive(root.left, val);
        }

        else {

            root.right = insertIntoBST_Recursive(root.right, val);
        }

        return root;
    }

    private static void printTreeHelper(TreeNode node, String prefix, boolean isLast) {

        if (node != null) {

            System.out.println(prefix + (isLast ? "!--" : "|==") + node.val); // Use node.val

            if (node.left != null || node.right != null) {

                printTreeHelper(node.left, prefix + (isLast ? "    " : "|   "), node.right == null);
                printTreeHelper(node.right, prefix + (isLast ? "    " : "|   "), true);
            }
        }
    }


    public static void printTree(TreeNode root) {

        if (root == null) {

            System.out.println("Tree is empty.\n");
            return;
        }

        System.out.println("Current tree (visual approximation )");
        printTreeHelper(root, "", true);
        System.out.println();
    }

    public static void main(String[] args) {

        TreeNode root = null;
        System.out.println("Building BST step by step..");


        TreeNode rootRecursive = null;
        System.out.println("\n--- Using Iterative Insertion ---");
        int[] values = {50, 30, 20, 70, 40, 60, 80};
        for (int val : values) {
            System.out.println("---------------------------------------");
            System.out.println("Inserting : " + val);
            System.out.println("---------------------------------------");
            root = insertIntoBST_Iterative(root, val);
            printTree(root);
        }
        System.out.println("Final Iterative BST ... ");
        printTree(root);


        System.out.println("\n--- Using Recursive Insertion ---");
        int[] values2 = {50, 30, 20, 70, 40, 60, 80};

        for (int val : values2) {

            System.out.println("Inserting : " + val);
            rootRecursive = insertIntoBST_Recursive(rootRecursive, val);
        }

        System.out.println("Final Recursive BST ... ");

        printTree(rootRecursive);
    }
}