package com.example.layeredarchitecture.model;

import java.text.DateFormat;
import java.time.LocalDate;

public class SearchDTO {
    String id;
    String name;
    String address;
    String oId;
    LocalDate date;

    public SearchDTO() {
    }

    public SearchDTO(String id, String name, String address, String oId, LocalDate date) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.oId = oId;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SearchDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", oId='" + oId + '\'' +
                ", date=" + date +
                '}';
    }
}
