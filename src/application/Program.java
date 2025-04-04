package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Company;
import model.entities.Developer;
import model.entities.Employee;
import model.entities.Manager;

/**
 * Main application class that runs the program.
 * It collects input from the user to create and register employees
 * (either Developers or Managers) in a Company, and displays a summary.
 */
public class Program {

	public static void main(String[] args) {
		
		// Set default locale to US for consistent number formatting
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Create a new Company instance
		var comp = new Company();
		
		// Prompt the user for the number of employees to register
		System.out.print("How many employees? ");
		int n = sc.nextInt();
		
		// Loop to register each employee
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("---------------------");
			
			
			// Ask for employee type
			System.out.print("Manager or Dev? ");
			String position = sc.nextLine().toUpperCase();
			
			// Collect common data: name and base salary
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Base salary: ");
			double salary = sc.nextDouble();
			
			// Conditional logic based on employee type
			if(position.equals("DEV")) {
				System.out.print("Do you have a certificate (y/n)? ");
				char answer = sc.next().toUpperCase().charAt(0);
				boolean certificate;
				if(answer == 'Y') {
					certificate = true;
				}
				else {
					certificate = false;
				}
				
				// Create Developer and add to company
				Employee developer = new Developer(name, salary, certificate);
				comp.addEmployee(developer);
				System.out.println(developer);
			}
			else {
				// Create Manager and add to company
				Employee manager = new Manager(name, salary);
				comp.addEmployee(manager);
				System.out.println(manager);
			}
		}
		
		// Display the list of all employees in the company
		comp.listing();
		
		sc.close();

	}

}
