package com.example.demo.Service;

import com.example.demo.Repository.DepartmentRepository;
import com.example.demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClass {
    @Autowired
   private DepartmentRepository departmentRepository;
    @Autowired
   private EmployeeRepository employeeRepository;

    private List fetchDataLeftJoin(){
    return departmentRepository.fetchEmpDepartmentDataLeftJoin();
    }

    private List fetchDataInnerJoin(){
    return  employeeRepository.fetchEmpDeptDataInnerJoin();
    }
}
