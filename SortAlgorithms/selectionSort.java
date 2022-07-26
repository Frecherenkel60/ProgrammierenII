package SortAlgorithms;

import java.util.List;

public class selectionSort<T> implements Sorter<T> {

    @Override
    public List<T> sort(List<T> unsortedList) {
        var length = unsortedList.size();

        for(int i = 0; i < length; i++){
            var minVal = unsortedList.get(i);
            var idx = i;

            for(int j = length - 1; j > i; j--){
                var compareToResult = ((Comparable)unsortedList.get(j)).compareTo((Comparable)minVal);
                if (compareToResult >= 0) continue;
                minVal = unsortedList.get(j);
                idx = j;
            }

            var temp = unsortedList.get(i);
            unsortedList.set(i, minVal);
            unsortedList.set(idx, temp);
        }

        return null;
    }
}
