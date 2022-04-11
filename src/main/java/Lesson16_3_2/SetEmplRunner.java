package Lesson16_3_2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Необходимо создать структура данных Set<Employee>, который бы мог учесть логику добавления сотрудников
 * из предыдущего задания таким образом, что первыми в множестве должны идти Employee с максимальным стажем и по убывающей.
 */

public class SetEmplRunner {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getWorkAge() - o1.getWorkAge();
            }
        });
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employeeSet.add(employee);
        }
        Iterator<Employee> it1 = employeeSet.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
