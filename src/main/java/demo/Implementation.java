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
        Set<Integer> setTemp = new HashSet<Integer>();
        setTemp.addAll(set1);

        for (Integer element : set2) {
            if (!setTemp.contains(element)) {
                setTemp.add(element);
            }
        }
        printSet(setTemp, "union");
    }

    private static void intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setTemp = new HashSet<Integer>();
        setTemp.addAll(set1);

        for (Integer element : set2) {
            if (setTemp.contains(element)) {
                setTemp.remove(element);
            }
        }
        printSet(setTemp, "intersect");
    }

    private static void printSet(Set<Integer> setResult, String operation) {
        System.out.print("\noperation: " + operation + "\n");
        Iterator iterator = setResult.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
