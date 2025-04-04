package model.entities;

import java.util.ArrayList;
import java.util.List;


/**
 * Represents a Company that manages a collection of employees.
 * Provides methods to add and remove employees and list their information.
 */
public class Company {

	// List to store all employees in the company
	private List<Employee> employees = new ArrayList<Employee>();
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		employees.remove(emp);
	}
	
	/**
     * Prints a formatted list of all employees in the company.
     * Uses the overridden toString() method of each Employee instance.
     */
	public void listing() {
		System.out.println("----------------------");
		System.out.println("Employees: ");
		System.out.println();
		for(Employee x : employees) {
			System.out.println(x);
		}
	}
}
