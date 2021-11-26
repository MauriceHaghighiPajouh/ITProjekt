package models;

import java.lang.*;

public class Charakter {

    //Attribute

    private String name;
    private double geld;
    private double pegel;
    private int gesamtwert;


    //Konstruktor
    public Charakter(String name, double geld, double pegel, int gesamtwert) {
        this.name = name;
        this.geld = geld;
        this.pegel = pegel;
        this.gesamtwert = gesamtwert;

        //get
    }




    public String getName() {
        return name;
    }

    public double getGeld() {
        return geld;
    }

    public double getPegel() {
        return pegel;
    }

    public int getHitpoints() {
        return gesamtwert;
    }
    //set

    public void setName(String name) {
        this.name = name;
    }

    public void setGeld(double geld) {
        this.geld = geld;
    }

    public void setPegel(double pegel) {
        this.pegel = pegel;
    }

    public void setHitpoints(int gesamtwert) {
        this.gesamtwert = gesamtwert;
    }

    public int kauf;
    public int schutzwesteKaufen(int kauf){
        setGeld(geld-50);


        return kauf;
    }

    public int pistoleKaufen(int kauf){
        setGeld(geld-100);
        return kauf;
    }

    }










