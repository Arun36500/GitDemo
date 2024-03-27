package com.xebia.Collections;
 
import java.util.*;
 
public class TestCollection {
 
	static Employee employee=new Employee(100, "pbc") ;
	static Employee employee1=new Employee(100, "bbc1") ;
	static Employee employee2=new Employee(100, "abc") ;
	
	public static void main(String[] args) {
	   //Set<Employee> l=new HashSet<Employee>();
	     Set<Employee> l=new TreeSet<Employee>();
         // List<Employee> l=new ArrayList<Employee>();
       
           l.add(employee);
           l.add(employee1);
           l.add(employee2);
         
			/*
			 * for(int i=0;i<l.size();i++) {
			 * System.out.println(l.get(i).getId()+"   "+l.get(i).getName()); }
			 */
         
         for(Employee emp:l) {
        	 System.out.println(emp.getId()+"   "+emp.getName());
         }
         
         System.out.println("---------------------");
         //l.forEach(System.out::println);
         
     	l.forEach(item -> System.out.println(item.getId()+"   "+item.getName()));
		
		
	}
 
}
 