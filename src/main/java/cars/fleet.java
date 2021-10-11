/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author akankshatelagamsetty
 */
public class fleet {
        private ArrayList<information> carfleet;
        private String updatedtime;
    public fleet(){
        
        
        this.carfleet = new ArrayList<information>();
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        updatedtime = formatter.format(now);
        initialentries();
    } 

    public String getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(String updatedtime) {
        this.updatedtime = updatedtime;
    }

    public ArrayList<information> getCarfleet() {
        return carfleet;
    }

    public void setCarfleet(ArrayList<information> carfleet) {
        this.carfleet = carfleet;
    }
    
    
    public information addNewInfo(){
        information newinfo = new information();
        carfleet.add(newinfo);
        return newinfo;
    }
    

public void deleteCar(information selectedCar) {
carfleet.remove(selectedCar);
}


public void initialentries(){
information entry1 = new information("1", "Renault", 3, "GHET3", "Austin", "Yes", "2005", "2010");
information entry2 = new information("2", "Hyundai", 3, "GHET3", "Miami", "No", "2020", "2002");
information entry3 = new information("3", "Mercedes", 3, "GHET3", "Floria", "Yes", "2011", "2005");

carfleet.add(entry1);
carfleet.add(entry2);
carfleet.add(entry3);


}


}
