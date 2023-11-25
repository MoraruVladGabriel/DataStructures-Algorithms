package stacksExample;

import listExample.Employee;

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