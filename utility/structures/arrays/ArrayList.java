package utility.structures.arrays;

/*
 * Public methods 
 * 
 * Brief explanation                          method name                    return value:type
 * ------------------------------------------------------------------------------------------
 * Copy of array to array                    : copyOf(arrayList)*                 arraylist
 * Add at end                                : add(value)*                          null
 * Insert at specified position              : insert(index,value)                  null
 * Delete at specified position              : remove(index)                        null
 * Delete at first                           : removeFirst()                        null
 * Delete at end                             : removeLast()                         null
 * Get from specified position               : get(index)*                     Returns the value in index (value)
 * Get the value of first position           : get()*                          Returns the value in first (value)
 * Update from specified position            : update(index,value)                   null
 * Search the specified value                : search(value)                  Returns the index for the value (index : type in Integer)
 * Find the values                           : contains(value)                Whether this value exists or not (true or false : type in Boolean)
 * Display the list                          : display()                            null
 * Clear all values                          : clearAll()                           null
 * Length                                    : length()                       The size of the list (value : type in Integer)
 * Sort to ascending order                   : sortA()                            (null)/arraylist
 * Sort to descending order                  : sortD()                            (null)/arraylist
 * Two arraylist Comparison                  : isEquals()                     true or false:Boolean
 * Reverse arraylist                         : reverse()                          (null)/arraylist
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

public class ArrayList<Type> {
 
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



    /*
     * This method (copyOf(Type[] original,int newLength)) only of use to this class
     * Because this method copies to old array to a new array 
     */

    @SuppressWarnings("unchecked")
    private Type[] copyOf(Type[] original,int newLength){

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
        capacity /= 2;
        arraylist = copyOf(arraylist, capacity);
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
}