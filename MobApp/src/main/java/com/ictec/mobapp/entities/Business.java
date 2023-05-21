package com.ictec.mobapp.entities;

import jakarta.persistence.*;

@Entity
public class Business {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private  String phone;

    @OneToOne(cascade = {CascadeType.ALL})
    private address add;

    @OneToOne(cascade = {CascadeType.ALL})
    private location loc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public address getAdd() {
        return add;
    }

    public void setAdd(address add) {
        this.add = add;
    }

    public location getLoc() {
        return loc;
    }

    public void setLoc(location loc) {
        this.loc = loc;
    }
}
