package com.example.demo.Entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="EmployeeId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name="FirstName")
    private  String firstname;
    @Column(name="LastName")
    private  String lastname;
    @Column(name="Email")
    private  String email;
    @Column(name="Address")
    private  String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departmentId" , insertable = false , updatable =false )
    @Fetch( FetchMode.JOIN)
private Department department;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public Employee setId(long id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public Employee setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Employee setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    public Department getDepartment() {
        return department;
    }

    public Employee setDepartment(Department department) {
        this.department = department;
        return this;
    }
}
