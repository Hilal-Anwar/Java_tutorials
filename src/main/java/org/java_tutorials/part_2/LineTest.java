package org.java_tutorials.part_2;

public class LineTest {
    public static void main(String[] args) {
        Line l=new Line(new Point(2,3),new Point(2,5));
        System.out.println(l.contains(new Point(2,4)));
    }
}
