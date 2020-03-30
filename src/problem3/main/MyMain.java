/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.Student;
import problem3.myqueue.MyPriorityQueue;

import java.util.Scanner;
// executable class
// use problem5.student.problem3.node.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        int p = sc.nextInt();
        switch (p) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    System.out.println("student name");
                    String n = sc.nextLine();
                    System.out.println("enter roll no");
                    int m = sc.nextInt();
                    Student student = new Student(n, m);
                    queue.enqueue(student);
                    sc.nextLine();
                }
                queue.show();
                break;
            default:
                System.out.println("wrong input");
        }
    }

}
