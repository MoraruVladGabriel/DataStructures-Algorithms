package queuesExample;

import listExample.Employee;

import java.util.ArrayDeque;
import java.util.Queue;

/*
- Abstract data type
- LIFO : Last in, first out
- add - also called enqueue - add an item to the end of the queue
- remove - also called dequeue - remove the item at the front of the queue
- peek - get the item at the front of the queue, but don't remove it
 */
public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);

        queue.printQueue();

        queue.remove();

        System.out.println();

        queue.printQueue();

        System.out.println();

        System.out.println(queue.peek());

        System.out.println();

        queue.printQueue();

        System.out.println();

        Queue<Employee> jdkQueue = new ArrayDeque<>();

        jdkQueue.add(janeJones);
        jdkQueue.add(johnDoe);
        jdkQueue.add(marySmith);
        jdkQueue.add(mikeWilson);

        for (Employee employee: jdkQueue) {
            System.out.println(employee);
        }

        System.out.println();

        System.out.println(jdkQueue.peek());

        System.out.println();

        jdkQueue.remove();

        for (Employee employee: jdkQueue) {
            System.out.println(employee);
        }
    }

}