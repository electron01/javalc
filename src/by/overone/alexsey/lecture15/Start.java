package by.overone.alexsey.lecture15;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Start {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
//        System.out.println("pop: " + deque.pop());
        System.out.println("peek: " + deque.poll());
        System.out.println(deque);

        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");

        System.out.println(states);
    }
}
