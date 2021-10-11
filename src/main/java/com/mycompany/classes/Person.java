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
public class Person {
    
    private int id;
    private boolean affiliate;
//constructor
    public Person(int id, boolean affiliate) {
        this.id = id;
        this.affiliate = affiliate;
    }
//getters and setters
    public boolean isAffiliate() {
        return affiliate;
    }

    public void setAffiliate(boolean affiliate) {
        this.affiliate = affiliate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        String cadenaA;
        String cadena = Integer.toString(id);
        if(affiliate=true){
        
            cadenaA="Si";
        }else{
        
            cadenaA="No";
        }
        return cadena+","+cadenaA;
    }
}
