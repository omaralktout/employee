package tech.getarrays.employeemanager.reposetry;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{



}
