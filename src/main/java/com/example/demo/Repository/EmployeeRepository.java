package com.example.demo.Repository;


import com.example.demo.Entities.DepartmentEmployeeDto;
import com.example.demo.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //INNER JOIN
    @Query("SELECT new com.example.demo.Entities.DepartmentEmployeeDto(d.name, e.firstname, e.lastname, e.email, e.address) "
            + "FROM Department d INNER JOIN d.employees e")
    List<DepartmentEmployeeDto> fetchEmpDeptDataInnerJoin();


    //CROSS JOIN
    @Query("SELECT new com.example.demo.Entities.DepartmentEmployeeDto(d.name, e.firstname, e.lastname, e.email, e.address) "
            + "FROM Department d, Employee e")
    List<DepartmentEmployeeDto> fetchEmpDeptDataCrossJoin();
}
