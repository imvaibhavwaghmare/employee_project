package com.nits.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nits.dao.employeeDao;
import com.nits.entity.employee;

import jakarta.servlet.http.HttpSession;
@Service
public class employeeService_impl implements employeeService {
	@Autowired
	employeeDao dao;
	@Override
	public employee saveEmp(employee emp) {
		// TODO Auto-generated method stub
String employeeId=new SimpleDateFormat("ddMMyyhhmmssss").format(new Date());
String CD=new SimpleDateFormat("yyyy-MM-dd").format(new Date());

try {
	Date createdDate=new  SimpleDateFormat("yyyy-MM-dd").parse(CD);
	emp.setCreatedDate(createdDate);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  

		emp.setEmployeeId(employeeId);

		employee emplyee=dao.saveEmp(emp);
		
		return emplyee;
		
	}

//	@Override
//	public List<employee> getAllEmp() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public employee getEmployeeById(String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public List<employee> getAllEmp() {
		// TODO Auto-generated method stub
		List<employee> list=dao.getAllEmp();
		
		return list;
	}

	@Override
	public employee getEmployeeById(String id) {
		employee emp=dao.getEmployeeById(id);
		// TODO Auto-generated method stub
		return emp;
	}
	
	@Override
    public employee updateEmployee(employee employee) {
		employee emp =dao.updateEmployee(employee);
		System.out.println(emp);
		return emp;
		
	}
	 public boolean deleteEmployee(String id) {
		 boolean b=dao.deleteEmployee(id);
		return b;
		 
	 }

	@Override
	public employee LoginProcess(employee emp) {
		
		employee emp1 =dao.LoginProcess(emp);
		return emp1;
		
		 
		
	}

	@Override
	public employee addEmployee(employee emp) {
		// TODO Auto-generated method stub
		String employeeId=new SimpleDateFormat("ddMMyyhhmmssss").format(new Date());
		String CD=new SimpleDateFormat("yyyy-MM-dd").format(new Date());

		try {
			Date createdDate=new  SimpleDateFormat("yyyy-MM-dd").parse(CD);
			emp.setCreatedDate(createdDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  

				emp.setEmployeeId(employeeId);
		

				employee emplyee=dao.addEmployee(emp);
				
				return emplyee;
	}

	@Override
	public List<employee> employeeTable() {
		// TODO Auto-generated method stub
		List<employee> list =dao.employeeTable();
		
		return list;

	}

	@Override
	public boolean deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		 boolean b=dao.deleteEmployeeById(id);
			return b;
	}

	
	@Override
	public employee getEmployeeUsingId(String id) {
		employee emp=dao.getEmployeeUsingId(id);
		// TODO Auto-generated method stub
		return emp;
	}

	@Override
	public employee update_Employee(employee employee) {
		// TODO Auto-generated method stub
		//employee emp =dao.update_Employee(employee);
		
		String CD=new SimpleDateFormat("yyyy-MM-dd").format(new Date());

		try {
			Date createdDate=new  SimpleDateFormat("yyyy-MM-dd").parse(CD);
			employee.setCreatedDate(createdDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employee emp =dao.update_Employee(employee);
		return emp;
	
	}

	@Override
	public void logout(String empId, HttpSession session) {
		// TODO Auto-generated method stub
		
		dao.logout(empId);
		session.invalidate();
	}

	
	

	

	
		
	

	
	
	
}
