package org.java_tutorials.part_1.util;

public class MyClassLoader {
    public static void main(String[] args) {
        try {
            var C=Class.forName("org.java_tutorials.part_1.util.Angle").isEnum();
            var X= new Class[]{Angle.class};
            System.out.println(Enum.valueOf(X[0x0],"RADIAN"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
