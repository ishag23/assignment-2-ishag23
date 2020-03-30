/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;

public class MyQueue {
    private Node front, end, temp;
    private int size;

    public MyQueue() {
        front = null;
        end = null;
        temp = null;
        size = 0;
    }
    public int getSize(MyQueue queue) {
        queue.temp = queue.front;
        while (queue.temp != null) {
            ++size;
            queue.temp = queue.temp.getNext();
        }
        queue.temp = queue.front;
        return size;
    }

    public void queuePrint(MyQueue queue) {
        while (queue.temp != null) {

            System.out.print(queue.temp.getNode().getData() + ",");
            queue.temp = queue.temp.getNext();
        }
        System.out.println("\b");
        queue.temp = queue.front;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public Node getTemp() {
        return temp;
    }

    public void setTemp(Node temp) {
        this.temp = temp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public void enqueue(Node node) {
        if (front == null) {
            temp = front = end = node;
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            end = node;
            temp.getNext();

        }
    }

    //preOrder
    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        enqueue(new Node(node));
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }


    }

