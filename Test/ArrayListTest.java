package Test;

import java.util.Arrays;

import utility.structures.arrays.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        Integer a[] = {1,3,5,71,37,18,63,12,71,12};
        ArrayList<Integer> newList = new ArrayList<>();
        ArrayList<Integer> newList2 = new ArrayList<>();
        newList.add(10);
        newList.add(20);
        newList.add(30);
        newList.add(40);
        newList.add(50);
        newList.add(10);
        newList.add(20);
        newList.add(30);
        newList.add(40);
        newList.add(50);

        newList2 = newList.copyOf();
        // newList2 = newList.copyOf(a, 15);
        
        // System.out.println(newList.get()); 
        System.out.println(newList.length());
        System.out.println(newList.get(0)); 
        System.out.println(newList2.length()); 
        System.out.println(newList2.get(0)); 
        // System.out.println(newList.capacity); 
        System.out.println(Arrays.toString(a)); 
        // System.out.println(Arrays.toString(b)); 
    }
}
