package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String name;
    private LocalDateTime dateTime;
    private int price;

    public Ticket(String name, LocalDateTime dateTime, int price) {
        this.name = name;
        this.dateTime = dateTime;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getPrice() {
        return price;
    }

    public LocalTime entryTime() {
//        return LocalTime.of(dateTime.getHour() - 1, dateTime.getMinute());
        return dateTime.toLocalTime().minusHours(1);
    }
}

