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
public class Node <T extends Comparable<T>> {
    
    private Node<T> next;
    private Node<T> previous;
    private T value;

    //constructor
    public Node( T value) {
        this.next = next;
        this.previous = previous;
        this.value = value;
    }

    //getters and setters
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
    
}
