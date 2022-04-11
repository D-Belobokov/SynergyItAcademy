package Lesson16_3_2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Необходимо реализовать методы объединения и пересечения двух множеств
 */

public class RunnerUnionIntersect {
    private static Set<Integer> union(Set<Integer> x1, Set<Integer> x2) {
        Set<Integer> rezultUnion = new HashSet<>(x1);
        rezultUnion.addAll(x2);
        return rezultUnion;
    }

    private static Set<Integer> intersect(Set<Integer> x1, Set<Integer> x2) {
        Set<Integer> rezultIntersect = new HashSet<>(x1);
        rezultIntersect.retainAll(x2);
        return rezultIntersect;
    }

    private static void print(String string, Set<Integer> set) {
        if (set.size() != 0) {
            System.out.print(string + " - { ");
            for (Integer currentElement : set) {
                System.out.print(currentElement + " ");
            }
            System.out.println(" } ");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> x1 = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            x1.add(random.nextInt(50));
        }
        Set<Integer> x2 = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            x2.add(random.nextInt(50));
        }
        print("Множество x1 ", x1);
        print("Множество x2", x2);
        System.out.println("********************************");
        print("Объеденение множеств", union(x1, x2));
        print("Пересечение множеств", intersect(x1, x2));
    }
}
