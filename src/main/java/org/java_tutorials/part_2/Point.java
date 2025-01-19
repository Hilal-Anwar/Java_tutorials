package org.java_tutorials.part_2;

public record Point(double x, double y) {
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

