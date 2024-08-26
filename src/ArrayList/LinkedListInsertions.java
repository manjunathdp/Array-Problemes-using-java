package ArrayList;

import java.util.LinkedList;

public class LinkedListInsertions {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();


        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");


        System.out.println("Original List: " + cities);


        insertAtBeginning(cities, "San Francisco");


        System.out.println("After Adding at Beginning: " + cities);


        insertAtEnd(cities, "Houston");


        System.out.println("After Adding at End: " + cities);
    }

    public static void insertAtBeginning(LinkedList<String> list, String element) {

        list.addFirst(element);
    }

    public static void insertAtEnd(LinkedList<String> list, String element) {

        list.addLast(element);
    }
}
