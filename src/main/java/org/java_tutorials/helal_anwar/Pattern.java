package org.java_tutorials.helal_anwar;

public class Pattern extends Merger {
    private String str;
    private char aChar;

    public Pattern(String str, char aChar, int size) {
        super(size, aChar, str);
        this.str = str;
        this.aChar = aChar;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setChar(char aChar) {
        this.aChar = aChar;
    }
    public void print() {
        super.setStr(str);
        super.setC_(aChar);
        evaluate();
        merges();
        _print();
    }
}
