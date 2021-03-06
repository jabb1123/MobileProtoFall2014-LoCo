package com.example.flymperopoulos.loco;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by dcelik on 10/10/14.
 */
public class User implements Serializable {
    String username, phonenumber;
    Double latitude, longitude;
    ArrayList<String> flag = new ArrayList<String>();
    ArrayList<String> requestConfirmed = new ArrayList<String>();

    public User(){}

    //Public Constructor to create a user
    public User(String name, String num, Double lat, Double lon){
        this.username = name;
        this.phonenumber = num;
        this.latitude = lat;
        this.longitude = lon;

    }

    /**
     * Get Fields
     */
    public String getName(){ return this.username; }

    public String getPhoneNumber() { return this.phonenumber;}

    public Double getLatitude() {return this.latitude;}

    public Double getLongitude() {return this.longitude;}

    public ArrayList<String> getFlag() {return this.flag;}

    public ArrayList<String> getRequestConfirmed() {return this.requestConfirmed;}

    /**
     * Set Fields
     */
    public void setName(String value){
        this.username = toTitleCase(value);
    }

    public void setPhoneNumber(String value){
        this.phonenumber = toTitleCase(value);
    }

    public void setLatitude(Double value){
        this.latitude = value;
    }

    public void setLongitude(Double value){
        this.longitude = value;
    }

    public void setFlag(ArrayList<String> list) {
        this.flag = list;
    }
    
    public void setRequestConfirmed(ArrayList<String> list) {
        this.requestConfirmed = list;
    }

    public void addToFlag(String u){
        if(!this.flag.contains(u)) {
            this.flag.add(u);
        }
    }

    public void addToRequestConfirmed(String u){
        if(!this.requestConfirmed.contains(u)) {
            this.requestConfirmed.add(u);
        }
    }
    public void removeFromFlag(String u){
        this.flag.remove(u);
    }

    public void removeFromRequestConfirmed(String u){
        this.requestConfirmed.remove(u);
    }


    /**
     * Title Case Method
     */
    public String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }
}

