package linkedListsExample;

import listExample.Employee;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    public void addToFront(Employee employee) {
        DoublyNode node = new DoublyNode(employee);
        node.setNext(head);
        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addBefore(Employee newEmployee, Employee existEmployee) {
        DoublyNode current = head;
        DoublyNode newNode = new DoublyNode(newEmployee);

        if (current.getEmployee().equals(existEmployee)) {
            addToFront(newEmployee);
        } else {
            while (current != null) {
                if (current.getEmployee().equals(existEmployee)){
                    current.getPrevious().setNext(newNode);
                    newNode.setPrevious(current.getPrevious());
                    newNode.setNext(current);
                    current.setPrevious(newNode);

                }
                current = current.getNext();
            }
        }
        size++;

    }

    public void addToEnd(Employee employee) {
        DoublyNode node = new DoublyNode(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public DoublyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        DoublyNode removeNode = head;

        if (head.getNext() == null) {
            tail = null;
        }else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removeNode.setNext(null); //not necessary
        removeNode.setPrevious(null); //not necessary
        return removeNode;
    }

    public DoublyNode removeFromEnd(){
        if (isEmpty()) {
            return null;
        }

        DoublyNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setNext(null); //not necessary
        removedNode.setPrevious(null); //not necessary
        return removedNode;
    }

    public void printList() {
        DoublyNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.print("null");
        System.out.println();
    }
}
