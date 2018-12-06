package com.upc.idss.practical.winerecomender.idssbe;

public class Wine {
    private int country;
    //private String keywords;

    public Wine(int country) {
        this.country = country;
    }

    public Wine() {
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

}
