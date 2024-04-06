package example;

public class LinkedList {
    public static void main(String[] args) {

        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>(); //링크드리스트 생성자

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        linkedList.addFirst("Grape");
        linkedList.addLast("Strawberry");
        linkedList.remove("Banana");

        System.out.println("Linked List : " + linkedList);
        System.out.println("First Element : " + linkedList.getFirst());
        System.out.println("Last Element : " + linkedList.getLast());
        System.out.println("Is Empty? " + linkedList.isEmpty());
        linkedList.clear();

        System.out.println("Is Empty after clear? " + linkedList.isEmpty());
    }
}