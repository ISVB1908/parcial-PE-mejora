/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classes;

import java.util.Date;

/**
 *
 * @author vasqu
 */
public class Car implements Comparable<Car> {
    
    private String brand;
    private String plate;
    private Person owner;
    private Date enterDate;
    private Date exitDate;


    //constructor
    public Car(String brand, String plate, Person owner,Date enterDate) {
        this.brand = brand;
        this.plate = plate;
        this.owner = owner;
        this.enterDate=enterDate;

    }

    

    //getters and  setters
    
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Date getEnterDate() {
		return enterDate;
	}



	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}



	public Date getExitDate() {
		return exitDate;
	}



	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}



	@Override
    public int compareTo(Car o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
       
        
        return plate+","+brand+","+owner.toString();
    }

  
   
}
