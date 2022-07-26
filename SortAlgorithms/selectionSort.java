package SortAlgorithms;

import java.util.List;

@SuppressWarnings("all")
public class selectionSort<T> extends Sorter<T> {

    @Override
    public void sort(List<T> unsortedList) {
        var start = System.nanoTime();
        var length = unsortedList.size();

        for(int i = 0; i < length; i++){
            var minVal = unsortedList.get(i);
            var idx = i;

            for(int j = length - 1; j > i; j--){
                var compareToResult = ((Comparable<T>)unsortedList.get(j)).compareTo(minVal);
                if (compareToResult >= 0) continue;
                minVal = unsortedList.get(j);
                idx = j;
            }

            var temp = unsortedList.get(i);
            unsortedList.set(i, minVal);
            unsortedList.set(idx, temp);
        }

        var end = System.nanoTime();
        printDuration(start, end);
    }
}
