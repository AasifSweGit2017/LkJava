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

public class Stack<Type> {

    private int top_of_stack;
    private ArrayList<Type> arrayList;
    
    public Stack() {
        top_of_stack = 0;
        arrayList = new ArrayList<>();
    }

    /**
     * 
     * @param value
     */
    public void push(Type value) {
        arrayList.insert(top_of_stack++, value);
    }

    /**
     * 
     * @return
     * 
     */
    public Type pup() {
        return arrayList.get(--top_of_stack);
    }

    /**
     * 
     * @return
     */
    public Type peak() {
        return arrayList.get(
                arrayList.length() - 1);
    }

}
