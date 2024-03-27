package utility.structures.arrays;

import java.util.EmptyStackException;

public class Queue<Type>{
   private int start,end,limit;
   private ArrayList<Type> arrayList;
    public Queue(){
        start = -1;
        end = 0;
        limit = -1;
        arrayList = new ArrayList<>();
    }


    public void setLimit(int limit){
        this.limit = limit;
    }
    /**
     * 
     */
    public void enqueue(Type value){
        if (end == 0 && start == -1) {
            start = 0;
        }
        if (limit != -1) {
            if (end != limit) {
                arrayList.insert(end++, value);
            }else{
                throw new StackOverflowError();
            }
        }else{
            arrayList.insert(end++, value);
        }
    }

    /**
     * 
     */
    public Type dequeue(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }else{
            return arrayList.get(start++);
        }
    }

    public boolean isEmpty(){
        return(
            start != -1?false:true
        );
    }

}
