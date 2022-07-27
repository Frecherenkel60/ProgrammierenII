package SortAlgorithms;

import java.util.List;

public class bubbleSort<T> implements Sorter<T> {

    @Override
    public void sort(List<T> unsortedList) {
        var start = System.nanoTime();
        var length = unsortedList.size();

        for (int i = 0; i < length; i++){
            for (int j = 0; j < length - i - 1; j++){
                var compareToResult = ((Comparable)unsortedList.get(j)).compareTo((Comparable)unsortedList.get(j+1));

                if (compareToResult <= 0) continue;
                var temp = unsortedList.get(j);
                unsortedList.set(j, unsortedList.get(j+1));
                unsortedList.set(j+1, temp);
            }
        }

        var end = System.nanoTime();
        var duration = end - start;
        var ms = (long) (duration / 10e5);
        System.out.println("\nRuntime-Duration: " + (end-start) + "ns" + " // " + ms + "ms");
    }
    
}
