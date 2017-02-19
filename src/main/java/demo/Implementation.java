package demo;

import java.util.HashSet;
import java.util.Iterator;
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
        System.out.print("set1: ");
        printSet(set1);

        System.out.print("\nset2: ");
        printSet(set2);

        System.out.print("\nunion: ");

        for (Integer element : set2) {
            if(!set1.contains(element)) {
                set1.add(element);
            }
        }
        printSet(set1);
        System.out.println("\n");
    }

    private static void intersect(Set<Integer> set1, Set<Integer> set2) {
        System.out.print("set1: ");
        printSet(set1);

        System.out.print("\nset2: ");
        printSet(set2);

        System.out.print("\nintersect: ");

        for (Integer element : set2) {
            if(set1.contains(element)) {
                set1.remove(element);
            }
        }
        printSet(set1);
        System.out.println("\n");
    }

    private static void printSet(Set<Integer> set) {
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
