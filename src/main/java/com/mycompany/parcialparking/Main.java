/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialparking;

import com.mycompany.classes.Car;
import com.mycompany.classes.Node;
import com.mycompany.classes.Parking;
import com.mycompany.classes.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vasqu
 */
public class Main {
    public static void main(String[] args) {
        Parking newParking = new Parking();
        //Scanner sc= new Scanner(System.in);
        //System.out.println("ingrese marca");
        //String brandSave =sc.nextLine();
        //System.out.println("ingrese placas");
        //String plateSave =sc.nextLine();
        //System.out.println("ingrese su ID");
        //int idSave = Integer.parseInt(sc.nextLine());
        //System.out.println("si eres afiliado, escribe si, de lo contrario no");
        //String afiliateSave = sc.nextLine();
        //boolean checkAfiliate=false;
        //if(afiliateSave=="si"){
        
            //boolean chekAfiliate=true;
        //}else{
        
            //boolean chekAfiliate=false;
        //}
     //create
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm");

        String dateCompare ="24/09/2020-12:00";
		java.util.Date pruebaDate=null;

		try {
			pruebaDate= dateFormat.parse(dateCompare);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Person costumer = new Person(123,true);
        Car mafe =new Car("1","1",costumer,pruebaDate);
        Car molano= new Car("2","2",costumer,pruebaDate);
        Car mario= new Car("3","3",costumer,pruebaDate);
        Car pau= new Car("4","4",costumer,pruebaDate);
        Car cata= new Car("5","5",costumer,pruebaDate);
        Car santiago= new Car("6","6",costumer,pruebaDate);
        Car jax= new Car("7","7",costumer,pruebaDate);
        Car ate= new Car("8","8",costumer,pruebaDate);
        Car teo= new Car("9","9",costumer,pruebaDate);
        Car juan= new Car("10","10",costumer,pruebaDate);
        Car xd= new Car("11","11",costumer,pruebaDate);

        //add
        newParking.addCarro(mafe);
        newParking.addCarro(molano);
        newParking.addCarro(mario);
        newParking.addCarro(pau);
        newParking.addCarro(cata);
        newParking.addCarro(santiago);
        newParking.addCarro(jax);
        newParking.addCarro(ate);
        newParking.addCarro(teo);
        newParking.addCarro(juan);

        //newParking.deleteCarroID(123,2,1);
        //newParking.deleteCarroID(123,2,1);
        //newParking.deleteCarroID(123,2,1);
        
       // newParking.addCarro(xd);
        
        //newParking.addCarro(cata);
        //System.out.println(newParking.getLocation().getValue());
        //print
       // System.out.println(newParking.getParkingList().toString());
        //System.out.println(newParking.getParkingList().find(5).getPrevious().getValue());
        //Node current=newParking.getParkingList().getFirst();
        //for(int i=0;i<10;i++){
        
            //System.out.println(current.getValue());
            //current=current.getPrevious();
                    
        //}
        JOptionPane.showMessageDialog(null,newParking.getParkingList().toString() );
        int input =-1;
        do{
        
            JOptionPane.showMessageDialog(null,"1.Enter to the parking \n2.Salida por placas \n3.Salida por ID \n imprimir");
            input=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            while(input>4 || input<0){
                input=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            }
            switch(input){
            
                case 1:
                    //add
                    String addPlate=JOptionPane.showInputDialog("Digite las placas:");
                    String addBrand=JOptionPane.showInputDialog("Digite las brand:");
                    
                    String date=JOptionPane.showInputDialog("Enter de date for enter in that format dd/MM/yyyy-HH:mm");
            		Date date2=null;
            		try {
            		    //Parsing the String
            		    date2 = dateFormat.parse(date);
            		} catch (ParseException e) {
            		    // TODO Auto-generated catch block
            		    e.printStackTrace();
            		}

                    //
                    int addId=Integer.parseInt(JOptionPane.showInputDialog("Digite su ID:"));
                    String addAfiliate=JOptionPane.showInputDialog("Si es afiliado escriba si, de lo contrario no(minuscula):");
                    String si="si";
                    String no="no";
                    boolean verfyS=addAfiliate.equals(si);
                    boolean veryfyN=addAfiliate.equals(no);
                    while(verfyS==false && veryfyN==false){
                    
                        addAfiliate=JOptionPane.showInputDialog("Si es afiliado escriba si, de lo contrario no:");
                        si="si";
                        no="no";
                        verfyS=addAfiliate.equals(si);
                        veryfyN=addAfiliate.equals(no);
                    }
                    boolean afi=false;
                    if(verfyS==true){
                    
                        afi=true;
                    }else if(veryfyN==true){
                    
                        afi=false;
                    }
                    Person costumerr = new Person(addId,afi);
                    Car nuevoCarro = new Car(addBrand,addPlate,costumerr,date2);
                    newParking.addCarro(nuevoCarro);
                    //System.out.println(nuevoCarro.toString());
                    System.out.println(newParking.getParkingList().toString());
                    
                    break;
                case 2:
                    //deletePlate
                    String deletePlate=JOptionPane.showInputDialog("Digite las placas:");
                    String dateLater=JOptionPane.showInputDialog("Enter de date for enter in that format dd/MM/yyyy-HH:mm");
            		Date date3=null;
            		try {
            		    //Parsing the String
            		    date3 = dateFormat.parse(dateLater);
            		} catch (ParseException e) {
            		    // TODO Auto-generated catch block
            		    e.printStackTrace();
            		}

                    newParking.deleteCarro(deletePlate,date3);
                    

                    break;


                case 3:
                    //idDelete
                    int deleteId=Integer.parseInt(JOptionPane.showInputDialog("Digite el id:"));
                    String dateLater2=JOptionPane.showInputDialog("Enter de date for enter in that format dd/MM/yyyy-HH:mm");
            		Date date4=null;
            		try {
            		    //Parsing the String
            		    date4 = dateFormat.parse(dateLater2);
            		} catch (ParseException e) {
            		    // TODO Auto-generated catch block
            		    e.printStackTrace();
            		}

                    newParking.deleteCarroID(deleteId,date4);
                    break;
                case 4: 
                	//newParking.getParkingList().print();
                	JOptionPane.showMessageDialog(null,newParking.getParkingList().toString() );
                	
                    
            }
        }while(input!=0);
        
    }
}
