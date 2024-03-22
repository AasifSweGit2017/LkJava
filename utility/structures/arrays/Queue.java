package utility.structures.arrays;

public class Queue<Type>{
   private int start,end;
   private ArrayList<Type> arrayList;
    public Queue(){
        start = 0;
        end = 0;
        arrayList = new ArrayList<>();
    }

    /**
     * 
     */
    public void enqueue(Type value){
        arrayList.insert(end++, value);
    }

    /**
     * 
     */
    public Type dequeue(){
        end--;
        return arrayList.get();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
    }
}
