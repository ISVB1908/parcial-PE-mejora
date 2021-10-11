/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classes;

/**
 *
 * @author vasqu
 */
public interface IStructure <T extends Comparable<T>> {
    public void add(T element);
    public Node<T> find(int position);
}
