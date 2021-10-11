/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import java.util.ArrayList;

/**
 *
 * @author akankshatelagamsetty
 */
public class information {
    
   

    
    private String serialno;
    private String manufacturer;
    private int seats;
    
    
    private String modelno;
    private String city;
    private String availabilty;
    
    private String expiration;
    private String yom;

    
    public information(){
        
    }
    public information(String serialno, String manufacturer, int seats, String modelno,String city,String availabilty,String expiration, String yom){
        
    this.serialno = serialno;
    this.manufacturer=manufacturer;
    this.seats =seats;
    this.modelno=modelno;
    this.city=city;
    this.availabilty=availabilty;
    this.expiration=expiration;
    this.yom=yom;
    
        
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAvailabilty(String availabilty) {
        this.availabilty = availabilty;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public void setYom(String yom) {
        this.yom = yom;
    }

    public String getSerialno() {
        return serialno;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSeats() {
        
        return seats;
    }

    public String getModelno() {
        return modelno;
    }

    public String getCity() {
        return city;
    }

    public String getAvailabilty() {
        return availabilty;
    }

    public String getExpiration() {
        return expiration;
    }

    public String getYom() {
        return yom;
    }
    

    boolean getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String toString(){
        
        return serialno;
    }
    
    
    
}
