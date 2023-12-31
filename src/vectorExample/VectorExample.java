package vectorExample;

import listExample.Employee;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println();

        System.out.println(employeeList.get(2));
    }
}
