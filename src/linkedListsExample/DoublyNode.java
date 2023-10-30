package linkedListsExample;

import listExample.Employee;

public class DoublyNode {

    private Employee employee;
    private DoublyNode next;
    private DoublyNode previous;

    public DoublyNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    public String toString(){
        return employee.toString();
    }
}
