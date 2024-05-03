package org.example.summary._03_05_2024._class;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Event implements Comparable<Event> {
    /**
     * public record Event(LocalDateTime dateTime, String description) {
     * }
     */
    private final LocalDateTime dateTime;
    private final String description;

    public Event(LocalDateTime dateTime, String description) {
        this.dateTime = dateTime;
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Event o) {
        int result = this.dateTime.compareTo(o.dateTime);
        if (result == 0) result = this.description.compareTo(o.description);
        return result;
    }

    @Override
    public String toString() {
        return "Event (" +
                "dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ')';
    }
}
