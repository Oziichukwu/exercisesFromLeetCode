package arrays;


import java.util.ArrayList;

public class MaximumPathSum {

    //    private int totalMax;
//
//        class Tree{
//            public int x;
//            public Tree l;
//            public Tree r;
//        }
//
//
//    public int maxPath(Tree root){
//
//        if (root == null){
//            return 0;
//        }
//        totalMax = Integer.MIN_VALUE;
//        sumOfMaxPath(root);
//        return totalMax;
//    }
//
//    private int sumOfMaxPath(Tree root) {
//
//        if (root == null){
//            return 0;
//        }
//
//        int z = Math.max(0, sumOfMaxPath(root.l));
//        int y = Math.max(0, sumOfMaxPath(root.r));
//        totalMax = Math.max(totalMax,z + y + root.x);
//        return root.x + Math.max(z , y);
//    }
    public static boolean checkForPath(Node root, ArrayList<Integer> arr, int num) {

        if (root == null) {
            return false;
        }
        arr.add(root.x);

        if (root.x == num) {
            return true;
        }

        if (checkForPath(root.left, arr, num) ||
                checkForPath(root.right, arr, num))
            return true;

        arr.remove(arr.size() - 1);
        return false;
    }

    public static void printPath(Node root, int x) {
        ArrayList<Integer> arr = new ArrayList<>();

        if (checkForPath(root, arr, x)) {
            for (int i = 0; i < arr.size() - 1; i++)
                System.out.print(arr.get(i) + "->");
            System.out.print(arr.get(arr.size() - 1));
        } else
            System.out.print("No Path");
    }


    public static void main(String[] args) {

        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int x=5;
        printPath(root, x);

    }

}

    class Node{
        int x;
        Node left, right;
        Node(int x){
            this.x = x;
            left = right = null;
        }
    }

