package com.example.demo.Repository;

import com.example.demo.Entities.Department;
import com.example.demo.Entities.DepartmentEmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

// for right join
    @Query("SELECT new com.example.demo.Entities.DepartmentEmployeeDto(d.name, e.firstname,e.lastname, e.email, e.address) FROM Department d LEFT JOIN d.employees e ")
    List<DepartmentEmployeeDto> fetchEmpDepartmentDataLeftJoin();


    // for the left join
    @Query("SELECT new com.example.demo.Entities.DepartmentEmployeeDto(d.name, e.firstname,e.lastname, e.email, e.address) FROM Department d JOIN d.employees e ")
    List<DepartmentEmployeeDto> fetchEmpDepartmentDataRightJoin();
}
