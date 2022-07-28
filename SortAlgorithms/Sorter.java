package SortAlgorithms;

import java.util.List;

public abstract class Sorter<T> {
    
    public abstract void sort(List<T> unsortedList);

    public void printDuration(long start, long end){
        var duration = end - start;
        var ms = (long) (duration / 10e5);
        System.out.println("\nRuntime-Duration: " + (end-start) + "ns" + " // " + ms + "ms");
    }

}
