package org.java_tutorials.classX;

public class Rectangle {
    int length, breadth;
    float diagonal;
     Rectangle(int length, int breadth) {
        this.breadth = breadth;
        this.length = length;
    }
    Rectangle(float diagonal,int length){

    }
    public double area() {
        return length * breadth;
    }

    public double diagonal() {
        return Math.hypot(length, breadth);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(78.787f, 23);
        System.out.println(r.area());
        System.out.println(r.diagonal());

    }
}
