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

        Queue<Integer> name = new Queue<>();

        System.out.println(name.isEmpty());
        name.enqueue(10);
        name.enqueue(20);
        name.enqueue(30);
        name.enqueue(40);
        System.out.println(name.isEmpty());

        System.out.println(name.dequeue());
        System.out.println(name.dequeue());
        System.out.println(name.dequeue());
        System.out.println(name.dequeue());
        System.out.println(name.dequeue());
        // System.out.println(name.isEmpty());
    }
}
