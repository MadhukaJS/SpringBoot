package com.ictec.mobapp;

public class address {
    private String line_one;
    private String  line_two;
    private String state;
    private String city;
    private String country;

    public String getLine_one() {
        return line_one;
    }

    public String getLine_two() {
        return line_two;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }


    public void setLine_one(String line_one) {
        this.line_one = line_one;
    }

    public void setLine_two(String line_two) {
        this.line_two = line_two;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
