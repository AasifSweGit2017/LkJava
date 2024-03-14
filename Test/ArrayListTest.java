package Test;

import java.util.Arrays;

import utility.structures.arrays.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        Integer a[] = {1,3,5,71,37,18,63,12,71,12};
        ArrayList<Integer> newList = new ArrayList<>();
        ArrayList<String> newList2 = new ArrayList<>();
        newList.add(10);
        newList.add(20);
        newList.add(30);
        newList.add(40);
        newList.add(50);
        String aaString = new String("as");
        aaString.equals(a);
        ArrayList<Integer> newList3 = new ArrayList<>();
        newList3.add(10);
        // newList3.add(20);
        // newList3.add(20);
                System.out.println(newList.isEquals(newList3));
        newList2.add("Int");
        newList2.add("aasif");
        newList2.add("ram");
        newList2.add("vnith");

        for (String string : newList2) {
            System.out.print(" " +string);
        }
        newList2.reverse();
        System.out.println();
        for (String string : newList2) {
            System.out.print(" " +string);
        }

        // newList.clearAll();
        
        // newList.add(11);
        // newList.add(22);
        // for (Integer integer : newList) {
        //     System.out.print(" " +integer);
        // }
        // newList.add(33);
        // newList.add(44);
        // newList.add(55);
        
        // newList2 = newList.copyOf();
        // newList2 = newList.copyOf(a, 15);
        
        // // System.out.println(newList.get()); 
        // System.out.println(newList.length());
        // // System.out.println(newList.get(12)); 
        // newList.insert(10, 24);
        // System.out.println(newList.length());
        // // System.out.println(newList2.length()); 
        // // System.out.println(newList2.length()); 
        // System.out.println(newList.get(11)); 
        // // System.out.println(newList.capacity); 
        // System.out.println(Arrays.toString(a)); 
        // System.out.println(Arrays.toString(b)); 
        // newList.insert(11, 54);

        // System.out.println("\n\n");
        // System.out.println(" " + newList.get(0)); 
        // System.out.println(newList.length());
        // System.out.println("\n\n");
        // newList.remove(0);
        // // newList.removeFirst();
        // System.out.println(" " + newList.get(10)); 
        // newList.update(10,66);
        // System.out.println(" " + newList.get(3)); 
        
        // System.out.println(newList.search(100));
        // newList.reverse();
        
        
        // System.out.println(" " + newList.length());
        // for (Integer integer : newList) {
        //     System.out.print(" " +integer);
        // }
        // System.out.println(newList.length());

    }
}
