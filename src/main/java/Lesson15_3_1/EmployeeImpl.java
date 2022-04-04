package Lesson15_3_1;

import Lesson15_3_1.Base.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor

public class EmployeeImpl implements Employee {

    private String name;
    private int workAge;
    @Override
    public String toString() {
        return "EmployeeImpl{" +
                "name='" + name + '\'' +
                ", workAge=" + workAge +
                '}';
    }
    @Override
    public  void print(List<EmployeeImpl> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" введите минимальный возраст сотрудника ");
        int value = scanner.nextInt();
        for (int i = 0; i < employees.size();i++){
            if(employees.get(i).getWorkAge()>=value){
                employees.get(i).toString();
            }
        }
    }
}
