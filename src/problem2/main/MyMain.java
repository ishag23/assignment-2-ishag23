/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;
import problem4.myqueue.Node;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    private MyBinarySearchTree dd;
    private MyQueue pre, post;

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

    public MyBinarySearchTree getM() {
        return dd;
    }

    public void setM(MyBinarySearchTree dd) {
        this.dd = dd;
    }

    //preOrder
    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        pre.enqueue(new Node(node));
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    //postOrder
    public void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.getLeft());
        postOrder(node.getRight());
        post.enqueue(new Node(node));
    }

    public static class Methods {
        dd =new

        MyBinarySearchTree();

        pre=new MyQueue;
        post=new MyQueue;

    }


}


