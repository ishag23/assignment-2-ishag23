/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;


// to implement BinarySearchTree
public class MyBinarySearchTree {
    private static int count;
    private TreeNode newnode, root, tmp;
    private MyQueue pre;
    private MyQueue post;

    public MyBinarySearchTree(TreeNode newnode) {
        this.newnode = newnode;
        tmp = null;
        root = null;
        MyBinarySearchTree.count = 0;
        post = new MyQueue();
        pre = new MyQueue();
    }

}
