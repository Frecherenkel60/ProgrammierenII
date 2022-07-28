package SortAlgorithms;

import java.util.List;

public class quickSort<T> extends Sorter<T> {

    @Override
    public void sort(List<T> unsortedList) {
        var start = System.nanoTime();
        quickSorting(unsortedList, 0,  unsortedList.size()-1);
        var end = System.nanoTime();
        printDuration(start, end);
    }

    private void quickSorting(List<T> list, int low, int high){
        if (low < high){
            var pi = partition(list, low, high); // get partition index
            quickSorting(list, low, pi - 1); // partition left side
            quickSorting(list, pi + 1, high); // partition right side
        }
    }

    private int partition(List<T> list, int low, int high){
        var pivot = list.get(high); // pivot element is highest index
        int i = low - 1; // points to greater element

        for (int j = low; j < high; j++){
            // compare each element with pivot element
            if (((Comparable<T>)list.get(j)).compareTo(pivot) <= 0){
                // if smaller element is found swap it with the greater element
                var temp = list.get(++i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        // swap pivot element with the greater element
        var temp = list.get(++i);
        list.set(i, list.get(high));
        list.set(high, temp);

        return i;
    }

}