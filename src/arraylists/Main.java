package arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Employee>employeeList=new ArrayList<>();
        employeeList.add(new Employee("Jaggu","G",03));
        employeeList.add(new Employee("Popu","G",24));
        employeeList.add(new Employee("Mangu","R",54));
        employeeList.add(new Employee("Changu","K",034));

       employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.get(3));//employee at index 3
        System.out.println(employeeList.isEmpty());//to check if list is empty or not

        employeeList.set(1,new Employee("Shuru","G",20));//replace name with new employee
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());//the total number of items this list can hold

        employeeList.add(3,new Employee("Tingu","lola",24567));//adding element in between list
        employeeList.forEach(employee -> System.out.println(employee));

        Employee [] employeeArray=employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee:employeeArray){
            System.out.println(employee);

            //search arrays to look something in an array list
            System.out.println(employeeList.contains(new Employee("Mangu","R",54)));//equals method
            System.out.println(employeeList.indexOf(new Employee("Changu","K",034)));//index of employee

            employeeList.remove(2);
        }






    }
}
