package com.nits.controller;

import org.springframework.web.servlet.ModelAndView;

import com.nits.entity.employee;
import com.nits.service.employeeService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.*;


@Controller
public class employeeController {
	
	@Autowired
	employeeService service;
	@PostMapping (value="/saveEmp")
	public ResponseEntity<employee> saveEmp(@RequestBody employee emp){
		
		employee employee=service.saveEmp(emp);
		if(employee!=null) {
			return new ResponseEntity<>(employee,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
	
	
	@GetMapping (value="/getAllEmp")
	public ResponseEntity<List<employee>> getAllEmp(){
	List<employee> list=service.getAllEmp();
		
	if(list.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	else {
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
		}
	
	
	@GetMapping (value="/getEmployeeById/{id}")
	public ResponseEntity<employee> getEmployeeById(@PathVariable String id){
		
		employee emp=service.getEmployeeById(id);
		if(emp!=null) {
			return new ResponseEntity<>(emp,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		}

	
	@PutMapping (value="/updateEmployee")
	public ResponseEntity<employee> updateEmployee (@RequestBody employee employee) {
		employee emp=service.updateEmployee(employee);
		if(emp!=null) {
			return new ResponseEntity<>(emp,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		}
	
	}
	
	@DeleteMapping(value="/deleteEmployee/{id}")
	public  ResponseEntity<String> deleteEmployee(@PathVariable String id){
		boolean b=service.deleteEmployee(id);

        if(b) {
			return new ResponseEntity<>("Item deleted successfully", HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Item not found or error during deletion", HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(value="/loginProcess")
    public ModelAndView loginProcess(@ModelAttribute employee emp,HttpSession session) {
    	System.out.println(emp);
    	employee emp1=service.LoginProcess(emp);
		System.out.println("EMP ROLL NULL PROBLEM"+emp1);


    	if(emp1!=null) {
    		
    		session.setAttribute("username", emp1.getUsername());
    		session.setAttribute("employeeId", emp1.getEmployeeId());
    		session.setAttribute("role", emp1.getRole());
    		
    		session.setAttribute("status", emp1.getStatus());

    		return new ModelAndView("myIndex");    		
    	}
    	else {
    		return new ModelAndView("loginPage","Msg"," Information is incorrect.");
    		}
		}
	
	@PostMapping(value="/addEmployee")
    public ModelAndView addEmployee(@ModelAttribute employee emp, Model model) {
    	System.out.println("in insert api"+emp);
    	employee emp1=service.addEmployee(emp);
    	if(emp1!=null) {
    		return new ModelAndView("addEmployee","Msg","Employee Added Successfully");

    	}
    	else {
    		return new ModelAndView("addEmployee","Msg","Employee Already Exist");
    		}
		}
	

	
	

	@GetMapping (value="/employeeTable")
	public ModelAndView employeeTable( Model model){
	List<employee> list = service.employeeTable();
		
	
	for(employee emp:list) {
		System.out.println("HERE LIST OF EMPLOYEE"+emp);

	}

	return new ModelAndView("employeeTable","employees",list);

	}
	
	
	
	@RequestMapping(value="/deleteEmployeeById")
	public  String deleteEmployeeById(@RequestParam String eid){
		boolean b=service.deleteEmployeeById(eid);

        if(b==true) {
			return "redirect:/employeeTable";
		}
		else {
			return "redirect:/employeeTable";
		}
	}
	
	
	
	@GetMapping (value="/getEmployeeUsingId")
	public ModelAndView  getEmployeeUsingId(@RequestParam String eid,@RequestParam String msg,org.springframework.ui.Model model){

		
		employee emp1=service.getEmployeeUsingId(eid);
		
		if(!msg.equalsIgnoreCase("null")) {
			
			model.addAttribute("msg",msg);
		}
		model.addAttribute(emp1);
		
		
		return new ModelAndView("editEmployee");
		}

	
	@RequestMapping (value="/update_Employee")
	public ModelAndView update_Employee(@ModelAttribute employee employee) {
		
		System.out.println("BEFOR SENDING"+employee);

		employee emp=service.update_Employee(employee);
		
		System.out.println("AFTER SENDING"+emp);
		if(emp!=null) {
			
			System.out.println("AFTER ENTER IN IF BLOCK data"+emp);
			return new ModelAndView("redirect:/getEmployeeUsingId?eid="+emp.getEmployeeId()+"&msg=UPDATED");

		}
		else {
			return new ModelAndView("redirect:/getEmployeeUsingId?eid="+emp.getEmployeeId()+"msg=notUpdated");

		}
	}
	

	@RequestMapping(value="/logout")
	public String logout(@RequestParam String eid,HttpSession session) {
		
   service.logout(eid, session);
   
   return "loginPage";
	}
	
	
	
}
