package com.lbleds.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Strain {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private  String name= "default";
    private  String sativa_percentage="50";
    private String indica_percentage = "50";

    private Integer thc_percentage = 20;

    public int getThc_percentage() {
        return thc_percentage;
    }

    public void setThc_percentage(int thc_percentage) {
        this.thc_percentage = thc_percentage;
    }

    public Strain(long id, String name, String sativa_percentage, String indica_percentage) {
        this.id = id;
        this.name = name;
        this.sativa_percentage = sativa_percentage;
        this.indica_percentage = indica_percentage;
    }

    public Strain(String name, String sativa_percentage, String indica_percentage) {
        this.name = name;
        this.sativa_percentage = sativa_percentage;
        this.indica_percentage = indica_percentage;
    }

    public Strain(long id, String name, String sativa_percentage, String indica_percentage, int thc_percentage) {
        this.id = id;
        this.name = name;
        this.sativa_percentage = sativa_percentage;
        this.indica_percentage = indica_percentage;
        this.thc_percentage = thc_percentage;
    }

    public Strain(String name, String sativa_percentage, String indica_percentage, int thc_percentage) {
        this.name = name;
        this.sativa_percentage = sativa_percentage;
        this.indica_percentage = indica_percentage;
        this.thc_percentage = thc_percentage;
    }

    public Strain() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSativa_percentage() {
        return sativa_percentage;
    }

    public String getIndica_percentage() {
        return indica_percentage;
    }

    @Override
    public String toString() {
        return "Strain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sativa_percentage='" + sativa_percentage + '\'' +
                ", indica_percentage='" + indica_percentage + '\'' +
                ", thc_percentage=" + thc_percentage +
                '}';
    }
}
