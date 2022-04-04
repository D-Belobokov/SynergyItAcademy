package Lesson15_3_1;

import java.util.List;

public class PrintData {
    public static int value;
    public static void Print(List<EmployeeImpl> employees,int value) {
        System.out.println(" список сотрудников по запросу: стаж не менее = " + value + " лет ");
        boolean maxAge;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getWorkAge() >= value) {
                System.out.println(employees.get(i).toString());
            } System.out.println(" с заданным стажем работников нет ");
        }
    }
}
