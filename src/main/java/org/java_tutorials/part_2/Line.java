package org.java_tutorials.part_2;

public record Line(Point point, double slope) {

    public Line(Point point1, Point point2) {
        this(point1, (point2.y() - point1.y()) / (point2.x() - point1.x()));
    }


    @Override
    public String toString() {
        return "Line [" + slope + "x" + "-y" + (-slope * point.x() + point.y()) + "]";
    }

    public boolean contains(Point point) {
        if ((slope == Double.NEGATIVE_INFINITY || slope == Double.POSITIVE_INFINITY) &&
                (Math.abs(this.point.x() - point.x())<=0.01))
            return true;
        return point.y() - this.point.y() == slope * (point.x() - this.point.x()) ||
                Math.abs(point.y() - this.point.y() - slope * (point.x() - this.point.x())) <= 0.01;
    }
}