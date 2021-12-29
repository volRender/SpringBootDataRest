package com.litvishko.spring_boot_data_rest.spring_boot_data_rest.dao;





import com.litvishko.spring_boot_data_rest.spring_boot_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
