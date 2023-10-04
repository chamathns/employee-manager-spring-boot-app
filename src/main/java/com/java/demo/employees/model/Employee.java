package com.java.demo.employees.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private String email;
    private String phone;
    private String address;

public Employee(String name, String email, String phone, String address) {

        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Employee() {

    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        return this.name.equals(other.name) &&
                this.email.equals(other.email) &&
                this.phone.equals(other.phone) &&
                this.address.equals(other.address);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.email.hashCode() + this.phone.hashCode() + this.address.hashCode();
    }

    @Override
    public String toString() {
     // return a JSON representation of the object
        return "{ id: " + id + ", name: " + name + ", email: " + email + ", phone: " + phone + ", address: " + address + " }";
    }
}
