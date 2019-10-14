package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//EmployeeDaoJdbcTemplate employeeDaoJT = (EmployeeDaoJdbcTemplate) ctx.getBean("employeeDaoJT");
		//System.out.println(employeeDaoJT.getEmpById(101));
		//System.out.println(employeeDaoJT.getAllEmp());
		//System.out.println(employeeDaoJT.saveEmployee(new Employee(105,"Suresh",10000)));
		//System.out.println(employeeDaoJT.updateEmployee(new Employee(105,"Ramesh",200000)));
		//System.out.println(employeeDaoJT.deleteEmployee(105));
//		for(int i=0;i<10;i++){
//			System.out.println(employeeDaoJT.saveEmployee(new Employee(i,"Suresh"+i,10000+i)));
//		}
//		System.out.println(employeeDaoJT.getAllEmp());
		
		EmployeeDaoPreparedStatement employeeDaoPS =  (EmployeeDaoPreparedStatement) ctx.getBean("employeeDaoPS");
		System.out.println(employeeDaoPS.saveEmployeeByPreparedStatement(new Employee(10001,"Kish",20000)));
		
	}

}
