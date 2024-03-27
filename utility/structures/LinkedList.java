package utility.structures;

public class LinkedList<Type> {

    private Node headNode;

    private Node tailNode;

    private class Node{
        private Node pevNode;
        
        private Type value;

        private Node nextNode;
        
        /**
         * 
         * @param value
        */
        Node(Type value){
            this.value = value;
            nextNode = null;
        }

    }
    public LinkedList(){
        headNode = null;
    }

    public void insert(Type value){
        Node newNode = new Node(value);
    }

}
