package com.upc.idss.practical.winerecomender.idssbe;

public class Wine {
    private int country;
    private String keywords;

    public Wine(int country, String keywords) {
        this.country = country;
        this.keywords = keywords;
    }

    public Wine() {
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
