package ramzanFoodChart;

import java.time.Clock;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    public static void main(String[] args) {
        //DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))));
        System.out.println(LocalTime.now(Clock.systemDefaultZone()));
    }
}
