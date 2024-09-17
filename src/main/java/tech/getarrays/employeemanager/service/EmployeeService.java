package tech.getarrays.employeemanager.service;


import org.springframework.stereotype.Service;

import tech.getarrays.employeemanager.Exceotions.UserNotFoundException;
import tech.getarrays.employeemanager.entity.Employee;
import tech.getarrays.employeemanager.reposetry.EmployeeRepo;
import java.util.List;
import java.util.UUID;



@Service
public class EmployeeService {


    private final EmployeeRepo employeeRepo;

    public EmployeeService (EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    public Employee AddEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findById(id).orElseThrow(()-> new UserNotFoundException("User by Id" + id + "Was Not found"));
    }
    public Employee UpdataEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public void deleteEmployeeById(Long id){
        employeeRepo.deleteById(id);
    }

  

}
