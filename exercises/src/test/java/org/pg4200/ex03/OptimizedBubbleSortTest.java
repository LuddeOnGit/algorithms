package org.pg4200.ex03;

import org.junit.jupiter.api.Test;

import javax.swing.text.SimpleAttributeSet;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Comparator;


public class OptimizedBubbleSortTest {

    private OptimizedBubble sorter = new OptimizedBubble();

    private class StringComparator implements Comparator<String>{
        @Override
        public int compare(String a, String b){return a.compareTo(b);}
    }

    private class GameUserComparator implements Comparator<GameUser>{
        @Override
        public int compare(GameUser o1, GameUser o2) {
            if(o1.getPoints() == o2.getPoints()){return 0;}
            return o1.getPoints() > o2.getPoints() ? 1 : -1;
        }
    }

    @Test
    public void lessThanHalf(){
        String[] unsortedList1 = {"c", "b", "a", "d", "e", "f"};
        String[] unsortedList2 = {"q", "c", "f", "u", "x", "i"};
        int comparisonsUnoptimized = sorter.sort(unsortedList1, new StringComparator(),false);
        int comparisonsOptimized = sorter.sort(unsortedList2, new StringComparator(),true);
        System.out.println(comparisonsOptimized);
        System.out.println(comparisonsUnoptimized);
        assertTrue(comparisonsUnoptimized/2 > comparisonsOptimized);
    }

    @Test
    public void daGame(){
        GameUser Gavin = new GameUser("Gavin", 52);
        GameUser Ludvik = new GameUser("Ludvik", 30);
        GameUser Victor = new GameUser("Victor", 22);
        GameUser Anders = new GameUser("Anders", 20);
        GameUser Jacob = new GameUser("Jacob", 1);
        GameUser[] unsortedList = {Gavin, Ludvik, Victor, Anders, Jacob};
        GameUser[] sortedList = {Jacob, Anders, Victor, Ludvik, Gavin};
        int comparisonsOptimized = sorter.sort(unsortedList, new GameUserComparator(),true);
        assertTrue(unsortedList[0] == Jacob);
        assertTrue(unsortedList[1] == Anders);
        assertTrue(unsortedList[2] == Victor);
        assertTrue(unsortedList[3] == Ludvik);
        assertTrue(unsortedList[4] == Gavin);
    }
}
