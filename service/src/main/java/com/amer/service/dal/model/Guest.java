package com.amer.service.dal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Guest generated by hbm2java
 */
@Entity
@Table(name="guest"
        ,catalog="guests"
)
public class Guest  implements java.io.Serializable {


    private Long guestId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;

    public Guest() {
    }

    public Guest(String firstName, String lastName, String emailAddress, String address, String country, String state, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.address = address;
        this.country = country;
        this.state = state;
        this.phoneNumber = phoneNumber;
    }

    @Id @GeneratedValue(strategy=IDENTITY)


    @Column(name="GUEST_ID", unique=true, nullable=false)
    public Long getGuestId() {
        return this.guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }


    @Column(name="FIRST_NAME", length=64)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    @Column(name="LAST_NAME", length=64)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Column(name="EMAIL_ADDRESS", length=64)
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    @Column(name="ADDRESS", length=64)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Column(name="COUNTRY", length=32)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Column(name="STATE", length=12)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Column(name="PHONE_NUMBER", length=24)
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}

