package com.example.demo.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="departments")
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="departmentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="departmenName")
    private String name;
    @Column(name="departmentCode")
    private String code;
    @Column(name="departmentDescription")
    private String description;
    @Column(name="departmentHead")
    private String departmentHead;
//declare a one to many relationship between department and employee
    @OneToMany(targetEntity = Employee.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<Employee> employees;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public Department setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Department setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Department setCode(String code) {
        this.code = code;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Department setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public Department setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
        return this;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public Department setEmployees(Set<Employee> employees) {
        this.employees = employees;
        return this;
    }
}
