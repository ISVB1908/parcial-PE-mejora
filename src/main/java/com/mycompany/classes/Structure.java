/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classes;

/**
 *
 * @author vasqu
 * @param <T>
 */
public class Structure<T extends Comparable<T> > implements IStructure<T> {
    private Node<T> first;
    private Node<T> last;
    private Node<T> current;
    
    

    //getters and setters
    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public Node<T> getCurrent() {
        return current;
    }

    public void setCurrent(Node<T> current) {
        this.current = current;
    }

    //function

    @Override
    public void add(T element) {
        //Node<T> newNode = new Node<T>(element);
        //if(first == null){
            //first = newNode;
            //current = first;
            //last = first;
            
        //}
        //else{
            //last.setNext(newNode);
            //newNode.setPrevious(last);
            //last = newNode;
            
        //}
        
        
        Node<T> position = new Node<T>(element);
        if(first==null){
        first=position;
        first.setPrevious(last);
        last=first;
        }else{
            last.setNext(position);
            position.setPrevious(last);
            last=position;
            last.setNext(first); 
            first.setPrevious(last);
        }
        
    }
    @Override
    public String toString(){
    
        current=first;
        int count=0;
        String cadena = "";
        while(count<10){
        
            System.out.println(current.getValue());
            cadena=cadena + "\n" + current.getValue();
            current=current.getNext();
            count++;
        }
        return cadena;
    }

    @Override
    public Node<T> find(int position) {
        int count=0;
        current=first;
        while(count<position){
        
            current=current.getNext();
            count++;
        }
        return current;
    }

    public void print(){

        Node<T> print = first;
        String cadena = " ";

        for(int i=0; i<10;i++){
            System.out.println(print.getValue());
            print = print.getNext();

        }
    }
}