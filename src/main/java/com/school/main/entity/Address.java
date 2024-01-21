package com.school.main.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @UuidGenerator
    private String addressId;
    //(cascade = CascadeType.ALL)
//    @JoinColumn(name = "FK_studentId", referencedColumnName = "studentId")
//    @OneToOne //(mappedBy = "address")
//    @MapsId
//    private Student student;
    private String addressLine1;
    private String city;
    private String state;
    private String country;



    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
