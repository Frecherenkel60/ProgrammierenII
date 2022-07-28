package SortAlgorithms;

import java.util.List;

@SuppressWarnings("all")
public class bubbleSort<T> extends Sorter<T> {

    @Override
    public void sort(List<T> unsortedList) {
        var start = System.nanoTime();
        var length = unsortedList.size();

        for (int i = 0; i < length; i++){
            var changes = 0;
            for (int j = 0; j < length - i - 1; j++){
                var compareToResult = ((Comparable<T>)unsortedList.get(j)).compareTo(unsortedList.get(j+1));

                if (compareToResult <= 0) continue;
                var temp = unsortedList.get(j);
                unsortedList.set(j, unsortedList.get(j+1));
                unsortedList.set(j+1, temp);
                changes++;
            }
            if (changes == 0) break;
        }

        var end = System.nanoTime();
        printDuration(start, end);
    }
    
}
