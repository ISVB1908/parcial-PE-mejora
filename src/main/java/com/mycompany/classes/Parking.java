/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classes;

import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author vasqu
 */
public class Parking {
    //atributos
    private Structure<Car> parkingList;
    private Node location;

    //constructor
    public Parking() {
        //crear el objeto del parqueadero
        parkingList=new Structure<Car>();
        
        for(int i=0;i<10;i++){
        
            Car slot=null;
            parkingList.add(slot);
        }
    }
    
    public Structure getParkingList() {
        return parkingList;
    }

    public void setParkingList(Structure<Car> ParkingList) {
        this.parkingList = ParkingList;
    }
    
    public Node getLocation() {
        return location;
    }

    public void setLocation(Node location) {
        this.location = location;
    }
    
    public void addCarro(Car p){
        Car carro=p;
        //saber si encontro o no
        
        //inicializar location
        if(location==null){
        location=parkingList.getFirst();
        }
        Node currentR=Parking.this.getLocation();
        Node currentL=Parking.this.getLocation();
        int countT=0;
        while(countT<=5){
        
        	//first part
            if(currentR.getValue()==null || currentR.getValue()=="Empty , Empty , Empty , Empty"){

            	location=currentR;
                location.setValue(carro);
                return;
            }

            currentR=currentR.getNext();
            
          //second part
            if(currentL.getValue()==null || currentL.getValue()=="Empty , Empty , Empty , Empty"){
            	location=currentL;
                location.setValue(carro);
                return;
            }
             currentL=currentL.getPrevious();
             countT++;
        }
               
        System.out.println("lista llena");
        
    } 
    
    public void deleteCarro(String placaC,Date exitDate){
    
        Node deleteC=parkingList.getFirst();
        do{

            
            String compare=placaC;
            String placaV=deleteC.getValue().toString().split(",")[0];
            if(placaV.equals(compare)){
            
                Car carrito= (Car) deleteC.getValue();
                String facturation=factura(carrito.getEnterDate(),exitDate);
                System.out.println("su factura es de:"+facturation);
                deleteC.setValue("Empty , Empty , Empty , Empty");
                location=deleteC;
                
                break;
                }
            
            
            deleteC=deleteC.getNext();
            
        }while(deleteC!=parkingList.getFirst());
        
    }
    public void deleteCarroID(int iD,Date exitDate){
    
        Node deleteC=parkingList.getFirst();
         int numEntero = iD;    
        String numCadena= String.valueOf(iD);
        do{

            String compare=numCadena;
            String placaV=deleteC.getValue().toString().split(",")[2];
            if(placaV.equals(compare)){

                Car carrito= (Car) deleteC.getValue();

                String facturation=factura(carrito.getEnterDate(),exitDate);
                System.out.println("su factura es de:"+facturation);
                deleteC.setValue("Empty , Empty , Empty , Empty");
                location=deleteC;
                
                break;
                }
            
            
            deleteC=deleteC.getNext();
            
        }while(deleteC!=parkingList.getFirst());
    }
    
  public String factura(Date enter,Date exit){


      long diff = exit.getTime() - enter.getTime();
      long days = diff / (1000 * 60 * 60 * 24);
      long hour=(diff/(60*60*1000)-days*24);
      long min=((diff/(60*1000))-days*24*60-hour*60);
      long s=(diff/1000-days*24*60*60-hour*60*60-min*60);
      //JOptionPane.showMessageDialog(null, days+"hora"+hour+"min"+min+"seg"+s);
      int minCost=50;
      long facturaT=(min*minCost)+((hour*60)*minCost)+((days*60*24)*minCost);
        return "por : "+days+" d "+hour+ " h "+min+" m: "+s+"s sufactura es de :";
    }
}
