package Generics_jar_01;

import java.util.ArrayDeque;

public class Jar <T>{

    //fields
    private ArrayDeque<T> elements;

    //constructor
    public Jar(){

        this.elements = new ArrayDeque<>();
    }

    //methods
    public void add (T element){
        this.elements.push(element);
    }

    public T remove(){
        return this.elements.pop();
    }
}
