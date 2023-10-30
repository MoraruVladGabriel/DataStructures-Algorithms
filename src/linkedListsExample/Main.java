package linkedListsExample;

import listExample.Employee;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();

        System.out.println(list.getSize());

        list.printList();

        System.out.println();

        System.out.println("Doubly Linked List example: ");

        DoublyLinkedList list1 = new DoublyLinkedList();

        list1.addToFront(janeJones);
        list1.addToFront(johnDoe);
        list1.addToFront(marySmith);
        list1.addToFront(mikeWilson);

        list1.printList();

        System.out.println("Size of Doubly Linked List: " + list1.getSize());

        Employee billEnd = new Employee("Bill","End",78);

        list1.addToEnd(billEnd);

        list1.printList();

        System.out.println("Size of Doubly Linked List: " + list1.getSize());

        list1.removeFromFront();

        list1.printList();

        System.out.println("Size of Doubly Linked List: " + list1.getSize());

        list1.removeFromEnd();

        list1.printList();

        System.out.println("Size of Doubly Linked List: " + list1.getSize());

    }

}