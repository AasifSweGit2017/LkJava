package Test;

import utility.structures.arrays.Queue;
import utility.structures.arrays.Stack;

public class StackTest {
    public static void main(String[] args) {

        // Stack<Integer> stack = new Stack<>();
        // stack.setLimit(2);
        // stack.push(10);
        // stack.push(20);
        // stack.setLimit(-1);
        // stack.push(30);
        // stack.push(40);
        // stack.push(50);
        // // System.out.println(stack.isEmpty());
        // // System.out.println(stack.peak());
        // System.out.println(stack.pup());
        // // System.out.println(stack.peak());
        // System.out.println(stack.pup());
        // System.out.println(stack.pup());
        // System.out.println(stack.pup());
        // System.out.println(stack.pup());

        Queue<Integer> nema = new Queue<>();

        nema.enqueue(10);
        nema.enqueue(20);
        nema.enqueue(30);
        nema.enqueue(40);

        System.out.println(nema.dequeue());
        System.out.println(nema.dequeue());
        System.out.println(nema.dequeue());
        System.out.println(nema.dequeue());
        System.out.println(nema.dequeue());
    }
}
