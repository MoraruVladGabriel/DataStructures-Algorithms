package listExample;

import java.util.ArrayList;
import java.util.List;
/*
IMPORTANT: ArrayList is not syncronized!
If a thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector.
 */
public class ArrayListExample {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 8435));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John","Doe",4567));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println();

        System.out.println("Employee array:");

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee: employeeArray){
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary","Smith", 22)));

        System.out.println(employeeList.indexOf(new Employee("John", "Doe",4567)));

        employeeList.remove(2);

        System.out.println();

        employeeList.forEach(employee -> System.out.println(employee));


    }
}
