package com.nits.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.nits.entity.employee;

import jakarta.servlet.http.HttpSession;

public interface employeeDao {
public employee saveEmp(employee emp);
	
	public List<employee> getAllEmp();
	
    public employee getEmployeeById(String id);
  
    public employee updateEmployee(employee employee); 
    public boolean deleteEmployee(String id);
    
    public employee LoginProcess( employee emp);
    public employee addEmployee(employee emp);

    public List<employee> employeeTable();

    public  boolean deleteEmployeeById(String id);
    
    public employee  getEmployeeUsingId( String id);
    
    public employee update_Employee(employee employee); 

    public void logout(String empId); 

    
}
