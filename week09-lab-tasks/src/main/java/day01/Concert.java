package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> guests = new ArrayList<>();

    public void addPerson(Person person, LocalDateTime time) {
        LocalTime timeLimit = person.getTicket().entryTime();
        if (timeLimit.isBefore(time.toLocalTime())) {
                guests.add(person);
            System.out.println("Accepted!");
            } else {
            throw new IllegalArgumentException("Rejected!");
        }
    }
}