package tech.getarrays.employeemanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.getarrays.employeemanager.entity.Employee;
import tech.getarrays.employeemanager.service.EmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

   
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employees = employeeService.findAllEmployees();
        return ResponseEntity.ok(employees);  // This is equivalent to returning a 200 OK status.
    }

    @GetMapping("/find/id")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
       Employee employees = employeeService.findEmployeeById(id);
        return ResponseEntity.ok(employees);  // This is equivalent to returning a 200 OK status.
    }
    
    @PostMapping("/add")
    public ResponseEntity <Employee> addNewEmployee(@RequestBody Employee employee){
        Employee newEmployee  = employeeService.AddEmployee(employee);
        return new  ResponseEntity<>(newEmployee , HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity <Employee> updateEmployee(@RequestBody Employee employee){
        Employee updateEmployee  = employeeService.UpdataEmployee(employee);
        return new  ResponseEntity<>(updateEmployee , HttpStatus.CREATED);
    }

    @DeleteMapping("/employee/ {id}")
    public ResponseEntity<?> deleteEmployeeById(@PathVariable("id") Long id) {
       employeeService.deleteEmployeeById(id);
       return ResponseEntity.ok(HttpStatus.OK);  // This is equivalent to returning a 200 OK status.
    }
 
    

    
    
   


}
