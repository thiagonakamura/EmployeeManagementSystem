package model.entities;

/**
 * Abstract base class representing a generic employee.
 * It encapsulates common attributes and behaviors shared across all types of employees.
 */
public abstract class Employee {

	private String name;
	private Double baseSalary;
	
	public Employee(String name, Double baseSalary) {
		super();
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	/**
     * Abstract method for calculating the employee's final salary.
     * Subclasses must provide their own implementation.
     */
	abstract double calculateSalary();

	
    // Returns a string representation of the employee, including their name and calculated salary.
	@Override
	public String toString() {
		return name + " - $" + String.format("%.2f", calculateSalary());
	}
	
	
}
