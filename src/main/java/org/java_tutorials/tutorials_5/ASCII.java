package org.java_tutorials.tutorials_5;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public final class ASCII {
    boolean negative;

    public ASCII() {
        this(false);
    }

    public ASCII(final boolean negative) {
        this.negative = negative;
    }

    public String convert(final BufferedImage image) {
        StringBuilder sb = new StringBuilder((image.getWidth() + 1)
                * image.getHeight());
        for (int y = 0; y < image.getHeight(); y++) {
            if (sb.length() != 0) sb.append("\n");
            for (int x = 0; x < image.getWidth(); x++) {
                Color pixelColor = new Color(image.getRGB(x, y));
                double gValue = (double) pixelColor.getRed() * 0.2989 +
                        (double) pixelColor.getBlue() * 0.5870 +
                        (double) pixelColor.getGreen() * 0.1140;
                final char s = negative ? returnStrNeg(gValue) :
                        returnStrPos(gValue);
                sb.append(s).append(s);
            }
        }

        return sb.toString();
    }

    private char returnStrPos(double g) {
        final char str;

        if (g >= 230.0) {
            str = ' ';
        } else if (g >= 200.0) {
            str = '.';
        } else if (g >= 180.0) {
            str = '*';
        } else if (g >= 160.0) {
            str = ':';
        } else if (g >= 130.0) {
            str = 'o';
        } else if (g >= 100.0) {
            str = '&';
        } else if (g >= 70.0) {
            str = '8';

        } else if (g >= 50.0) {
            str = '#';
        } else {
            str = ' ';
        }
        return str;

    }

    private char returnStrNeg(double g) {
        final char str;

        if (g >= 230.0) {
            str = '@';
        } else if (g >= 200.0) {
            str = '#';
        } else if (g >= 180.0) {
            str = '8';
        } else if (g >= 160.0) {
            str = '&';
        } else if (g >= 130.0) {
            str = 'o';
        } else if (g >= 100.0) {
            str = ':';
        } else if (g >= 70.0) {
            str = '*';
        } else if (g >= 50.0) {
            str = '.';
        } else {
            str = ' ';
        }
        return str;

    }

    public static void main(String[] args) throws IOException {
        File f = new File(args[0]);
        final BufferedImage image = ImageIO.read(f);
        final String ascii = new ASCII().convert(image);
        System.out.println(ascii);
    }

}