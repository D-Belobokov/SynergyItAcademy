package Lesson15_3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        EmployeeImpl employee1 = new EmployeeImpl("Dima",15);
        EmployeeImpl employee2 = new EmployeeImpl("Pasha" , 12);
        EmployeeImpl employee3 = new EmployeeImpl("Andrey",20);
        EmployeeImpl employee4 = new EmployeeImpl("Sasha", 9);
        EmployeeImpl employee5 = new EmployeeImpl("Olya", 17);

        List<EmployeeImpl>employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        System.out.println(" введите минимальный возраст сотрудника");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        PrintData.Print(employeeList,age);

        ListIterator<EmployeeImpl>iterator = employeeList.listIterator();
        System.out.println("итерация вперед, список всех сотрудников ");
        while (iterator.hasNext()) System.out.println(iterator.next());
        System.out.println("второй вариант перебора list, вывод всех сотрудников ");
        employeeList.forEach(new Consumer<EmployeeImpl>() {
            @Override
            public void accept(EmployeeImpl employee) {
                if(employee.getWorkAge()>=age){
                    System.out.println(employee.toString());
                }
            }
        });
        System.out.println("##############################");
        System.out.println("итерация коллекции с конца. Удаление нечетных позиций");
        boolean r = false;
        for (employeeList.listIterator(employeeList.size()); iterator.hasPrevious(); r = !r) {
            iterator.previous();
            if (r) {
                iterator.remove();
            }
        }
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
