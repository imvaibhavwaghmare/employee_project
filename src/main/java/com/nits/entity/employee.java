package com.nits.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class employee {
	@Id
   private String employeeId;
   private String username;
   private String password;
   private long salary;
   private String department;
   private String status="inactive";
   private String role;
 
   @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SS")
   private Date createdDate;
    
   private String email;
   private String phone;
   private String gender;
   private String question;
   private String answer;
public employee() {
	super();
	// TODO Auto-generated constructor stub
}
public employee(String employeeId, String username, String password, long salary, String department, String status,
		String role, Date createdDate, String email, String phone, String gender, String question, String answer) {
	super();
	this.employeeId = employeeId;
	this.username = username;
	this.password = password;
	this.salary = salary;
	this.department = department;
	this.status = status;
	this.role = role;
	this.createdDate = createdDate;
	this.email = email;
	this.phone = phone;
	this.gender = gender;
	this.question = question;
	this.answer = answer;
}
public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
@Override
public String toString() {
	return "employeeData [employeeId=" + employeeId + ", username=" + username + ", password=" + password + ", salary="
			+ salary + ", department=" + department + ", status=" + status + ", role=" + role + ", createdDate="
			+ createdDate + ", email=" + email + ", phone=" + phone + ", gender=" + gender + ", question=" + question
			+ ", answer=" + answer + "]";
}
   
   
   
   
}
