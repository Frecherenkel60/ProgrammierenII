package SortAlgorithms;

import java.util.List;

public interface Sorter<T> {
    
    public abstract List<T> sort(List<T> unsortedList);

}
