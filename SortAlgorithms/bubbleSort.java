package SortAlgorithms;

import java.util.List;

public class bubbleSort<T> implements Sorter<T> {

    @Override
    public List<T> sort(List<T> unsortedList) {
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

        return unsortedList;
    }
    
}
