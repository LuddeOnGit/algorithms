package org.pg4200.ex03;

public class SortCheckerImp implements SortChecker {
    @Override
    public <T extends Comparable<T>> boolean isSortedCopy(T[] original, T[] sorted) {
        int howManySorted = 0;
        int howManySwitches = 0;
        int howManyCommon = 0;

        if(original == null && sorted == null){return true;}
        if(original == null || sorted == null && !(original == null && sorted == null)){return false;}
        if(original.length == 0 || sorted.length == 0){return true;}
        if(original.length != sorted.length){return false;}
        if(original.length == 1){return original[0] == sorted[0];}

        for (int i = 0; i < original.length; i++) {
            if(original[i] == null || sorted[i] == null){return false;};
            howManySorted = sorted[i] == original[i] ? howManySorted + 1 : howManySorted;
            try {
                if(sorted[i].compareTo(sorted[i+1]) > 0){return false;}
            } catch (Exception e){

            }
            for (int j = 0; j < original.length; j++) {
                howManyCommon = sorted[i] == original[j] ? howManyCommon + 1 : howManyCommon;
            }
            }

        return howManyCommon == original.length || howManySorted == original.length;
    }
}
