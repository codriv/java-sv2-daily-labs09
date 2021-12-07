package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {

    private String code;

    public FrontOfStageTicket(String name, LocalDateTime dateTime, int price, String code) {
        super(name, dateTime, price);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public LocalTime entryTime() {
        return super.entryTime().minusHours(1);
    }
}
