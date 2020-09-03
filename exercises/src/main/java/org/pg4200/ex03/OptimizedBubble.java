package org.pg4200.ex03;

import java.util.Arrays;
import java.util.Comparator;

public class OptimizedBubble {
    public <T> int sort(T[] array, Comparator<T> comparator, boolean optimized){
        int comparisons = 0;
        int sortedFrom = array.length-1;
        boolean notSorted = true;
        
        while((optimized ? sortedFrom > 0 : notSorted)){
            int helpHowDoYouCount = 0;
            for (int i = 0; i < (optimized ? sortedFrom : (array.length-1)); i++) {
                if(comparator.compare(array[i], array[i+1]) > 0){
                    T temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
                comparisons++;
                helpHowDoYouCount = i;
            }
            sortedFrom = helpHowDoYouCount;
            notSorted = !((comparisons >= array.length*array.length) && !optimized);
        }
        System.out.println(Arrays.toString(array));
        return comparisons;
    }


}
