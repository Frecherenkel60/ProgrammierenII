package SortAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortMain {
    
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        var rdm = new Random();

        for (int i = 0; i < 10000; i++){
            list.add(rdm.nextInt(25000));
        }

        testBubbleSort(list);
        testSelectionSort(list);
        testQuickSort(list);
    }

    private static void testQuickSort(List<Integer> list) {
        var sorter = new quickSort<Integer>();

        System.out.println("\n\nQuickSort!");

        System.out.println("Unsorted: ");
        //list.forEach(x -> System.out.print(x + ", "));
        sorter.sort(list);
        System.out.println("\nSorted: ");
        //list.forEach(x -> System.out.print(x + ", "));
    }

    private static void testBubbleSort(List<Integer> list) {
        var sorter = new bubbleSort<Integer>();

        System.out.println("\n\nBubbleSort!");

        System.out.println("Unsorted: ");
        //list.forEach(x -> System.out.print(x + ", "));
        sorter.sort(list);
        System.out.println("\nSorted: ");
        //list.forEach(x -> System.out.print(x + ", "));
    }

    private static void testSelectionSort(List<Integer> list) {
        var sorter = new selectionSort<Integer>();

        System.out.println("\n\nSelectionSort!");

        System.out.println("Unsorted: ");
        //list.forEach(x -> System.out.print(x + ", "));
        sorter.sort(list);
        System.out.println("\nSorted: ");
        //list.forEach(x -> System.out.print(x + ", "));
    }

}
