package com.example.hp.assignment2custonadapter.model;

/**
 * Created by hp on 10/2/2017.
 */

public class MyContacts {
    private String name;
    private String phone;
    private boolean gender;

    public MyContacts(String name, String phone, boolean gender) {
        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }

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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
