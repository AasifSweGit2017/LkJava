/**
 * Public methods 
 * 
 * Brief explanation                          method name                    return value:type
 * ------------------------------------------------------------------------------------------
 * Insert at specified position              : insert(index/position,value)                 null
 * Add at end                                : add(value)                          null
 * Delete at specified position              : remove(index)                        null
 * Delete at first                           : removeFirst()                        null
 * Delete at end                             : removeLast()                         null
 * Get from specified position               : get(index)                     Returns the value in index (value)
 * Get the value of first position           : get()                          Returns the value in first (value)
 * Update from specified position            : update(index,value)                   null
 * Copy of linkedList to linkedList          : copyOf(linkedList)                 linkedList
 * Search the specified value                : search(value)                  Returns the index for the value (index : type in Integer)
 * Find the values                           : contains(value)                Whether this value exists or not (true or false : type in Boolean)
 * Display the list                          : Iterator()                         null
 * Clear all values                          : clearAll()                           null
 * Length                                    : length()                       The size of the list (value : type in Integer)
 * Sort to ascending order                   : sortA()                            (null)/linkedList
 * Sort to descending order                  : sortD()                            (null)/linkedList
 * Two linkedList Comparison                  : isEquals()                    true or false:Boolean
 * Reverse linkedList                         : reverse()                          (null)/linkedList
 * Find min value                            : min()                          The minimum value in the list min value
 * Find max value                            : max()                          The maximum value in the list max value
 * Iterator
 * 
*/
package utility.structures;

import java.util.Iterator;

import org.w3c.dom.Node;

public class LinkedList<Type> implements Iterable<Type>{

    private Node headNode;

    private Node tailNode;

    private class Node {
        private Node previousNode;

        private Type value;

        private Node nextNode;

        /**
         * 
         * @param value
         */
        private Node(){
            value = null;
            nextNode = null;
            previousNode = null;
        }
      private  Node(Type value) {
            this.value = value;
            nextNode = null;
            previousNode = null;
        }

    }

    /**
     * 
     */
    public LinkedList() {
        headNode = null;
        tailNode = null;
    }

    /**
     * 
    */
    private int length = 0;
    /**
     * 
     * @return
     * 
     */
    public int length() {
        return length;
    }

    public void add(Type value){
        Node newNode = new Node(value);
        if (headNode == null && tailNode == null) {
            headNode = newNode;
            tailNode = newNode;
        }else{
            tailNode.nextNode = newNode;
            newNode.previousNode = tailNode;
            tailNode = newNode;
        }
        length++;
    }

    /***/
    public void insert(int position, Type value) {

        if (position > length || position < 1) {
            throw new IndexOutOfBoundsException("Invalid position ! " + position);
        }

        Node newNode = new Node(value);

        Node indexNode = headNode;

        for (int index = 1; index <= position; index++) {
            indexNode = indexNode.nextNode;
        }

        newNode.nextNode = indexNode;
        newNode.previousNode = indexNode.previousNode;
        indexNode.previousNode.nextNode = newNode;
        indexNode.previousNode = newNode;

        length++;

    }

    
    @Override
    public Iterator<Type> iterator() {
        return new Iterator<Type>() {
            private Node tempNode = headNode;
            private Type tempValue;
            @Override
            public boolean hasNext() {
                return tempNode != null;
            }
            @Override
            public Type next() {
                tempValue = tempNode.value;
                tempNode = tempNode.nextNode;
                return tempValue;
            }
        };
    }
    
}
