package com.nits.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nits.entity.employee;

import jakarta.servlet.http.HttpSession;
@Repository
public class employeeDao_impl implements employeeDao {
	 @Autowired
     SessionFactory sessionfactory;
	@Override
	public employee saveEmp(employee emp) {
		// TODO Auto-generated method stub
		System.out.println("in dao emp="+emp);
		employee empl=null;
		Session session=sessionfactory.openSession();
		Transaction transaction= session.beginTransaction();
		
		try {
			session.save(emp);
			 transaction.commit();
			 empl=emp;
		}
		catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();//function to print exception
			System.out.println(e);
		}
		finally {
			session.close();
		}
		return empl; 
		
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
		List<employee> lst=null;
		Session session=sessionfactory.openSession();
		try {
			Query qr =session.createQuery("from employee");
			 List<employee> list =qr.list();
			 lst=list;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return lst;
	}

	@Override
	public employee getEmployeeById(String id) {
		Session session=sessionfactory.openSession();
         employee emp=null;
         try {
        	 employee employee=session.get(employee.class, id); 
        	 emp=employee;
        	 
        	 
         }
         catch (Exception e) {
			
        	 e.printStackTrace();// TODO: handle exception
		}
         finally {
			session.close();
		}
		
	
		
		
		// TODO Auto-generated method stub
         return emp;
	}
	
	@Override
    public employee updateEmployee(employee employee) {
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
//		 employee  updateEmployee = null;
    
	        try {
	            employee updateEmployee = session.get(employee.class,employee.getEmployeeId());
	            System.out.println("updated employee"+updateEmployee);
	            if (updateEmployee!= null) {
	            updateEmployee.setUsername(employee.getUsername());
	            updateEmployee.setSalary(employee.getSalary());
	            updateEmployee.setPhone(employee.getPhone());	

	                session.update(updateEmployee);

	                tx.commit();
	            }
	        }
		catch (Exception e) {
		e.printStackTrace();	// TODO: handle exception
		}
		finally {
			session.close();
		}
		
		return employee;
		
	}
	
	 public boolean deleteEmployee(String id) {
		 
		 Session session=sessionfactory.openSession();
			Transaction tx=session.beginTransaction();
			boolean b=false;
			try {
				employee employee=session.get(employee.class, id); 
	        	
	        	 if(employee!=null) {
	     			session.delete(employee);
	     			tx.commit();
	     			b= true;
	     			}
	     			
	     			
	     		
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
				
			}
			
			finally {
				session.close();
			}

		 
		return b;
		 
	 }


	@Override
	public employee LoginProcess(employee emp) {
		// TODO Auto-generated method stub
		
		employee emp1=null;
		 Session session=sessionfactory.openSession();
		 Transaction tx=session.beginTransaction();
		 Query query =session.createQuery("from employee where username=:username AND password=:password");
		
		 query.setParameter("username", emp.getUsername());
		 query.setParameter("password",emp.getPassword());
		  List<employee> list=query.list();
		  if(!list.isEmpty()) {
			  emp1=list.get(0);
			  emp1.setStatus("active");
			  session.update(emp1);
			  tx.commit();
			  
			  
		  }
		  else {
			  return emp1=null; 
		  }
		  return emp1;
		   
	}


	@Override
	public employee addEmployee(employee emp) {
		// TODO Auto-generated method stub
		employee empl=null;
		Session session=sessionfactory.openSession();
		Transaction transaction= session.beginTransaction();
			
			try {
				session.save(emp);
				 transaction.commit();
				 empl=emp;
			}
			catch (Exception e) {
				// TODO: handle exception
				//e.printStackTrace();//function to print exception
				System.out.println(e);
			}
			finally {
				session.close();
			}
			return empl; 
	}


	@Override
	public List<employee> employeeTable() {
		// TODO Auto-generated method stub
		List<employee> lst=null;
		Session session=sessionfactory.openSession();
		try {
			Query qr =session.createQuery("from employee");
			 List<employee> list =qr.list();
			 lst=list;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return lst;

	}


	@Override
	public boolean deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		 Session session=sessionfactory.openSession();
			Transaction tx=session.beginTransaction();
			boolean b=false;
			try {
				employee employee=session.get(employee.class, id); 
	        	
	        	 if(employee!=null) {
	     			session.delete(employee);
	     			tx.commit();
	     			b= true;
	     			}
	     			
	     			
	     		
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
				
			}
			
			finally {
				session.close();
			}

		 
		return b;
		 
	 }


	@Override
	public employee getEmployeeUsingId(String id) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
        employee emp=null;
        try {
       	 employee employee=session.get(employee.class, id); 
       	 emp=employee;
       	 System.out.println("CHECK EMP"+emp);
       	 
       	 
        }
        catch (Exception e) {
			
       	 e.printStackTrace();// TODO: handle exception
		}
        finally {
			session.close();
		}
		
	
		
		
		// TODO Auto-generated method stub
        return emp;
	}


	@Override
	public employee update_Employee(employee employee) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
	 employee  updateEmployee = null;
    
	        try {
	        //    employee update_Employee = session.get(employee.class,employee.getEmployeeId());
	           // System.out.println("updated employee"+update_Employee);
	           
	            	

	                session.update(employee);

	                tx.commit();
	                updateEmployee =employee;
	            
	        }
		catch (Exception e) {
		e.printStackTrace();	// TODO: handle exception
		}
		finally {
			session.close();
		}
		
		return updateEmployee;
		
	}


	@Override
	public void logout(String empId) {

		// TODO Auto-generated method stub
	employee emp=getEmployeeUsingId(empId);

	if (emp != null) {
	emp.setStatus("inactive");
	employee emp2=update_Employee(emp);
	}

	}


	

	


	
	

}
