/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

import java.util.Scanner;

// to store student information and properties
public class Student {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int rollno, backlog, appcount;

    public Student() {
        System.out.println("name-");
        this.name = sc.next();
        System.out.println("rollno-");
        this.rollno = sc.nextInt();
        System.out.println("backlog-");
        this.backlog = sc.nextInt();
        System.out.println("appcount-");
        this.appcount = sc.nextInt();
    }

    public int getAppcount() {
        return appcount;
    }

    public void setAppcount(int appcount) {
        this.appcount = appcount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", backlog=" + backlog +
                ", apperingcount=" + appcount
                ;
    }


}
