package com.upc.idss.practical.winerecomender.idssbe;

public class Wine {
    private String country;
    private String keywords;
    private String priceMin;
    private String priceMax;

    public Wine(String country, String keywords, String priceMin, String priceMax) {
        this.country = country;
        this.keywords = keywords;
        this.priceMin = priceMin;
        this.priceMax = priceMax;
    }

    public Wine() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(String priceMin) {
        this.priceMin = priceMin;
    }

    public String getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(String priceMax) {
        this.priceMax = priceMax;
    }
}
