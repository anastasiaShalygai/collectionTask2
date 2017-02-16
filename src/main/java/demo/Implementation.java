package demo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anastasiya on 15.02.2017.
 */
class Implementation {
    static void initialization() {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(2);
        set2.add(5);
        set2.add(3);

        union(set1, set2);
        intersect(set1, set2);
    }

    private static void union(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        printSet(set1);
    }

    private static void intersect(Set<Integer> set1, Set<Integer> set2) {
        set1.retainAll(set2);
        printSet(set1);
    }

    private static void printSet(Set<Integer> set) {
        System.out.println(set);
    }
}
