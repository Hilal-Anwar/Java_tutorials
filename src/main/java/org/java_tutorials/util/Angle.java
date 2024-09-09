package org.java_tutorials.util;

public enum Angle
{
    DEGREE(1.0),RADIAN(57.295779513082323402053960025447),GRADE(1.1111111);
    private final double v;
    Angle(double v) {
        this.v=v;
    }
    public double getV() {
        return this.v;
    }
}
