package com.example.demo.Entities;

public class DepartmentEmployeeDto {
    private  String employeeFirstName;
    private  String employeeLastName;
    private  String  employeeEmail;
    private  String employeeDepartment;
    private  String employeeAddress;

    public DepartmentEmployeeDto(String employeeFirstName, String employeeLastName, String employeeEmail, String employeeDepartment, String employeeAddress) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeEmail = employeeEmail;
        this.employeeDepartment = employeeDepartment;
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public DepartmentEmployeeDto setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
        return this;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public DepartmentEmployeeDto setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
        return this;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public DepartmentEmployeeDto setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
        return this;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public DepartmentEmployeeDto setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
        return this;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public DepartmentEmployeeDto setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
        return this;
    }
}
