package com.nits.controller;

import org.springframework.boot.Banner.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller

public class pageController {
	
	//@ResponseBody
	@RequestMapping(value="/getPage")
	public String getloginPage() {
		
		
		return "loginPage";
		
	}
	
	@RequestMapping(value="/getHomePage")
	public String getHomePage(HttpSession session, Model model) {
		String status=(String)session.getAttribute("status");
		if(status!=null) {
			return "myIndex";
		}
		else {
		model.addAttribute("msg","please login first");
		return "loginPage";
		}
	}
	
	
	
	@RequestMapping(value="/addEmployee")
	public String addEmployee(HttpSession session, Model model) {
		
		String status=(String)session.getAttribute("status");
		if(status!=null) {
			return "addEmployee";
		}
		else {
		model.addAttribute("Msg","please login first");
		return "loginPage";
		}
	}
		
		
		
	
	
	@RequestMapping(value="/employeeTable")
	public String employeeTable(HttpSession session, Model model) {

		String status=(String)session.getAttribute("status");
		if(status!=null) {
			return "employeeTable";
		}
		else {
			model.addAttribute("msg","please login first");
			return "loginPage";
			}
		
		
	}
	
	@RequestMapping(value="/editEmployee")
	public String editEmployee(HttpSession session, Model model) {
		String status=(String)session.getAttribute("status");
		if(status!=null) {
			return "editEmployee";
		}
		else
           {
			model.addAttribute("msg","please login first");
			return "loginPage";
			}
		
		
	}
	
	
	
	
	
}
