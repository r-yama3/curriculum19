package curriculum19;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Animal {
    public static void main(String[] args) {
        Dog animal = new Dog("無視してOK", 3);
        animal.showInfo();

        LocalDate today = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatted = nowTime.format(formatter);

        System.out.println(today + " " + formatted);
    }
}