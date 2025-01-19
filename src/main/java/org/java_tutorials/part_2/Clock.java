package org.java_tutorials.part_2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Clock {
    public static void main(String[] args) throws InterruptedException {
        double R = (double) 2 / 3, c_r = 0.6 / 3, r = 1.5 / 3;
        LocalTime localTime = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        System.out.println(localTime);
        var sec = new Point(R, R - c_r);
        var min = new Point(R, R - c_r);
        var hou = new Point(R, R - c_r);
        sec = rotate(localTime.getSecond() * -6, new Point(R, R), new Point(R, R - c_r));
        while (true) {
            localTime = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
            min = rotate(localTime.getMinute() * -6, new Point(R, R), new Point(R, R - c_r));
            hou = rotate(localTime.getHour() * -30, new Point(R, R), new Point(R, R - c_r));
            StringBuilder s = new StringBuilder();
            double X_s = sec.x(), Y_s = sec.y();
            double X_m = min.x(), Y_m = min.y();
            double X_h = hou.x(), Y_h = hou.y();
            for (double y = 0; y < 2 * R; y = y + 0.01) {
                for (double x = 0; x < 2 * R; x = x + 0.01) {
                    double I = y * y + x * x + 2 * R * R - 2 * R * (x + y) - r * r;
                    double K = y * y + x * x + R * R - 2 * R * (x + y);
                    double S = y * y + x * x - c_r * c_r - 2 * (y * Y_s + x * X_s) + X_s * X_s + Y_s * Y_s;
                    double M = y * y + x * x - c_r * c_r - 2 * (y * Y_m + x * X_m) + X_m * X_m + Y_m * Y_m;
                    double H = y * y + x * x - c_r * c_r - 2 * (y * Y_h + x * X_h) + X_h * X_h + Y_h * Y_h;
                    var line_s = new Line(new Point(R, R), new Point(X_s, Y_s));
                    var line_m = new Line(new Point(R, R), new Point(X_m, Y_m));
                    var line_h = new Line(new Point(R, R), new Point(X_h, Y_h));
                    if ((K <= 0 && I >= 0) || (line_s.contains(new Point(x, y)) && S < 0) ||
                            (line_m.contains(new Point(x, y)) && M < 0) || (line_h.contains(new Point(x, y)) && H < 0))
                        s.append("██");
                    else
                        s.append("  ");
                }
                s.append("\n");
            }
            System.out.println(s);
            sec = rotate(-6, new Point(R, R), sec);
            System.out.print("\u001b[H");
            Thread.sleep(1000);
        }
    }

    public static Point rotate(double angle, Point center, Point point) {
        angle = Math.toRadians(angle);
        double x = point.x();
        double y = point.y();
        double X = center.x();
        double Y = center.y();
        double arg = Math.atan2(y - Y, x - X);
        double d = arg - angle;
        double sqrt = Math.sqrt((X - x) * (X - x) + (Y - y) * (Y - y));
        return new Point(center.x() + (sqrt * Math.cos(d)), center.y() + (sqrt * Math.sin(d)));
    }
}

