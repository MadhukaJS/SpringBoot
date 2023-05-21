package com.ictec.mobapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class location {
    @Id
    @GeneratedValue
    private long id;
    private String line_1;
    private String line_2;

    public String getLine_1() {
        return line_1;
    }

    public String getLine_2() {
        return line_2;
    }

    public void setLine_1(String line_1) {
        this.line_1 = line_1;
    }

    public void setLine_2(String line_2) {
        this.line_2 = line_2;
    }
}
