package org.example.summary._03_05_2024;

import org.example.summary._03_05_2024._class.Event;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Event eventA = new Event(LocalDateTime.now(), "Событие A");
        Event eventB = new Event(LocalDateTime.now().minusDays(1L), "Событие B");
        Event eventC = new Event(LocalDateTime.now().plusDays(2), "Событие C");
        Event eventD = new Event(LocalDateTime.of(2024, 5, 24, 12, 0), "Событие D");
        List<Event> eventList = new ArrayList<>(List.of(eventA, eventB, eventD, eventC));
        Collections.sort(eventList);
        eventList.forEach(event -> System.out.println(event));


        Deque<String> word = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message: ");

        while (true) {
            String message = scanner.nextLine();
            if (!message.equals("stop")) break;
            word.add(message);
        }
        while (!word.isEmpty()) {
            System.out.println(word.removeFirst());
            if (!word.isEmpty()) {
                System.out.println(word.removeLast());
            }
        }

    }
}
