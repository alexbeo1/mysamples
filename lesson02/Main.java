package lesson02;

import ru.oserbii.webapp.model.Link;

/**
 * Александр Козлов
 * 27.08.2015.
 */
public class Main {
    public static void main(String[] args) {

        Link l1 = new Link("Alex Kozloff", "www.oserbii.ru");
        Link l2 = l1;
        Link l3 = new Link(l1);
        System.out.println(l1.getClass());
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));

    }
}
