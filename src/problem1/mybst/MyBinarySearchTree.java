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

    public MyBinarySearchTree() {
        tmp = null;
        root = null;
        MyBinarySearchTree.count = 0;
        post = new MyQueue();
        pre = new MyQueue();

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MyBinarySearchTree.count = count;
    }

    //setting root node
    public void setRoot() {
        TreeNode newnode = new TreeNode();
        if (root == null) {
            root = newnode;
            tmp = root;
            newnode = null;
        }
    }

    public TreeNode getNewnode() {
        return newnode;
    }

    public void setNewnode(TreeNode newnode) {
        this.newnode = newnode;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getTmp() {
        return tmp;
    }

    public void setTmp(TreeNode tmp) {
        this.tmp = tmp;
    }

    public MyQueue getPre() {
        return pre;
    }

    public void setPre(MyQueue pre) {
        this.pre = pre;
    }

    public MyQueue getPost() {
        return post;
    }

    public void setPost(MyQueue post) {
        this.post = post;
    }

    //preorder
    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    //postorder
    public void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.getLeft());
        postOrder(node.getRight());

    }



    }


