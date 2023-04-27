package org.java_tutorials.helal_anwar;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) throws InterruptedException, IOException {
        Pattern p = new Pattern(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")), '*', 5);
        while (LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")).length()!=0) {
            p.setStr(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
            p.print();
            Thread.sleep(1000);
            clrscr();
        }
    }

    public static void clrscr() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    }
}
