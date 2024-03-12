package utility.structures.arrays;

import java.util.Iterator;

/*
 * Public methods 
 * 
 * Brief explanation                          method name                    return value:type
 * ------------------------------------------------------------------------------------------
 * Copy of array to array                    : copyOf(arrayList)*                 arraylist
 * Add at end                                : add(value)*                          null
 * Insert at specified position              : insert(index,value)//*                  null
 * Delete at specified position              : remove(index)//*                        null
 * Delete at first                           : removeFirst()//*                        null
 * Delete at end                             : removeLast()//*                         null
 * Get from specified position               : get(index)*                     Returns the value in index (value)
 * Get the value of first position           : get()*                          Returns the value in first (value)
 * Update from specified position            : update(index,value)*                   null
 * Search the specified value                : search(value)*                  Returns the index for the value (index : type in Integer)
 * Find the values                           : contains(value)*                Whether this value exists or not (true or false : type in Boolean)
 * Display the list                          : Iterator()****                         null
 * Clear all values                          : clearAll()*                           null
 * Length                                    : length()*                       The size of the list (value : type in Integer)
 * Sort to ascending order                   : sortA()                            (null)/arraylist
 * Sort to descending order                  : sortD()                            (null)/arraylist
 * Two arraylist Comparison                  : isEquals()*                     true or false:Boolean
 * Reverse arraylist                         : reverse()*                          (null)/arraylist
 * Find min value                            : min()?                          The minimum value in the list min value
 * Find max value                            : max()?                          The maximum value in the list max value
 * Iterator
 * 
 * 
 * private method
 * 
 * Expand list                               : expandArray()
 * shrink list                               : shrinkArray()
 * 
 */

public class ArrayList<Type> implements Iterable<Type>{
 
    /*
     * 
     */
    private static final int DEFAULT_SIZE = 3;
    private Type[] arraylist;
    private int length;
    private int capacity;
    
    /*
     * After ArrayList creates objects Instantly initialize these values
     */
    @SuppressWarnings("unchecked")
   public ArrayList(){
        length = 0;
        capacity = DEFAULT_SIZE;
        arraylist = (Type[]) new Object[DEFAULT_SIZE];
    }



    /**
     * This method (copyOf(Type[] original,int newLength)) only of use to this class
     * Because this method copies to old array to a new array 
     * 
     * 
     */

    @SuppressWarnings("unchecked")
    private Type[] copyOf(Type[] original,int newLength){
        
        if (newLength == 0) {
            throw new NullPointerException("You are approach the illegal way ! : " + "Your input " + newLength + " | expected input 1 or greater 1");
        }
        Type[] newArrayList = (Type[]) new Object[newLength];
        

        for(int index = 0;index < original.length;index++){
            newArrayList[index] = original[index];
        }
        return newArrayList;
    }

    /*
     * You can use this method to copy the old arrayList to a new arrayList
     * This is what everyone calls it clone
     * This method after creating a new ArrayList copy to the old Array list value in the new list
     */

    public ArrayList<Type> copyOf(){

        ArrayList<Type> newArrayList = new ArrayList<>();
        for(int index = 0;index < length;index++){
            newArrayList.add(get(index));
        }
        return newArrayList;

    }

    /*
     * The expand array method is only for use in this class.
     * because this method is only for expanding the size of the array.
     */
    private void expandArray(){
        capacity *= 2;
        arraylist = copyOf(arraylist, capacity);
    }

    /*
     * The shrink Array method is only for use in this class.
     * because the shrink Array method is only for shrinking the size of the array.
     */
    private void shrinkArray(){

        if (capacity > DEFAULT_SIZE && capacity > (3 * length)) {
            capacity /= 2;
            arraylist = copyOf(arraylist, capacity);    
        }
    }
    

    /*
     * The length method you can use to count the value or size of the ArrayList
     * please consider this point before using it for any action.
     * this method returns the count of the value length of the ArrayList, not an index.
     *
     *  Subtract one from this if you want to use it as an index.
     *  After subtraction, you can store the integer index value
     */
    public int length(){
        return length;
    }


    /*
     * the add method is you can use to one by one value add
     * The add method does not insert value.
     * Adds this after the final value
     */
    public void add(Type value){
        if (length == capacity) {
            expandArray();
        }
        arraylist[length++] = value;
    }

    /*
     * If you do not pass an index value to this method
     * Returns the first value
     * After returning the value shifting of all the values to the front side
     */
    public Type get(){
        if(length == 0){
            throw new NullPointerException("list in empty");
        }
        Type value = arraylist[0];

        for(int index = 1; index < length;index++){
            arraylist[index - 1] = arraylist[index];
        }
        length--;
        return value;
    }

    /*
     * If you send an index using this method  Returns an index value
     * And this method used to only for returned the value not a shifting of the any value
     */
    public Type get(int index){
        if (length == 0) {
            throw new NullPointerException("list in empty !");
        }

        return arraylist[index];
    }

    /*
     * 
     * 
     * 
     */
    public void insert(int index,Type value){
        if ((length + 1) <=  index || index < 0) {
            throw new NullPointerException("Out of control ! : " + "Your input " + index + " | expected input 0 to " + length);
        }
        if (length == 0) {
            add(value);
            return;
        }
        if (length == capacity) {
            expandArray();
        }

        for(int index_in_loop = length - 1;index_in_loop >= index;index_in_loop--){
            arraylist[index_in_loop + 1] = arraylist[index_in_loop];
        }
        arraylist[index] = value;
        length++;
    }

    /*
     * 
     */

    public void removeFirst(){
        if (length == 0) {
            throw new NullPointerException("List is empty !");
        }
        for (int index = 1; index < length; index++) {
            arraylist[index - 1] = arraylist[index];
        }
        length--;

        shrinkArray();
    }

    /*
     * 
     */
    public void removeLast(){
        length--;
        shrinkArray();
    }

    /*
     * 
     * 
     */
    public void remove(int index){
        if (length == 0) {
            throw new NullPointerException("List is empty !");
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == length - 1) {
            removeLast();
            return;
        }

        for(int inner_index = index + 1;inner_index < length;inner_index++){
            arraylist[inner_index - 1] = arraylist[inner_index];
        }
        length--;
    }

    /*
     * 
     * 
     */
    public void update(int index,Type value){
        if (length == 0) {
            throw new NullPointerException("List is empty !");
        }
        if (length ==  index || index < 0) {
            throw new NullPointerException("Out of control ! : " + "Your input " + index + " | expected input 0 to " + (length - 1));
        }
        arraylist[index] = value;
    }

    /*
     * 
     * 
     */
    public int search(Type value){
        
        for(int inner_index = 0; inner_index < length; inner_index++){
            if(arraylist[inner_index] == value){
                return inner_index;
            }
        }
        return -1;
    }

    /*
     * 
     * 
     */
    public boolean contains(Type value){
        return(
            (search(value) != -1)?true:false
        );
    }

    /*
     * 
     */
    public Iterator<Type> iterator(){
        return new Iterator<Type>(){
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < length;
            }
            @Override
            public Type next() {
                return arraylist[index++];
            }
        };
    }


    /*
     * @example
     */

    @SuppressWarnings("unchecked")
    public void clearAll(){
        length = 0;
        capacity = DEFAULT_SIZE;
        arraylist = (Type[]) new Object[capacity];
    }


    /*
     * 
     */
    public boolean isEquals(ArrayList<Type> arrayList){
        return true;
    }

    /*
     * 
     */

    public void reverse(){
        int least_index = length - 1;Type tempValue = null;
        for(int index = 0;index < length;index++){
            tempValue = arraylist[index];
            arraylist[index] = arraylist[least_index];
            arraylist[least_index--] = tempValue;
            if (index > least_index) {
                break;
            }
        }
    }
    


}