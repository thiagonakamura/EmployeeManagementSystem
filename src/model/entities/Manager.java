package model.entities;

/**
 * Represents a Manager employee.
 * Inherits from the abstract Employee class and applies a bonus to the base salary.
 */
public class Manager extends Employee{

	public Manager(String name, Double baseSalary) {
		super(name, baseSalary);
	}

	/**
    * Calculates the manager's total salary.
    * Managers receive a 20% bonus on top of their base salary.
    */
	@Override
	double calculateSalary() {
		return getBaseSalary() + getBaseSalary() * 0.2;
	}
}
