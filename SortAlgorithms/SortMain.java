package SortAlgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortMain {
    
    public static void main(String[] args) {
        var list = Arrays.asList(new Integer[]{15, 1, 13, 12, 4, 6, 2, 239, 21, 25, 17});

        // testBubbleSort(list);
        // testSelectionSort(list);
        testQuickSort(list);
    }

    private static void testQuickSort(List<Integer> list) {
        var sorter = new quickSort<Integer>();

        System.out.println("Unsorted: ");
        list.forEach(x -> System.out.print(x + ", "));
        sorter.sort(list);
        System.out.println("\nSorted: ");
        list.forEach(x -> System.out.print(x + ", "));
    }

    private static void testBubbleSort(List<Integer> list) {
        var sorter = new bubbleSort<Integer>();

        System.out.println("Unsorted: ");
        list.forEach(x -> System.out.print(x + ", "));
        sorter.sort(list);
        System.out.println("\nSorted: ");
        list.forEach(x -> System.out.print(x + ", "));
    }

    private static void testSelectionSort(List<Integer> list) {
        var sorter = new selectionSort<Integer>();

        System.out.println("Unsorted: ");
        list.forEach(x -> System.out.print(x + ", "));
        sorter.sort(list);
        System.out.println("\nSorted: ");
        list.forEach(x -> System.out.print(x + ", "));
    }

}
