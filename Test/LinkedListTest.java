package Test;

import utility.structures.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        System.out.println(numberList.length());
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        System.out.println(numberList.length());
        for (Integer integer : numberList) {
            System.out.println(integer);
        }
        // numberList.insert(1,9);
    }
}
