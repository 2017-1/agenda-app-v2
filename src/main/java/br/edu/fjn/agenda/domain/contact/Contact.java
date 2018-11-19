/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.agenda.domain.contact;

import java.util.UUID;

/**
 *
 * @author leonardo
 */
public class Contact {
    
    private String code;
    private String name;
    private String phoneNumber;
    private Address address;

    public Contact() {
        this.code = UUID.randomUUID().toString();
    }

    public Contact(String name, String phoneNumber) {
        this();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
