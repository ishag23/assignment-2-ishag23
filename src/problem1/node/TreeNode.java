/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

import java.util.Scanner;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode(TreeNode left, TreeNode right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;

    }

    //default constructor
    public TreeNode() {
        System.out.print("Enter integer value : ");
        data = new Scanner(System.in).nextInt();
        left = right = null;

    }
}
