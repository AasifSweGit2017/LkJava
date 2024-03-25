/**
 * 
 * Default methods
 * 
 * pup
 * push
 * 
 * peak
*/

package utility.structures.arrays;

import java.util.EmptyStackException;

public class Stack<Type> {

    /**
     * 
     */
    private int top;
    private int limit;
    private ArrayList<Type> arrayList;

    /**
     * 
     * 
     * 
    */
    public Stack() {
        limit = -1;
        top = 0;
        arrayList = new ArrayList<>();
    }

    /**
     * 
     * 
     * 
     * 
     * @param value
     * 
     * 
    */

    public void setLimit(int limit){
        this.limit = limit;
    }


    /**
     * 
     * @param value
     */

    public void push(Type value) {
        if (limit != -1) {
            if (top != limit) {
                arrayList.insert(top++, value);
            }else{
                throw new StackOverflowError(null);
            }
        }else{
            arrayList.insert(top++, value);
        }
        
    }

    /**
     * 
     * 
     * @return
     * 
     * 
     */
    public Type pup() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return arrayList.get(--top);
    }

    /**
     * 
     * @return
     */
    public Type peak() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return arrayList.get(
                arrayList.length() - 1);
    }

    public boolean isEmpty(){
        return(
            top == -1 || top == 0?true:false
        );
    }


}
