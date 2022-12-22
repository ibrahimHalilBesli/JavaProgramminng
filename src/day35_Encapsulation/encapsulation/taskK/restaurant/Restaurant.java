package day35_Encapsulation.encapsulation.taskK.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    private String owner, location;
    private int numberOfstars;

    private ArrayList<CalledSErver> sErvers;
    private ArrayList<CalledChef> chefs;

    public Restaurant(String owner, String location, int numberOfstars) {
        this.owner = owner;
        this.location = location;
        this.numberOfstars = numberOfstars;
        sErvers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfstars() {
        return numberOfstars;
    }

    public void setNumberOfstars(int numberOfstars) {
        this.numberOfstars = numberOfstars;
    }

    public ArrayList<CalledSErver> getsErvers() {
        return sErvers;
    }

    public void setsErvers(ArrayList<CalledSErver> sErvers) {
        this.sErvers = sErvers;
    }

    public ArrayList<CalledChef> getChefs() {
        return chefs;
    }

    public void setChefs(ArrayList<CalledChef> chefs) {
        this.chefs = chefs;
    }

    public void hireServer(CalledSErver sErver){

        sErvers.add(sErver);
    }
    public void hireServer(CalledSErver[] servers){

        this.sErvers.addAll(Arrays.asList(servers));
    }

    public void hireChef(CalledChef chef){
        chefs.add(chef);
    }
    public void hireChef(CalledChef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfstars=" + numberOfstars +
                ", Number sErvers=" + sErvers.size() +
                ",Number chefs=" + chefs.size()+
                '}';
    }
    /*

    Restaurant Task:
re-do the Restaurant task by making all the fields private in each
custom classes
Encapsulate all the field
(salary cannot be set to negative)
(employeeId cannot be set to negative or zero)
Avoid any duplicated code fragments in each class
     */
}
