package stacksExample;

import listExample.Employee;

/*
- Abstract data type
- LIFO : Last in, first out
- push : adds an item as the top item on the stack
- pop : removes the top item on the stack
- peek : gets the top item on the stack
- Ideal backing data structure : linked list

- O(1) for push, pop, and peek, when using a linked list
- If you use an array, then push is O(n), because the array may have to be resized
- If you know the maximum number of items the will ever be on the stack, an array can be a good choice
- If memory is tight, an array might be a good choice
- Linked list is ideal
 */
public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 3245));
        stack.push(new Employee("Mike", "Wilsin", 3222));
        stack.push(new Employee("Bill", "End", 22));

        //stack.printStack();

        System.out.println(stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);


        LinkedStack stack1 = new LinkedStack();

        System.out.println();
        System.out.println("LikedStack: ");

        stack1.push(janeJones);
        stack1.push(johnDoe);
        stack1.push(marySmith);
        stack1.push(mikeWilson);

        stack1.printStack();

        System.out.println("Popped: " + stack1.pop());
        System.out.println(stack1.peek());

    }

}