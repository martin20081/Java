package workShop;

import java.util.Arrays;
import java.util.function.Consumer;

public class SmartArray {


   //fields
    private int[] data;
    private  int size;
    private int capacity;

    //constructor

    public SmartArray (){

        this.size = 0;
        this.capacity = 4;
        this.data = new int[this.capacity];
    }

    //methods

    //add -> Adds the given element to the end of the list
    public void  add (int element){

        if (this.size == this.capacity) {

            increaseCapacity();
        }

        this.data[size] = element;
        this.size ++;
    }


    public int size (){

        for (int position = 0; position <=this.data.length -1 ; position++) {
            size++;
        }

        return size;
    }

    private void increaseCapacity() {

        this.capacity *= 2;
        int[] temporary = new int[this.capacity];

        for (int position = 0; position < this.data.length - 1; position++) {
            temporary[position] = this.data[position];
        }

        this.data = temporary;
    }

    // get -> Returns the element at the specified position in this list
    public int get (int index){

        if (validateIndex(index)){
            return this.data[index];
        }else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
    public boolean validateIndex (int index){

        return index >= 0 && index <= this.size - 1;
    }

    //remove -> Removes the element at the given index
    public int remove (int index){

       if (validateIndex(index)){
           int removedElement = this.data[index];

           for (int position = index; position <=this.size -1 ; position++) {
               this.data[position] = this.data[position + 1];
               
           }
           this.size -- ;

           this.data[this.size -1] = 0;

           return removedElement;

       }else {
           throw new IndexOutOfBoundsException("Invalid index");
       }
    }

    //contains - > Checks if the list contains the given element returns (True or False)
    public boolean contains (int element){

        for (int number : this.data){
            if (number == element) {
                return true;
            }
        }
        return true;
    }

    // add - > Adds element at the specific index, the element at this index gets shifted to the right alongside any following elements, increasing the size
    public void  add ( int  element , int index){

        if (this.size == this.capacity || this.size == this.capacity -1) {
            increaseCapacity();
        }
        for (int position = this.size -1; position >= index ; position--) {

            this.data[position + 1] = this.data[position];
        }

        this.data[index] = element;
        this.size ++;
    }

    //forEach -> Goes through each one of the elements in the list
    public void forEach (Consumer <Integer> consumer){

        for (int position = 0; position <=this.size -1 ; position++) {

            int currentElement = this.data[position];
            consumer.accept(currentElement);
            
        }
    }
}
